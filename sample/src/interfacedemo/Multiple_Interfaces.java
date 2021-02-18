package interfacedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class date extends cdate {
	
	public void dcase() throws ParseException {
		
		System.out.println("Date Calculator"); 
		System.out.println("Press 1 Current Date b/w Your Enter Date");
		System.out.println("Press 2 custom Date");
		
		int num = hp.nextInt();

		switch(num)
	{
	
	case 1:
		System.out.println("Enter Date Format DD/MM/YYYY");
		long df =d.getTime();
			String	day1 =hp.next(); 
	    Date ds= f.parse(day1);
		 			 
		 long dfm = ds.getTime();
		 
		 long milli = Math.abs(df-dfm);

		 long daysc = (long) (milli / (86400000));
		  		 
		 //int tt = (1000*60*60*24);
		// System.out.println(tt);
		System.out.println(f.format(d)+" to "+day1);
		 
		 System.out.println("Total Days => "+daysc);
		break;
	case 2:
		System.out.println("Enter Date Format DD/MM/YYYY");
		
		String	day01 =hp.next(); 
	    Date ds1= f.parse(day01);			 
	    long df1 = ds1.getTime();
		
		System.out.println("Enter 2nd Date ");
		String	day02 =hp.next(); 
	    Date ds2= f.parse(day02);
		 			 
		 long dfm1 = ds2.getTime();
		 
		 long milli1 = Math.abs(df1-dfm1);

		 long days = (long) (milli1 / (86400000));
		 System.out.println(day01+" to "+day02);
		 System.out.println("Total Days => "+days);
			break;
						
			default:
				System.out.println("Invalid Input Try Again...");
				 date dd = new date();
				 dd.dcase();
		}
	}
}

class cdate{
	
	Date d = new Date();
	SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy" );
	Scanner hp = new Scanner(System.in);
	}

public class Multiple_Interfaces {
	
		public static void main(String[] args) throws ParseException  {
			
			
			date day = new date();
		 
			 day.dcase();
			
	}

}