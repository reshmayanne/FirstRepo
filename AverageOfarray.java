package JavaPractise;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfarray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
System.out.println("Enter the size of array");
		
		int[] array=new int[sc.nextInt()];
		int sum=0;
		double avg=0;
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter array Element at index position at->" +i);
			array[i]=sc.nextInt();
			 //sum=sc.nextInt()+array[i];
			sum=sum+array[i];
				
			
		}
		//sum=sum+sc.nextInt();
		System.out.println("Sum of array element is " +sum);
		 avg=sum/array.length;
		System.out.println("Array elements are " + Arrays.toString(array));
		System.out.println("Average of array element is " +avg);
	}

	}


