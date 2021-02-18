package array;

public class Second_largest_Number {

	public static void main(String[] args) {

		int a[]= {11,12,9,89,67,56};
		
		int max=0,smax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max; // 0   11   12
				max=a[i]; // 11  12   89
			}
			else if(a[i]>smax) // 12>11  67>12  56>67
			{
				smax=a[i]; // 12  67
			}
			
		}
		System.out.println("Maximum: "+max);
		System.out.println("Second Maximum: "+smax);
	}

}
