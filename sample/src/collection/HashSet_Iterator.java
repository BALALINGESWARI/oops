package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet s=new HashSet();
		s.add(8);
		s.add(4);
		s.add(9);
		s.add(2);
		s.add(10);
		s.add(5);
		System.out.println(s);
		Iterator<Integer> i=s.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
	}

}
