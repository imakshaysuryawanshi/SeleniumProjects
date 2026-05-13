
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// String is a object, represent sequence of characters
// String literal
		String s = "Akshay Suryawanshi Pune";
		String s1 = "Akshay Suryawanshi"; // For this won't create memory since already has 's' in memory
		
// String with new memory allocate operator
		
		String s3 = new String ("Akshay");
		String s4 = new String ("Akshay"); // For this will create new object in memory Space
	
		String[] splittedString = s.split(" ");
		String[] splittedString1 = s.split("Suryawanshi");
	System.out.println(splittedString1[0]);
	System.out.println(splittedString1[1]);
	//System.out.println(splittedString[2]);
	System.out.println(splittedString1[1].trim());
	
	for(int i =0; i<s.length(); i++)
	{
		System.out.println(s.charAt(i));
	}
	System.out.println("-----------------------------------------");
	
// String in Reverse
	for(int i = s.length()-1; i>=0; i--)
	{
		System.out.println(s.charAt(i));
	}
		
	
	}

	
}
