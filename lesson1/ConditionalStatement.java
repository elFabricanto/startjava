public class ConditionalStatement {
	public static void main(String[] args) {
		int yourAge = 50;
		boolean areYouMale = false;
		boolean areYouFemale = true;
		float yourHeight = 1.6f;
		char yourNameBeginsWithM = 'I';
		char yourNameBeginsWithI = 'I';

		if (yourAge > 20) {
			System.out.println("Да вы старичек!");
		}

		if (areYouMale) {
			System.out.println("Да вы мужичек!");
		}

		if (areYouFemale) {
			System.out.println("Да вы девонька!");
		}

		if (yourHeight < 1.80) {
			System.out.println("Мелковаты вы");
		} else {
			System.out.println("Хороший рост");
		}

		if (yourNameBeginsWithM == 'M') {
			System.out.println("Ваше имя начинается с М. Поздравляем, Михаил!");
		} else if (yourNameBeginsWithI == 'I') {
			System.out.println("Ваше имя начинается с И. Поздравлем, Ирина!");
		} else {
			System.out.println("Как Ваше имя?");
		}
	}
}