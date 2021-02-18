package collection;

import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add("Hari");
		ts.add("Prem");
		ts.add("Ram");
		ts.add("Sam");
		ts.add("Prem");
		ts.add("Karthick");
		ts.add("Pradeep");
		
		System.out.println(ts);
		System.out.println(ts.descendingSet()); //descending order
		
	}

}
