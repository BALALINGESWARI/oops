package sample;

public class DecimalToBinary {

	public static void main(String[] argssss) {
		// TODO Auto-generated method stub


		
		int no =2; 
		String rem=" ";
		int no1=no;

		while(no1<10)
				
		{
			no=no1;
		while(no>0)
		{
			rem=(no%2)+rem;
			no=no/2;
			
		}
		
		System.out.print(rem);
		
		no1++;
		}

	}

}
