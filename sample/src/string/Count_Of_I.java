package string;

public class Count_Of_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="imithiyaz";
		int count=0;
		//char ch[]=name.toCharArray();// i m i
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='i'||name.charAt(i)=='I')
			{
				count++;
			}
		}
		System.out.println("Count: "+count);
	}

}
