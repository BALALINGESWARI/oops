package interview_programs;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,7,5,6,3,2,8};
		int temp=0;
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=0;j<a.length-2;j++)
			{
				if(a[j]>a[j+2])
				{
					temp=a[j];
					a[j]=a[j+2];
					a[j+2]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
