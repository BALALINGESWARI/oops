package array;

public class Reversed_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {90,80,70,60,50,40};
		System.out.println("Before Reversed: ");
			for(int k=0;k<arr1.length;k++)
		{
			System.out.print(" "+arr1[k]);
		}
			System.out.println();
			
		int len1=arr1.length;
		int arr2[]=new int[len1];
		int j=len1-1;
		 int i=0;
		 while(i<arr1.length)
		 {
			 arr2[i]=arr1[j];
			 j--;
			 i++;
			
		 }
		 System.out.println("After Reversed: ");
		
		 for(int k=0;k<arr2.length;k++)
		 {
			 System.out.print(" "+arr2[k]);
		 }
		

	}

}
