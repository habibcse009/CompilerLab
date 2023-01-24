import java.util.Scanner;

public class FinalSecondClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word;
		int evaliation = 0;
		int a = 0, b = 0, c = 0, sum = 0;
		System.out.println("Please Enter an string: ");
		word = scan.next();
		int length = word.length() - 1;
		if (word.charAt(0) == '+' || word.charAt(0) == '-' || word.charAt(0) == '*' || word.charAt(0) == '/') {
			System.out.println("Given string is prefix");
			evaliation = 1;
		} else if (word.charAt(length) == '+' || word.charAt(length) == '-' || word.charAt(length) == '*'
				|| word.charAt(length) == '/') {
			System.out.println("Given string is postfix");
			evaliation = 2;
		} else if (word.charAt(0) != '+' || word.charAt(0) != '-' || word.charAt(0) != '*'
				|| word.charAt(0) != '/' && (word.charAt(length) == '+' || word.charAt(length) == '-'
						|| word.charAt(length) == '*' || word.charAt(length) == '/')) {
			System.out.println("Given string is infix");
			evaliation = 3;
		}
		if (evaliation == 3) {

			if (word.charAt(0) == '0') {
				a = 0;
			} else if (word.charAt(0) == '1') {
				a = 1;
			} else if (word.charAt(0) == '2') {
				a = 2;
			} else if (word.charAt(0) == '3') {
				a = 3;
			} else if (word.charAt(0) == '4') {
				a = 4;
			} else if (word.charAt(0) == '5') {
				a = 5;
			} else if (word.charAt(0) == '6') {
				a = 6;
			} else if (word.charAt(0) == '7') {
				a = 7;
			} else if (word.charAt(0) == '8') {
				a = 8;
			} else if (word.charAt(0) == '9') {
				a = 9;
			}
			// for calculte b
			if (word.charAt(2) == '0') {
				a = 0;

			} else if (word.charAt(2) == '1') {
				b = 1;

			} else if (word.charAt(2) == '2') {
				b = 2;

			} else if (word.charAt(2) == '3') {
				b = 3;

			} else if (word.charAt(2) == '4') {
				b = 4;

			} else if (word.charAt(2) == '5') {
				b = 5;

			} else if (word.charAt(2) == '6') {
				b = 6;

			} else if (word.charAt(2) == '7') {
				b = 7;

			} else if (word.charAt(2) == '8') {
				b = 8;

			} else if (word.charAt(2) == '9') {
				b = 9;

			}
			// for calculte c
			if (word.charAt(4) == '0') {
				c = 0;

			} else if (word.charAt(4) == '1') {
				c = 1;

			} else if (word.charAt(4) == '2') {
				c = 2;

			} else if (word.charAt(4) == '3') {
				c = 3;

			} else if (word.charAt(4) == '4') {
				c = 4;

			} else if (word.charAt(4) == '5') {
				c = 5;

			} else if (word.charAt(4) == '6') {
				c = 6;

			} else if (word.charAt(4) == '7') {
				c = 7;

			} else if (word.charAt(4) == '8') {
				c = 8;

			} else if (word.charAt(4) == '9') {
				c = 9;
			}

			
			if (word.charAt(1) == '+') {
				sum = a + b;
			} else if (word.charAt(1) == '*') {
				sum = a * b;
			} else if (word.charAt(1) == '/') {
				sum = a / b;
			} else if (word.charAt(1) == '-') {
				sum = a - b;
			}

			if (word.charAt(3) == '+') {
				sum = sum + c;
			} else if (word.charAt(3) == '*') {
				sum = sum * c;
			} else if (word.charAt(3) == '/') {
				sum = sum / c;
			} else if (word.charAt(3) == '-') {
				sum = sum - c;
			}

			System.out.println("Evaluation= " + sum );
		}
		else if (evaliation==1) {
			Character ch1,ch2,ch3,ch4,ch5;
			ch1=word.charAt(0);
			ch2=word.charAt(1);
			ch3=word.charAt(2);
			ch4=word.charAt(3);
			ch5=word.charAt(4);
			System.out.println(ch1+ch2+ch3+ch4+ch5);
			
			
		}

	}

}
