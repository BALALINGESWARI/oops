package homework;

public class Recursion {

	void m(int x) {
		System.out.print(x + " ");
		x--;
		if (x >= 1) {
			m(x);
		}
	}

	public static void main(String[] args) {

		Recursion re = new Recursion();
		re.m(10);
	}

}
