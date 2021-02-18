package homework;

public class Print_1_to_10_withoutLoop {

	private static int pri(int i) {
		if (i == 11) {
			return 0;
		}
		System.out.println(i);
		return pri(i = i + 1);
	}

	public static void main(String[] args) {
		int i = 1;
		pri(i);
		
	}

}
