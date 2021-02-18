package array;

public class Find_the_Bw_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,7,9,11,7,2};
		

		for(int i=0;i<a.length-1;i++)
		{
			int no1=a[i];
			int no2=a[i+1];
			int big=no1>no2?no1:no2;
			int small=no1<no2?no1:no2;
			for(int j=small+1;j<big;j++)
			{
				System.out.print(" "+j);
				
			}
			System.out.println();
		}

	}

}
