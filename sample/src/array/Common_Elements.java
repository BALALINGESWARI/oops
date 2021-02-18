package array;

public class Common_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,8,56,11,23};
		int b[]= {56,43,9,8,46,11,99,10,7,12};
		//int len_a=a.length;
		//int len_b=b.length;
		
		//int small=len_a<len_b?len_a:len_b;
		//int c[]=new int[small];
		for(int i=0;i<a.length;i++)
		{

			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(" "+a[i]);
				}
			}
			//System.out.print(" "+c[i]);
		}
		
		
		

	}

}
