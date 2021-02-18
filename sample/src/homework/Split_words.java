package homework;

public class Split_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am bala and i love java";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			
			System.out.println(i+1+"\t"+s1[i]+"\t"+(i+1));
			
		}

	}

}
