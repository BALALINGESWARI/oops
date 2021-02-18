package array;

public class AdditionOfTwoDiffArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50,60};
		int b[]= {5,6,7};
		int a_len=a.length;
		int b_len=b.length;
		int bigarray=a_len>b_len?a_len:b_len;
		int smallarray=a_len<b_len?a_len:b_len;
		int c[]=new int[bigarray];
		int i;
		System.out.println("Addition: ");
		for( i=0;i<smallarray;i++)
		{
			c[i]=a[i]+b[i];
			
			System.out.print(" "+c[i]);
		}
		
		
		/*while(i<bigarray)
		{
			c[i]=a[i];
			i++;
			
			//System.out.print(" "+c[i]);
		}*/
		
		for(int j=i;j<bigarray;j++)
		{
			c[i]=a[j];
			System.out.print(" "+c[i]);
		}
		
		
		

	}

}
