package collection;

import java.util.ArrayList;

public class LIFO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("red");
		al.add("blue");
		al.add("black");
		al.add("grey");
		System.out.println(al);
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.print(al.get(i)+" ");
		}

	}

}
