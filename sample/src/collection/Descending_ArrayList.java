package collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class Descending_ArrayList {

	public static void main(String[] args) {

		ArrayList <String>al=new ArrayList<String>();
		al.add("bala");
		al.add("karthi");
		al.add("vicky");
		al.add("satha");
		al.add("kani");
		al.add("parvathy");
		al.add("blacky");
		al.add("hhh");
		al.add(4,"index");
		//al.remove(3);
		System.out.println(al);
		TreeSet ts=new TreeSet();
		ts.addAll(al);
		System.out.println(ts);
		
		System.out.println(ts.descendingSet());
		
	}

}
