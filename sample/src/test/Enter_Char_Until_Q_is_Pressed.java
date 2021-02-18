package test;

import java.util.Scanner;

public class Enter_Char_Until_Q_is_Pressed {

	public static void main(String[] args) {
			
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter:");
		char c=sc.next().charAt(0);
		if(c=='q')
		{
			
			break;
		}
		
			
	}

	}
}
