package array;

public class NegativeElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,-8,7,-98,-45,98,7,-6};
		System.out.println("Negative Elements");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				System.out.print(" "+arr[i]);
			}
			
			
		}
		System.out.println();
		System.out.println("Without Negative Elements");
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>0)
			{
				System.out.print(" "+arr[j]);
			}
		}

	}

}
