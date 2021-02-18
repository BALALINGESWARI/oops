package exception;

import java.util.Scanner;

public class Scenarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SCENARIO #1
		int a=9;
		int b=0;
		int c;
		try {
		 c=a/b;
		}
		catch(Exception e)
		{
			c=0;
			//System.out.println("please don't divide by zero");
			//e.printStackTrace();//red and blue
		System.out.println(e);//full blue
		}
		
		System.out.println("Thank You");
		System.out.println(c);
		
		/*
		//SCENARIO #2
		int d[]= {1,2,3};
		System.out.println(d[4]);
		*/
		
		
		/*
		//SCENARIO #3
		String s=null;
		System.out.println(s.length());
		*/
		
		
		/*
		//SCENARIO #4
		String s1="java";
		System.out.println(s1.charAt(4));
		*/
		
		/*
		//SCENARIO #5
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int ab=sc.nextInt();
		*/
		
		
		
		

	}

}
