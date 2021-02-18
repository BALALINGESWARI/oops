package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyArray_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(5);
		al.add("mango");
		al.add('c');
		al.add(true);
		al.add(5.78);
		al.add("Apple1");
		al.add("A1");
		al.add(false);
		al.add(9.89898);
		al.add("fgh");

		System.out.println(al);
		al.remove("mango");
		System.out.println(al.size());
		//al.removeAll(al);
		al.clear();
		System.out.println(al.size());
//		System.out.println(al);
//		System.out.println(al.isEmpty());
//		System.out.println(al.size());
//		System.out.println(al.indexOf("Apple"));
//		al.add(1,"bala");
//		al.clear();
//		System.out.println(al);
//		System.out.println(al.size());
//
	}

}
