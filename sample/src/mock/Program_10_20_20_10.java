package mock;

public class Program_10_20_20_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,11,20,21,30,31,40,41,50,51};
		int temp=0;
		for(int i=0;i<a.length;i+=2)
		{

			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			
			System.out.print(" "+a[i]+" "+a[i+1]);
		}
		
		

	}

}
