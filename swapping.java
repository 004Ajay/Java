	import java.util.Scanner;
	public class swapping {

		public static void main(String[] args) {
			int num1, num2, temp;
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter value for num1 & num2:  " );
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			
			scan.close();

			// Java Program to swap two numbers using third variable
			temp = num1;
			num1 = num2;
			num2 = temp;
			
			System.out.println("");
			System.out.println("Swapping using third variable 'temp'");
			System.out.println("Before swapping num1: " + num2 + " & num2:  "+num1);
			System.out.println("After swapping num1: " + num1 + " & num2:  "+num2);
			
			// Java Program to swap two numbers without using third variable
			num1 = num1 + num2;
			num1 = num1 - num2;
			num2 = num1 - num2;
			
			System.out.println("");
			System.out.println("Swapping without using third variable 'temp'");
			System.out.println("Before swapping num1: " + num2 + " & num2:  "+num1);
			System.out.println("After swapping num1: " + num1 + " & num2:  "+num2);
		}
	}