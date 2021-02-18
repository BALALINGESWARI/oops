package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		al.add(5);
		al.add(6);
		al.add(5);
		al.add(4);
		al.add(6);
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.addAll(al);
		System.out.println(lhs);
	}

}
