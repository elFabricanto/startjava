public class ConditionalStatement {
	public static void main(String[] args) {
		int yourAge = 50;
		if (yourAge > 20) {
			System.out.println("Да вы старичек!");
		}

		boolean isMale = false;
		if (isMale) {
			System.out.println("Да вы мужичек!");
		}

		boolean isFemale = true;
		if (isFemale) {
			System.out.println("Да вы девонька!");
		}

		float yourHeight = 1.6f;
		if (yourHeight < 1.80) {
			System.out.println("Мелковаты вы");
		} else {
			System.out.println("Хороший рост");
		}

		char yourNameBeginsWithM = 'I';
		char yourNameBeginsWithI = 'I';
		if (yourNameBeginsWithM == 'M') {
			System.out.println("Ваше имя начинается с М. Поздравляем, Михаил!");
		} else if (yourNameBeginsWithI == 'I') {
			System.out.println("Ваше имя начинается с И. Поздравлем, Ирина!");
		} else {
			System.out.println("Как Ваше имя?");
		}
	}
}