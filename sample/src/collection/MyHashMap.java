package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1995, "java");
		hm.put(1989, "python");
		hm.put(1989, "c#");
		hm.put(2020, "gowsik");
		hm.put(1700, "machine");
		hm.put(1998, "bala");
		
		hm.put(1999, "bala");
		System.out.println(hm);

	}

}
