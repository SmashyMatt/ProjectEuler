package euler;

public class EulerProblem017 {

	public static int answer() { // 1-1000
		int output = 0;
		for (int i = 1; i <= 1000; i++) {
			output += howManyLetters(i);
		}

		return output;
	}

	public static int howManyLetters(int input) {
		int inputLength = 0;

		if (input < 10) {
			switch (input) {
			case 1:
				inputLength = 3;// one
				break;
			case 2:
				inputLength = 3;// two
				break;
			case 3:
				inputLength = 5;// three
				break;
			case 4:
				inputLength = 4;// four
				break;
			case 5:
				inputLength = 4;// five
				break;
			case 6:
				inputLength = 3;// six
				break;
			case 7:
				inputLength = 5;// seven
				break;
			case 8:
				inputLength = 5;// eight
				break;
			case 9:
				inputLength = 4;// nine
				break;
			}

		} else if (input < 20) {
			switch (input) {
			case 10:
				inputLength = 3;// ten
				break;
			case 11:
				inputLength = 6;// eleven
				break;
			case 12:
				inputLength = 6;// twelve
				break;
			case 13:
				inputLength = 8;// thirteen
				break;
			case 14:
				inputLength = 8;// fourteen
				break;
			case 15:
				inputLength = 7;// fifteen
				break;
			case 16:
				inputLength = 7;// sixteen
				break;
			case 17:
				inputLength = 9;// seventeen
				break;
			case 18:
				inputLength = 8;// eighteen
				break;
			case 19:
				inputLength = 8;// nineteen
				break;
			}

		} else if (input < 100) {// 20-99
			int tensPlace = (input / 10);

			switch (tensPlace) {
			case 2:
				inputLength = howManyLetters(input % 10) + 6;// twenty
				break;
			case 3:
				inputLength = howManyLetters(input % 10) + 6;// thirty
				break;
			case 4:
				inputLength = howManyLetters(input % 10) + 5;// forty
				break;
			case 5:
				inputLength = howManyLetters(input % 10) + 5;// fifty
				break;
			case 6:
				inputLength = howManyLetters(input % 10) + 5;// sixty
				break;
			case 7:
				inputLength = howManyLetters(input % 10) + 7;// seventy
				break;
			case 8:
				inputLength = howManyLetters(input % 10) + 6;// eighty
				break;
			case 9:
				inputLength = howManyLetters(input % 10) + 6;// ninety
			}
		} else if (input < 1000) {// 100-999
			int hundredsPlace = (input / 100);
			if (input % 100 == 0) {
				inputLength = (howManyLetters(hundredsPlace) + 7);// even hundreds (100, 200,...)
			} else {
				inputLength = (howManyLetters(hundredsPlace) + 10)
						+ (howManyLetters(input % 100)); // hundred and
			}

		} else if (input < 1000000) {// 1000-9999
			int thousandsPlace = (input / 1000);

			inputLength = (howManyLetters(thousandsPlace) + 8)
					+ (howManyLetters(input % 1000)); // thousand
		}

		return inputLength;

	}

}
