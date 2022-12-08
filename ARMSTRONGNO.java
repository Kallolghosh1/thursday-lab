package kallol1;
import java.util.Scanner;
public class ARMSTRONGNO {

	public static void main(String[] args) {
	
			 int num, number, temp, total = 0;
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Enter a 3 digit number: ");
		        num = scanner.nextInt();
		        
		        scanner.close();
		        number = num;
		        
		        for (; number != 0; number /= 10)
		        {
		            temp = number % 10;
		            total = total + temp*temp*temp;
		        }

		        if(total == num)
		            System.out.println(num + " is an Armstrong number");
		        else
		            System.out.println(num + " is not an Armstrong number");

		}

	}
