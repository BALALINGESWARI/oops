package string;

public class Blank_And_Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("bala");
		String s2="bala";
		char c=s1.charAt(3);
		System.out.println(c);
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.length());
		System.out.println(s2.isBlank());
		System.out.println(s1.isEmpty());
		if(s1.equals(s2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		

	}

}
