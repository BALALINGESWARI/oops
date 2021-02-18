package test;

public class BODMAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9,b=7,c=4,d=13,e=24,f=5;
		System.out.println(a++ +b*c/d%e- --f);
		int g=a++;
		System.out.println(g);
		int h=c/d%e;
		System.out.println(h);
		int i=--f;
		System.out.println(i);
		 int e1 = a + +b + +c + d--; //9++7++4+13 
		 System.out.println(e1);
		 System.out.println(a+ +b);
		 System.out.println(a+" "+b);
		
	}

}
