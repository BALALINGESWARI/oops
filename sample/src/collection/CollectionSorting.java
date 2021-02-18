package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList al=new ArrayList();
//		al.add("b");
//		al.add("x");
//		al.add("a");
//		al.add("o");
//		al.add("s");
//		System.out.println(al);
//		Collections.sort(al);
//		System.out.println(al);
//		
		Laptop dell=new Laptop("amd",30000,8,true);
		Laptop lenovo=new Laptop("intel",40000,6,false);
		Laptop hp=new Laptop("amd pro",20000,10,true);
		
		ArrayList al=new ArrayList();
		al.add(dell);
		al.add(lenovo);
		al.add(hp);
		System.out.println(al);
		Collections_Compare_demo comp=new Collections_Compare_demo();
		Collections.sort(al, comp);
		System.out.println("After sorting: "+al);
		
	}

}
