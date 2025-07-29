package JavaPractise;

import java.util.Scanner;

public class methodOverriding {

	public static void main(String[] args) {
		
		overideMethod o=new overideMethod();
		o.add(5.5, 9.6);
		o.add(10,15);
		o.add("abc", "xyz");

	}
}
	class overideMethod {
		public int add(int x, int y)
		{
			
			//x=sc.nextInt();
			//y=sc.nextInt();
			int z=x+y;
			System.out.println("Addition is " +z); 
			return z;
			
		}
		public String add(String s ,String s1)
		{
		String z=s+s1;
		System.out.println("Addition is " +z); 
			return z;
		
		}
		public double add(double d ,double d2)
		{
			
			double z=d+d2;
			System.out.println("Addition is " +z); 
			return z;
			
		}
	}
	
