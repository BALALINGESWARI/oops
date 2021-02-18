package array;

public class Intersection {

	public static void main(String[] args) {

		int a[]= {2,3,4,6,7,8};
		int b[]= {1,9,4,6,0,3};
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c[i]=a[i];
				}
			}
		}
		for(int k=0;k<c.length;k++)
		{
			System.out.print(c[k]+" ");
		}
		
		
	}

}
