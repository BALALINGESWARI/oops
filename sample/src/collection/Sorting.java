package collection;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,87,45,34,10,24,89};
		Arrays.sort(arr);
		for(int i:arr)
			System.out.print(i+" ");
			System.out.println();
		String names[]= {"bala","blacky","parvathy","kani","lingeswari","sneha"};
		Arrays.sort(names);
		for(String s:names)
			System.out.print(s+" ");
		System.out.println();
		Comparator comp=new ComparatorDemo();
		Arrays.sort(names,comp);
		System.out.println("After sorting...");
		System.out.println();
		for(String s:names)
			System.out.print(s+" ");
		
	}

}
