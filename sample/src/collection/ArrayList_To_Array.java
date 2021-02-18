package collection;

import java.util.ArrayList;

public class ArrayList_To_Array {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(2);
		al.add(5);
		al.add(98);
		al.add(65);
		al.add(67);
		System.out.println(al);
		int a[]=new int[al.size()];
		for(int i=0;i<al.size();i++)
		{
			a[i]=(int) al.get(i);
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
		
	}

}
