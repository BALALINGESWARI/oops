package array;

import java.util.Scanner;

public class TotalMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		Scanner sc=new Scanner(System.in);
		 int len=sc.nextInt();
		 int marks[]=new int[len];
		 for(int i=0;i<len;i++)
		 {
			 System.out.println("Please Enter the mark: ");
			 marks[i]=sc.nextInt();
			 total=total+marks[i];
			 
		 }
		 System.out.println("Total of the marks :"+total);
		 System.out.println("Average of marks: "+(total/len));
		 
		sc.close();

	}

}
