package string;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "india japan china";
		String[] sum = str.split(" ");
		String store = "";
		for (int i = 0; i < sum.length; i++) {
			// System.out.println(sum[i]);
			char[] c = sum[i].toCharArray();
			if (c[0] != 'i') {
				store = sum[i]+" "+store;
				System.out.println(store);
			}
		}
		System.out.println(store);
	}

}
