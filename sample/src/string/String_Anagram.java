package string;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {

		String s1 = "She    Is BaLA  ";
		s1=s1.replace(" ", "");
		s1=s1.toLowerCase();
		System.out.println("Convert into lowercase and trim spaces");
		System.out.println(s1);
		String s2 = "Is ShE bAlA";
		s2=s2.replace(" ", "");
		s2=s2.toLowerCase();
		System.out.println(s2);
		System.out.println();
		char c[] = s1.toCharArray();
		char d[] = s2.toCharArray();
		char temp;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}

		}
		
		
		char temp1;
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i] > d[j]) {
					temp1 = d[i];
					d[i] = d[j];
					d[j] = temp1;
				}
			}

		}
		System.out.println("String One: ");
		int l, k; // silent//listen
		for (k = 0; k < c.length; k++) {
			System.out.print(c[k]);
		}
		System.out.println();
		System.out.println("String Two: ");
		for (l = 0; l < d.length; l++) {
			System.out.print(d[l]);
		}

		System.out.println();
		
	boolean check=Arrays.equals(c, d);

	if (check==true) {
		System.out.println(s1+" and "+ s2+" are Anagram");

	} else {
	System.out.println(s1+" and "+ s2+" are Not Anagram");
}
}
}