package sample;
import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {10,20,30,40,50,60};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int key=sc.nextInt();
		int start=0,end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			if(arr[mid]==key)
			{
				System.out.println(key+" key is present in "+mid+" position");
				break;
				
			}
			else if(key>arr[mid])
			{
				start=mid+1;
			}
			else end=mid-1;
		}
		if(start>=end)
		{
			System.out.println("key is not present");
		}
		}

	
}
