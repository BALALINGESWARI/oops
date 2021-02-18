package array;

public class Elements_left_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {60,10,20,30,40,50};
		int temp=arr[0],i;
		System.out.println("Shifted Array: ");
		for(i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
			System.out.print(" "+arr[i]);
		}
		
		System.out.println(" "+temp);
		

	}

}
