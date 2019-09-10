public class MyFirstGame {
	public static void main(String[] args) {
		int factor = 45;
		int summand = 21;
		int moduloOperand = 101; // Модуль = 101, так как загаданное число находится в диапзоне [0, 100]
		int seed = 2;

		int targetNumber = (factor * seed + summand) % moduloOperand;
		int playerNumber = (factor * targetNumber + summand) % moduloOperand;
		while (playerNumber != targetNumber) {
			if (playerNumber > targetNumber) {
				System.out.println("Введенное вами число (" + playerNumber + ") больше того, что загадал компьютер");
			} else {
				System.out.println("Введенное вами число (" + playerNumber + ") меньше того, что загадал компьютер");
			}
			playerNumber = (factor * playerNumber + summand) % moduloOperand;
		}
		System.out.println("Вы угадали число " + playerNumber);
	}
}