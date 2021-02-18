package array;

public class Return_Array_From_A_Method {
	  static int[] returnArray()
	 {
		return new int [] {12,89,78} ;
		 
	 }

	public static void main(String[] args) {
		 int a[]=returnArray();
		 int b[]=returnArray();
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+" ");
			 //System.out.println();
			 System.out.print(b[i]+" ");
		 }
		
	}
	 
}
