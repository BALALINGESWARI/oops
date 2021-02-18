package array;

public class Odd_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,8,0,9,6,5};
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				System.out.print(" "+a[i]);
				
			}
		}
		
		System.out.println();
		System.out.println("Stroing into another array");
		//Stroing into another array
		
		int arr[]= {4,7,9,8,7,6,4};
		int index[]=new int[arr.length/2];
		int i,j=0;
		for(i=1;i<arr.length;i+=2)
		{
			index[j]=arr[i];
			j++;
		}
		for(int k=0;k<index.length;k++)
		{
			System.out.print(" "+index[k]);
		}

	}

}
