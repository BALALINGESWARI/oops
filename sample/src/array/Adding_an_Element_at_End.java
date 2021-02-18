package array;

public class Adding_an_Element_at_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {10,20,30,40,50};
		int len1=arr1.length;
		int no=60;
		int arr2[]=new int[len1+1];
		int len2=arr2.length;
		arr2[len2-1]=no;
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
			System.out.print(" "+arr2[i]);
		}
		System.out.println(" "+arr2[len2-1]);
		
		

	}

}
