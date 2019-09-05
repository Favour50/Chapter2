// 2.16 USING 7,2,1

import java.util.Scanner;
public class Comparing {
     public static void main(String[] args) {
		System.out.print("Enter the first integer: ");
	 	Scanner input = new Scanner(System.in);
		int largest = 0;

		
		System.out.print("Enter the first integer: ");
		int firstInteger = input.nextInt();

		System.out.print("Enter the second integer: ");
		int secondInteger = input.nextInt();

		System.out.print("Enter the third integer: ");
		int thirdInteger = input.nextInt();

		if(firstInteger > secondInteger) {
		largest = firstInteger;
		}


		if(secondInteger > firstInteger) {
		largest = secondInteger;
		}

  		if(largest > thirdInteger){
		largest = largest;
		}

		if(thirdInteger > largest){
		largest = thirdInteger;
		}

     		System.out.printf("The largest number is: %d%n", largest);
	}
}



       
