package array;

public class Biggest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {29,87,67,56,90,89,35,67,9};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}

		System.out.println("Biggest Element: "+max);
	}

}
