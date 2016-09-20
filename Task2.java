
/**
 * @author vaidas
 * 2.	Write the pseudocode for a function which takes an integer > 0 as an argument and prints the appropriate string “one”, “two”, “three”, …. , “ten”, or “greater than ten”
 * 
 */
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter number bigger  than 0!");	
		num = input.nextInt();
		printnumber(num);
	}
	public static void printnumber(int Anum){
		switch (Anum) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
		default:
			System.out.println("Bigger than Ten");
			break;
		
		}
	}
}
