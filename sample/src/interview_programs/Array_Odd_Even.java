package interview_programs;

public class Array_Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 7, 9, 11, 4, 5, 2, 1, 0, -1, 3, 12 };
		int b[] = new int[a.length];
		int c[] = new int[a.length];
		int d[] = new int[a.length];

		int x = 0, y = 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] % 2 != 0) && (a[i] != 0)) {
				b[x] = a[i];
				x++;
			} else if (a[i] != 0) {
				c[y] = a[i];
				y++;
			}

		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		for (int i = 0; i < a.length; i++) {
			if (b[i] > c[i]) {

				d[i] = b[i] + c[i];

			}
			if (b[i] < c[i]) {
				d[i] = b[i] - c[i];
			}
		}
		System.out.println();
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}

	}

}
