package string;

public class Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]names= {"bala","parvathy","kani","sneha","bala","vicky","kani","malar","sneha"};
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i]==names[j])
				{
					names[j]="";
					
				}
				
			}
			System.out.print(" "+names[i]);
			
		}

	}

}
