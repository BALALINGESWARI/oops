package collection;

import java.util.ArrayList;

public class TraverseArrayList {

	public static void main(String[] args) {

		ArrayList <String>al=new ArrayList<String>();
		al.add("bala");
		al.add("kani");
		al.add("parvathy");
		al.add("karthi");
		al.add("blacky");
		System.out.println(al);
		for(String a:al)
		{
			System.out.println(a);
		}
	}

}
