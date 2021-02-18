package simpleprograms;

public class Prime_First_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		while (count < 20) {
			for (int no = 2; no <= 100; no++) {

				boolean check = true;
				for (int div = 2; no > div; div++) {
					if (no % div == 0) {

						check = false;
						// count++;
						break;
					}
				}
				if (check == false) {
					// System.out.println( no+ " not prime");
				} else {
					count++;
					System.out.println(no + " is prime");
					System.out.println("Count: " + count);
				}
			}
		}

	}

}
