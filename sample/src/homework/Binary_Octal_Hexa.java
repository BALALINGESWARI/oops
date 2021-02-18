package homework;

public class Binary_Octal_Hexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Decimal\t\t"+"Binary\t\t"+"Octal\t\t"+"Hexa\t\t");
		
		for(int i=0;i<=100;i++)
		{
			System.out.println(i+"\t\t"+Integer.toBinaryString(i)+"\t\t"+Integer.toOctalString(i)+"\t\t"+Integer.toHexString(i));
		}
	}

}
