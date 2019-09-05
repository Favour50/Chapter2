// 2.24 Largest and Smallest Integers Using ABCDE
import java.util.Scanner;

public class Integers2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer");
                int A = input.nextInt();

		System.out.print("Enter the second integer: ");
		int B = input.nextInt();

		System.out.print("Enter third integer: ");
		int C = input.nextInt();

		System.out.print("Enter fourth integer: ");
		int D = input.nextInt();

		System.out.print("Enter fifth integer: ");
		int E = input.nextInt();
		

           if(A>B && A>C && A>D && A>E) {
		System.out.printf("The Largest number is %d%n", A);
                }
   
           if(B>A && B>C && B>D && B>E){
                System.out.printf("The Largest number is %d%n", B);
                } 

		
	   if(C>A && C>B && C>D && C>E){
                System.out.printf("The Largest number is %d%n", C);
                } 

           if(D>A && D>B && D>C && D>E){
                System.out.printf("The Largest number is %d%n", D);
                }

            if(E>A && E>B && E>C && E>D){
                System.out.printf("The Largest number is %d%n", E);
                }


 // For Smallest Integer

             if(A<B && A<C && A<D && A<E) {
		System.out.printf("The Smallest number is %d%n", A);
                }
   
           if(B<A && B<C && B<D && B<E){
                System.out.printf("The Smallest number is %d%n", B);
                } 

		
	   if(C<A && C<B && C<D && C<E){
                System.out.printf("The Smallest number is %d%n", C);
                } 

           if(D<A && D<B && D<C && D<E){
                System.out.printf("The Smallest number is %d%n", D);
                }

            if(E<A && E<B && E<C && E<D){
                System.out.printf("The Smallest number is %d%n", E);
                }

	}

}
		

