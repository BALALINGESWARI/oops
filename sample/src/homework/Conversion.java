package homework;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int to string
		
		int i=101;
		String str=String.valueOf(i);
		System.out.println(str+101);
		
		
		//String to int
		String str1="100";
		int j=Integer.parseInt(str1);
		System.out.println(j+10);
		
		//Double to string
		
		double d=12.45;
		String strd=String.valueOf(d);
		System.out.println(strd+19.89);
		
		//String to double
		String strd1="19.890";
		double d1=Double.parseDouble(strd1);
		System.out.println(d1+10.00);
		
		
		//String to char[]
		String strc="bala lingeswari";
		char c[]=new char[strc.length()];
		for(int k=0;k<strc.length();k++)
		{
			c[k]=strc.charAt(k);
			System.out.print(c[k]);
		}
		
		//char[] to string
		System.out.println();
		char ch[]= {'b','a','l','a'};
		String strch=String.valueOf(ch);
		System.out.println(strch);
		
		
		//String to string[]
		
		String ba="bala bjjhjhjjjj";
		

	}

}
