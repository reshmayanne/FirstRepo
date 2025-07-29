package JavaPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoArray {

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		System.out.println("1st list element " +l1);
		
		List l2=new ArrayList();
		l2.add(5);
		l2.add(6);
		l2.add(7);
		l2.add(8);
		System.out.println("2nd list element " +l2);
		l2.addAll(l1);
		
		List l3=new ArrayList();
		l3.addAll(l2);
		Collections.sort(l3);
		System.out.println("3rd list element " +l3);
		
		System.out.println("Min list element " + Collections.min(l3));
	
		
		System.out.println("Max list element " + Collections.max(l3));
		Collections.reverse(l3);
		System.out.println("Reverse list element " +l3);
		//Collections.shuffle(l3);

		//System.out.println("Shufffle list element " +l3);
		

		System.out.println("Binary seach list element " + Collections.binarySearch(l2, 7));
		
		Collections.rotate(l3, 2);
		System.out.println("Reverse list element " +l3);
		Collections.disjoint(l2, l3);
		System.out.println("Disjoin method " +	Collections.disjoint(l2, l3));
		Collections.replaceAll(l2, 6, "six");
		System.out.println("Replaced list " +l2);
		
		
	
	}
	
	}


