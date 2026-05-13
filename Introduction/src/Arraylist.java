import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> arr = new ArrayList();
		
		arr.add("Akshay");
		arr.add("Suryawanshi");
		arr.add("Selenimum");
		arr.add("Chrome");
		arr.add("List---");
		//System.out.println(arr.get(2));
		
		for (int i=0; i<arr.size(); i++)
		{
		System.out.println(arr.get(i));	
		}		
// Enhanced for loop
		for(String a: arr)
		{
			System.out.println(a);
		}
		
// Test Present in ArrayList
		System.out.println(arr.contains("Selenimum"));
		String[] names = {"Akshay", "Suryawanshi", "Working", "Selemium", "om", "QA", "Anchor", "Anime"};
	List <String> namesArrayList = Arrays.asList(names);
	System.out.println(namesArrayList.contains("Working"));
	
	
	}

}
