package mutable_string;

public class SBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("payilagam chennai");
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.append(6));
		System.out.println(sb.replace(3, 6, "NEH"));
		StringBuffer sb1=new StringBuffer("Lokesh");
		System.out.println(sb1.replace(0, 1, "Y"));
		System.out.println(sb1.reverse());
		StringBuffer sb2=new StringBuffer("deepika");
		String str=sb2.toString();
		System.out.println(str);
		 String str1="deepikabala";
		 StringBuffer sbr=new StringBuffer(str1);
		 sbr.reverse();
		 System.out.println(sbr);
		
		
		
		

	}

}
