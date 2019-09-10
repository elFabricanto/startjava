public class Cycle {
	public static void main(String[] args) {
		System.out.println("Все числа от 0 до 20:");
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int counter = 6;
		System.out.println("\nВсе числа от 6 до -6 с интервалом 2:");
		while (counter >= -6) {
			System.out.println(counter);
			counter -= 2;
		}

		counter = 10;
		int sumOdd = 0;
		do {
			if (counter % 2 == 1) {
				sumOdd += counter;
			}
			counter++;
		} while (counter <= 20);
		System.out.println("\nСумма нечетных чисел от 10 до 20: " + sumOdd);
	}
}