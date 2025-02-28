package Array;

public class AddNumber {

	public static void main(String[] args) {
		int[] add = { 123, 321, 456, 654, 789, 987, 147, 741, 852, 258, 963, 369 };

		int sum = 0;

		for (int i = 0; i < add.length; i++) {
			sum = sum + add[i];

		}

		System.out.println(sum);

	}
}
