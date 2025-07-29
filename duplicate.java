package JavaPractise;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class duplicate {

	public static void main(String[] args) {
		
		String str="asddass";
		
		int count=0;
		
		
		
	for(int i=0;i<str.length();i++)
	{
		for(int j=i+1;j<str.length();
				j++)
		{
			if(str.charAt(i)==str.charAt(j))
			{
			
				System.out.println("repeated charcters are " +str.charAt(i));
				break;
		}
	}

}
}
}