// 2.24 Largest and Smallest Integers
import java.util.Scanner;

public class Integers {
	public static void main(String[] args){
 	 	System.out.print("Enter first integer");
		Scanner input = new Scanner(System.in);
                int largest = 0;
		
		System.out.print("Enter the first integer: ");
		int firstInteger = input.nextInt();

		System.out.print("Enter the second integer: ");
		int secondInteger = input.nextInt();

		System.out.print("Enter third integer: ");
		int thirdInteger = input.nextInt();

		System.out.print("Enter fourth integer: ");
		int fourthInteger = input.nextInt();

		System.out.print("Enter fifth integer: ");
		int fifthInteger = input.nextInt();


	  	if(firstInteger > secondInteger){
         	largest = firstInteger;
               }

		if(secondInteger > firstInteger){
		largest = secondInteger;
               }
  
                if(secondInteger > thirdInteger){
                   largest = secondInteger; 
	      }
                 if(thirdInteger > fourthInteger){
		largest = thirdInteger;
              }

		if(fourthInteger > thirdInteger){
		largest = fourthInteger;
	      }

		if(largest > fifthInteger){
		largest = largest;
	     }
		if(fifthInteger > largest){
                 largest = fifthInteger;
		}
       	     System.out.printf("The largest is: %d%n", largest);

	}

}






		

	}
}


