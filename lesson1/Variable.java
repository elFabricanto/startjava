public class Variable {
	public static void main(String[] args) {
		byte coreCount = 2;
		short cacheLevelTwoPerCore = 256;
		int cacheLevelThree = 4;
		long uuid = 21321388201234l;
		float coreSpeed = 2.9f;
		double diagonal = 13.333333333333333;
		char rev = 'i';
		boolean isNewModel = false;

		System.out.println("Количество ядер: " + coreCount);
		System.out.println("Кэш 2 уровня на каждое ядро: " + cacheLevelTwoPerCore);
		System.out.println("Кэш 3 уровня: " + cacheLevelThree);
		System.out.println("Идентификатор устройства: " + uuid);
		System.out.println("Скорость процессора: " + coreSpeed);
		System.out.println("Диагональ дисплея: " + diagonal);
		System.out.println("Версия модели: " + rev);
		System.out.println("Новая модель: " + isNewModel);
	}
}