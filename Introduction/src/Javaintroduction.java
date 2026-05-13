
public class Javaintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		String name = "Akshay";		
		double dec = 10.01;
		boolean yn = true;
		
		System.out.println(num);
		System.out.println(name);
		System.out.println(dec);
		System.out.println(yn);
		
		System.out.println(num +" is My Number");
		
//Arrays -
		int[] arrNum = new int [6]; 
		arrNum[0] = 1;
		arrNum[1] = 2;
		arrNum[2] = 3;
		arrNum[3] = 9;
		arrNum[4] = 11;
		arrNum[5] = 16;
		
		int[] arNum = {1, 2, 3, 9, 99, 65, 100, 102 };
		
		String[] names = {"Akshay", "Suryawanshi", "Working", "Selemium", "om", "QA", "Anchor", "Anime"};
// For Loop
	
		for(int i=0; i<names.length; i++) {}
// Enhanced For Loop
		
		for(String n: names)
		{
			System.out.println(n);
			
		}
// If Else Conditions '%' is divide by
// Java - for int compare use '=='
		
	for(int i =0; i<arNum.length; i++ )
	{
// values divide by 2
//		if (arNum[i] % 2 == 0)
//		{
//			System.out.println(arNum[i]);
//		}
//		else
//		{
//			System.out.println(arNum[i] +" is not whole numbers");
//		}
		
// values multiple of 2, 
		if (arNum[i] % 2 == 0)
		{
			System.out.println(arNum[i]);
			break;
		}
		else
		{
			System.out.println(arNum[i] +" is not whole numbers");
		}
		
	}
			
			
	}

}
