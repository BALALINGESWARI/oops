package array;

public class Merging_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40};
		int b[]= {50,60,70,80,90,100};
		int c[]=new int[a.length+b.length];
		int i;
		for( i=0;i<a.length;i++)
		{
			c[i]=a[i];
			//System.out.print(" "+c[i]);
			
		}
		int j=i,k=0;
		while(j<c.length)
		{
			c[j]=b[k];
			k++;
			j++;
			
		}
		for(int h=0;h<c.length;h++)
		{
			System.out.print(" "+c[h]);
		}

	}

}
