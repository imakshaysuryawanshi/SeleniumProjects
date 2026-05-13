import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	private static final WebDriver WebDriver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Chrome*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay Suryawanshi\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akshay Suryawanshi\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver (); */
		
		/*Edge
		System.setProperty("webdriver.edge.drive", "C:\\Users\\Akshay Suryawanshi\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();*/
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//driver.switchTo().alert().dismiss();
		driver.close();
	}


}
