// 2.25 Odd or Even


import java.util.Scanner;
public class OddEven {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter integer: ");
        int x = input.nextInt();
	
        if(x % 2 == 0){
	System.out.print("You entered an even number");
        }
	
        if(x % 2 != 0){
	System.out.print("You entered an odd number");
        }
     
     }

}

