package basics;

public class MultiplesOf3_And_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<50;i++)
		{
			if((i%3==0)&&(i%5==0))  //if((i%3==0)||(i%5==0))
			{
				System.out.print(i+" ");
			}
		}

	}

}
