import java.util.Scanner;

public class FinalFirstClass {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String word;
		int a=0;
		System.out.println("Please enter a string : ");
		word=scan.nextLine();
		if (word.charAt(0)=='a' || (word.charAt(0)=='a' && word.charAt(1)=='a')) {
			if (word.length()==1) {
				System.out.println(word+" is recognized by a*");
			}
			else if (word.length()==2) {
				System.out.println(word+" is recognized by a*");
			}
			else if (word.charAt(0)=='a' && word.charAt(1)=='a' && word.charAt(2)=='b' ) {
				System.out.println(word+" is recognized by aab");
			}
			else if (word.length()>=2) {
				for (int i = 0; i < word.length()-1; i++) {
					if (word.charAt(i)=='a') {
						a=1;
					}
					else if(word.charAt(i)=='a' || word.charAt(i)=='b'){
						a=0;
					}
				}	
				if (a==1) {
					System.out.println(word+" is recognized by a*");
				}
				else if (a==0) {
					System.out.println(word+" is recognized by a*b+");
				}
			}
			else {
				System.out.println(word+" is recognized by a*b+");
			}
		}
		else if (word.charAt(0)=='a' && word.charAt(1)=='a' && word.charAt(2)=='b' ) {
			System.out.println(word+" is recognized by aab");
		}

		else {
			System.out.println("String can not recogniged");
		}

	}

}
