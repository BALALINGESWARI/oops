package array;

public class Numbers_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,80,98,98,56,76,76,45,34,10,10,98,76};
		int search[]= {10,76,98};
		int count=0;
		for(int j=0;j<search.length;j++)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==search[j])
				{
					count++;
				}
			}
		}

		System.out.println(" Count: "+count);
	}

}
