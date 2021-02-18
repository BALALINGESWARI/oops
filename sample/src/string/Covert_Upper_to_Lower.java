package string;

public class Covert_Upper_to_Lower {

	public static void main(String[] args) {

		String name = "BAla LinGeSwAri";
		// System.out.println(name.toUpperCase());
		char c[] = name.toCharArray();
		for (int i = 0; i < c.length; i++) {
			char ch = c[i];
			int chh = (int) ch;

			if ((chh >= 97) && (chh <= 122)) {

				int ch2 = chh - 32;
				System.out.print((char) ch2);
			} else {
				if ((chh >= 65) && (chh <= 91)) {

					int ch2 = chh + 32;
					System.out.print((char) ch2);

				}

			}

		}

	}
}
