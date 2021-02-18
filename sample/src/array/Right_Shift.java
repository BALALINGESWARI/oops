package array;

public class Right_Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,30,40,50,10};
		System.out.println("Before Right Shift: ");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(" "+arr[k]);
		}
		int i=arr.length-1;
		int tmp=arr[i];
		
		while(i>0)
		{
			arr[i]=arr[i-1];
			i--;
		}
		System.out.println();
		System.out.println("After Right Shift: ");
		arr[i]=tmp;
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(" "+arr[j]);
		}
	}

}
