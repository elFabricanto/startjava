public class Calculator {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int result = 0;
		char operator = '^';

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
			if (b == 0) {
				System.out.println("Деление на 0 запрещено");
			} else {
				result = a / b;
				System.out.println("Деление a на b: " + result);				
			}
		} else if (operator == '^') {
			result = 1;
			if ((a == 0) && (b == 0)) {
				System.out.println("Результат не определен");
			} else {
				for (int i = 0; i < b; i++) {
					result *= a;
				}	
				System.out.println("Возведение a в степень b: " + result);
			}
		} else if (operator == '%') {
			result = a % b;
			System.out.println("Остаток a от деления на b: " + result);
		}
	}
}