package arraypracticeprograms;

public class Search_specific_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,3,6,7,2,0,67};
		int search=3;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println(search+" presents in "+i+" place");
				break;
			}
		}

	}

}
