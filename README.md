# CSE_Lab_Codes for CompilerLab - prefix, postfix, infix, Evaluation, a*, aab, a*b+
Java codes for Lab Classes of Computer Science &amp; Engineering's Courses<br>
#### Example 1: A java code to determine a string is recogniged as a*, aab, a*b+ or not.

```
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

```
#### Output: 
Please enter a string : <br>
abcd <br>
abcd is recognized by a*b+ <br>
--------------------  <br>
Please enter a string :  <br>
aab  <br>
aab is recognized by aab <br>
-------------------- <br>
Please enter a string :  <br>
xyz <br>
String can not recogniged <br>

***
