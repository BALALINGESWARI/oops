package array;

public class Left_Shift_Twice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {60,70,10,20,30,40,50};
		int tmp1=arr[0];
		int tmp2=arr[1];
		System.out.println("Before shifted array:");
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(" "+arr[j]);
		}
		System.out.println();
		System.out.println("After shifted array: ");
		int i=0;
		
		while(i<arr.length-2)
		{
			arr[i]=arr[i+2];
			i++;
			
		}
		arr[i]=tmp1;
		arr[i+1]=tmp2;
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(" "+arr[j]);
		}

	}

}
