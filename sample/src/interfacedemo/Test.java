package interfacedemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class Test {

	public static void main(String[] args) throws ParseException {
		String FromDate=("10/10/2021");
		String ToDate=("30/10/2021");
		SimpleDateFormat r = new SimpleDateFormat ("dd/MM/yyyy");
        
		Date D1 =r.parse(FromDate);
		 long date1=D1.getTime();
		 Date D2 = r.parse(ToDate);
		 long date2=D2.getTime();
		 
		 long mi = Math.abs(date1-date2);
		 long days = (long) (mi / (86400000));
		 float weeks= ((float)days/7);
		   
		 System.out.println(D1);
		 System.out.println(D2);
		 //System.out.println(mi);
		 
		 System.out.println();
		 System.out.println(days);
		 System.out.println();
		 System.out.println(weeks);
		 
		 //long dif =date1- date2;
		 //long days =dif/(1000*60*60*24) ;
	}

}
