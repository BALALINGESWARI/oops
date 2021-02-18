package arraypracticeprograms;

public class Acending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {89,76,90,45,1,9,0,56,34};
		int tmp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
					
					
				}
				
			}
			System.out.print(" "+a[i]);
		}
		

	}

}
