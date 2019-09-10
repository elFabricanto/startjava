public class MyFirstGame {
	// Определим константы, необхоимые при генерации псевдослучайного числа
	public static int a = 35;
	public static int c = 21;
	public static int m = 101; // Модуль = 101, так как загаданное число находится в диапзоне [0, 100]
	public static int seed = 2;

	// Получение псевдослучайного числа
	public static int getRand() {
		seed = (a * seed + c) % m;
		return seed;
	}

	public static void main(String[] args) {
		int targetNumber = getRand();
		int playerNumber = 0;

		while (playerNumber <= targetNumber) {
			if (playerNumber != targetNumber) {
				System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер");
			} else {
				System.out.println("Вы угадали! " + playerNumber);
			}
			playerNumber++;
		}
	}
}