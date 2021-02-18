package collection;

import java.util.Comparator;

public class Collections_Compare_demo implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		
		int res=l1.brand.compareTo(l2.brand);
		if(res>0)
			return +3;
		else if(res<0)
			return -3;
		
		return 0;
	}

}
