package array;

public class Exo13 {

	public static void main(String[] args) {
		int[] tab1 = { 4, 8, 7, 12 };
		int[] tab2 = { 3, 6 };
		int joke = 0;
		for (int i = 0; i < tab2.length; i++) {
			for (int j = 0; j < tab1.length; j++) {
				joke += tab2[i] * tab1[j];
			}
		}

		System.out.println(joke);
	}
}
