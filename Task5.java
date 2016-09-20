
/**
 * @author vaidas
 * task: Takes two integers and returns larger integer
 */
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		int num1, num2, larger = 0;
		Scanner input = new Scanner(System.in); 
		System.out.println("Please enter first interger!");
		num1 = input.nextInt();
		System.out.println("Please enter second interger!");
		num2 = input.nextInt();
		larger=largestNum(num1, num2);		
		System.out.println("Largerst number is:"+ larger);	
	}
	public static int largestNum(int Anum1, int Anum2) {
		int Alarger=0;
		if (Anum1>Anum2){
			Alarger=Anum1;
		}
		else{
			Alarger=Anum2;
		}	
		return Alarger;        
    }

}

