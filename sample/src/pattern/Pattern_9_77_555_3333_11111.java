package pattern;

public class Pattern_9_77_555_3333_11111 {

	public static void main(String[] args) {

		 for(int i=9;i>=1;i-=2)
		 {
			 for(int space=1;space<i;space+=2)
			 {
				 System.out.print(" ");
			 }
			 for(int j=9;j>=i;j-=2)
			 {
				 System.out.print(i);
			 }
			 System.out.println();
		 }
	}

}
