package test;

public class No_Of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 112345, rem = 0, count = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			count++;
		}
		System.out.println(count);

	}

}
