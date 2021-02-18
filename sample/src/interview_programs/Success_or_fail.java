package interview_programs;

public class Success_or_fail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1234568;
		int rem=0,sum=0,count=0;
		int b=a%10;
		 a=a/10;
		 //System.out.println(a+" "+b);
		 while(a>0)
		 {
			 count++;
			 rem=a%10;
			 sum=sum+(rem*2);  
			 a=a/10;
		 }
		 System.out.println(sum+" "+count);
		 if((sum/count)==b)
		 {
			 System.out.println("SUCCESS");
		 }
		 else
		 {
			 System.out.println("FAIL");
		 }
		 
		

	}

}
