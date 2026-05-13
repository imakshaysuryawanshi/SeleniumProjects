package project01.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import project01.pageobjects.LoginPage;

public class BaseTest {
	public WebDriver driver;
	
	public WebDriver initilizeDriver() throws IOException {

		
		// properties class
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				(System.getProperty("user.dir")+"\\src\\main\\java\\project01\\resources\\GlobalData.properties"));
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("Edge"))
		{
			System.setProperty("WebDriver.edge.driver", "C:\\Users\\Akshay Suryawanshi\\Documents\\msedgedriver.exe");
			driver = new EdgeDriver()
;
			}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		return driver;
	}

	public LoginPage launchApplication() throws IOException	{
		
		driver = initilizeDriver();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.goTo();
		return loginPage;
	}

}
