import java.util.Scanner;

/** Game:add three numbers
 * 
 * @author brentdegreef
 *
 */
public class Exercise3_2 {
	
	 public static void main(String[] Strings) {

	        int number1 = (int) (System.currentTimeMillis() % 10);
	        int number2 = (int) (System.currentTimeMillis() / 7 % 10);
	        int number3 = (int) (System.currentTimeMillis() / 3 % 10);

	        // Getting input from user
	        Scanner input = new Scanner(System.in);
	        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
	        int answer = input.nextInt();
	        input.close();

	        System.out.println(number1 + " + " + number2 + " + " + number3 + " = "
	                + answer + " is " + (number1 + number2 + number3 == answer));
	    }

}
