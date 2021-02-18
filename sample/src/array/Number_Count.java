package array;

public class Number_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,20,20,40,50,20,10,20,20};
		int count=0,no=20;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==no)
			{
				count++;
			}
		}
		System.out.println(" 20 presents "+count+" times");

	}

}
