public class Calculator {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int result = 0;
		char operator = '/';

		if (operator == '+') {
			result = a + b;
			System.out.println("Сумма чисел: " + result);
		} else if (operator == '-') {
			result = a - b;
			System.out.println("Разница чисел (a - b): " + result);
		} else if (operator == '*') {
			result = a * b;
			System.out.println("Произведение чисел: " + result);
		} else if (operator == '/') {
			result = a / b;
			System.out.println("Деление a на b: " + result);
		} else if (operator == '^') {
			result = a;
			for (int i = 1; i < b; i++) {
				result *= a;
			}
			System.out.println("Возведение a в степень b: " + result);
		} else if (operator == '%') {
			result = a % b;
			System.out.println("Остаток a от деления на b: " + result);
		}
	}
}