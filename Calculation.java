// 2.17 Arithmetic, Smallest and Largest

import java.util.Scanner;
public class Calculation {
 	public static void main(String[] args) {
             	System.out.print("Enter first integer:");
		Scanner input = new Scanner(System.in);
		int firstInteger = input.nextInt();

		System.out.print("Enter second integer:");
		int secondInteger = input.nextInt();

		System.out.print("Enter third integer:");
		int thirdInteger = input.nextInt();

		int Sum = (firstInteger + secondInteger + thirdInteger);
		System.out.printf("Sum is %d%n", Sum);

		double Avg1 = (firstInteger + secondInteger + thirdInteger)/3;
		System.out.printf("Avg1 is %f%n", Avg1);

                int Avg2 = (firstInteger + secondInteger + thirdInteger)/3;
                System.out.printf("Avg2 is %d%n", Avg2);

                int Product = (firstInteger * secondInteger * thirdInteger);
		System.out.printf("Product is %d%n", Product);

		}

}



