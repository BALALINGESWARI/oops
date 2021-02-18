package array;

public class Ascending_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {87,7,56,98,45,34,78};
		int i,temp=0;
		System.out.println("Sorted Array: ");
		for( i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			System.out.print(" "+arr[i]);
			
		}
		System.out.println();
		
		System.out.println("Maximum: "+arr[arr.length-1]);
		System.out.println("Minimum: "+arr[0]);
		System.out.println("second maximum: "+arr[arr.length-2]);

	}

}
