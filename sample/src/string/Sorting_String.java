package string;

public class Sorting_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sortt= {"j","g","d","o","a","v","x"};
		String ch="";
		for(int k=0;k<sortt.length;k++)
			
		{
			ch=ch+sortt[k];
			
		}
		char cha[]=ch.toCharArray();
		
		char temp;
			
					 for(int i=0;i<cha.length;i++)
					 {
						 for(int j=i+1;j<cha.length;j++)
							 
						 {
							 if(cha[i]>cha[j])
							 {
								 temp=cha[i];
								 cha[i]=cha[j];
								 cha[j]=temp;
							 }
							
						 }
						 System.out.print(cha[i]+" ");
					 }
					 
					 
					
		

	}

}
