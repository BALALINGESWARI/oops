package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Covert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("red");
		al.add("blue");
		al.add("black");
		al.add("black");
		al.add("grey");
		System.out.println(al);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.addAll(al);
		System.out.println(lhs);
	
		HashSet hs=new HashSet();
		hs.addAll(al);
		System.out.println(hs);
		
		
	
		LinkedList ls=new LinkedList();
		ls.addAll(al);
		System.out.println(ls);
	
		
		TreeSet ts=new TreeSet();
		ts.addAll(al);
		System.out.println(ts);
		

	}

}
