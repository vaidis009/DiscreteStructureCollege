/**
 * 
 */

/**
 * @author vaidas
 *4.	Write the pseudocode for a function that returns the factorial of a given integer.. use an iterative version.
 *
 *
 */
import java.util.Scanner;
public class Task4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num, sum;
		Scanner input = new Scanner(System.in); 
		System.out.println("Please enter interger!");
		num = input.nextInt();
		sum=factorial(num);
		System.out.println(sum);
		System.out.println(5*4*3*2*1);

	}
	public static int factorial(int Anum){
		int Asum=Anum;		
		while(Anum>1){
			Anum--;
			Asum=Asum*(Anum);
			System.out.println(Asum);
			
			System.out.println(Anum);
		}		
		return Asum;		
	}
}
