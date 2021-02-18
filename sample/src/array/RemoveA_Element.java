package array;

public class RemoveA_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,20,45,30,40,50,60};
		int i;
		for(i=0;i<arr.length-1;i++)
		{
			
			if(arr[i]==45)
			{
				break;
			}
			System.out.println(arr[i]);
		}
		System.out.println("Index 2:"+i);
		
		for(int j=i;j<arr.length-1;j++)
		{
			arr[j]=arr[j+1];
			System.out.print(" "+arr[j]);
		}
	}

}
