public class Cycle {
	public static void main(String[] args) {
		int j = 6;
		int result = 0;
		int initNumber = 10;

		System.out.println("Все числа от 0 до 20:");
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		System.out.println("\nВсе числа от 6 до -6 с интервалом 2:");
		while (j >= -6) {
			System.out.println(j);
			j -= 2;
		}

		do {
			if (initNumber % 2 == 1) {
				result += initNumber;
			}
			initNumber++;
		} while (initNumber <= 20);
		System.out.println("\nСумма нечетных чисел от 10 до 20: " + result);
	}
}