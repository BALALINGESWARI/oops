package multidimentionalarray;

import java.util.Scanner;

public class Console_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A: ");
		int a=s.nextInt();
		System.out.println("Enter B: ");
		int b=s.nextInt();
		int c=a+b;
		System.out.println("Result: "+c);
		System.out.println("Enter char:");
		char ch=s.next().charAt(0);
		System.out.println("char:"+ch);
		System.out.println("Enter Name:");
		String st1=s.next();
		System.out.println("Word:"+st1);
		System.out.println("Enter sentence:");
		String st2=s.nextLine();
		System.out.println("Sentence: "+st2);
		int d=21;
		System.out.println("Binary:"+Integer.toBinaryString(d));
		System.out.println("Octal:"+Integer.toOctalString(d));
		System.out.println("Hexa:"+Integer.toHexString(d));

		
		
		
		

	}

}
