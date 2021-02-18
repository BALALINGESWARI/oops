package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_to_Collection {

	public static void main(String[] args) {
		
		String name[]= {"bala","kani","parvathy","blacky"};
		for(int i=0;i<name.length;i++)
		{
			System.out.print(name[i]+" ");
		}
		System.out.println();
		System.out.println("Array to Collection");
		List<String> l=Arrays.asList(name);
		for(String li:l)
		{
			System.out.print(li+" ");
		}

	}

}
