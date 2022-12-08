
package kallol1;
import java.util.Scanner;
public class sum {


	public static boolean isStrongNumber(int num) {
	 		int fact = 1;
			int sum = 0;
			int temp = num;
			
			while(temp > 0) {
				// Get the last digit of the number
				int lastDigit = temp % 10;
				
				// Calculating the factorial of last digit
				for(int i=1; i<=lastDigit; i++) {
					fact *= i;
				}
				
				// Adding the factorial of last digit to sum
				sum += fact;
				
				// Resetting the factorial
				fact = 1;
				
				// Removing the last digit of the number
				temp = temp/10;
			}
			
			// Check if sum is equal to the given number
			if(sum == num)
				return true;
			
			return false;
		}
		
		public static void main(String[] args) {
			int num = 145;
			
			if(isStrongNumber(num))
				System.out.println(num + " is a strong number");
			else
				System.out.println(num + " is not a strong number");
		}
	}



