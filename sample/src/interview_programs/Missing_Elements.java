package interview_programs;

public class Missing_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,9,7,5,8,3};
		int temp=0,k;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("SORTING");		
		for( k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		System.out.println();
		int min=a[0];
		int max=a[k-1];
		int b[]=new int[a.length];
		for(int l=min;l<max;l++)
		{
			
			if(a[k]!=a[l])
			{
			System.out.print(l+" ");
			}
			
		}
		System.out.println();
		System.out.println("Maximum: "+a[k-1]);
		System.out.println("Second Maximum: "+(a[k-2]));
		System.out.println("Minimum: "+a[0]);
		System.out.println("Second Minimum: "+a[0+1]);

		

	}

}
