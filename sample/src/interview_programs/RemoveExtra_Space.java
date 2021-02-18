package interview_programs;

public class RemoveExtra_Space {
	public static void main(String[] args) {
		String str = "     the      payilagam    is    a     institute      ";
		String x = "";
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if ((c[i] >= 'a') && (c[i] <= 'z')) {
				x=x+c[i];
				//System.out.println(x);
				if (c[i + 1] == ' ') {
					x=x+ " ";
				}
			}
		}
		System.out.println(x);
		/*
		 * for (int i = 0; i < 100000; i++) { if (i == 5) { System.out.println(i); i =
		 * 100000; } }
		 */
	}
}