// Fig 2.26


import java.util.Scanner;
public class Multiples {
     public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);
                System.out.print("Enter the first integer: ");
              
                  int x = input.nextInt();

		  System.out.print("Enter the second integer: ");
		  int y = input.nextInt();
         
                  if(x % y == 0){
			System.out.print("Answer is divisible");
		   }
                 
                  if(x % y != 0){
			System.out.print("Answer is not divisible");
		   }
           }

}
