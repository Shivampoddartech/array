package Array;

public class Add {
	public static void main(String[] args) {
		int[] data = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum = sum + data[i];

		}
		System.out.println("sum " + sum);

	}
}
