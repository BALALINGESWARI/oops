package array;

public class Passing_Array_To_Method {

	public static void main(String[] args) {
		int a[]= {2,78,56,34,1};
		min(a);
	}

	private static void min(int[] arr) {
		
		//int min=Integer.MAX_VALUE;
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			
		}
		System.out.println(min);
	}

}
