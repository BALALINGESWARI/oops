package string;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1=new String("ramaiah");
		 char ch[]=s1.toCharArray();
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]=='a') 
			 {
				 ch[i]='@';
			 }
			 System.out.print(" "+ch[i]);
		 }
		
		

	}

}
