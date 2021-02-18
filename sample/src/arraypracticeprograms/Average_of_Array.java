package arraypracticeprograms;

public class Average_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {100,100,100,100,100};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println("Total: "+sum);
		System.out.println("Average: "+(sum/a.length));

	}

}
