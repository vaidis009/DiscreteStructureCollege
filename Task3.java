/**
 * 
 */

/**
 * @author vaidas
 *
 *3.	Write the pseudocode for a function that performs simple calculations that are specified by the user. The function will take two real numbers and a character as input. The character will be one of the following operators: ‘+’, ‘-‘, ‘*’, ‘/’. The function should calculate and return the appropriate result of applying the operator to the two reals.
 *
 */
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		int num1, num2, sum;
		String operator;
		Scanner input = new Scanner(System.in);
		Scanner text=new Scanner(System.in);
		System.out.println("Please enter first interger!");
		num1 = input.nextInt();
		System.out.println("Please enter second interger!");
		num2 = input.nextInt();
		System.out.println("Please enter operator!");
		operator = text.nextLine();	   

		sum=calculation(num1,operator,num2);
		System.out.println("The sum of two numbers are:"+ sum);

	}
	public static int calculation(int Anum1, String Aoperator, int Anum2){
		int Asum=0;
		switch (Aoperator) {
		case "+":
			Asum=Anum1+Anum2;			
			break;
		case "-":
			Asum=Anum1-Anum2;			
			break;
		case "*":
			Asum=Anum1*Anum2;			
			break;
		case "/":
			Asum=Anum1/Anum2;			
			break;

		default:
			break;
		}
		
		return Asum;
	}
}
