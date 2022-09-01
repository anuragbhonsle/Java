import java.util.Scanner;
public class L5_7_PracticeSet {
    public static void main(String[] args) {
        //Write a program to print the following pattern

        //       for (int i = 4; i>0; i--){
        //          for (int j = 1; j<=i; j++){
        //              System.out.print("*");
        //          }
        //           System.out.println();
        //       }
        //       // Write a program to sum first n even numbers using while loop

        //       int sum = 0;
        //       int n=4;
        //       for(int i=0; i<n;i++){
        //           sum = sum + (2*i);
        //        }
        //       System.out.println("Sum of even number is ");
        //       System.out.println(sum);
        //   }
        //  write a program to  print multiplication table of number n

        //   Scanner sc = new Scanner(System.in);
        //   System.out.println("Enter the number : ");
        //   int n = sc.nextInt();
        //    System.out.println("The table of the entered number is as follows : ");
        //   for (int c = 1; c <= 10; c++) {
        //        System.out.println(n*c);
        //   }
        //  write a program to  print multiplication table of number 10 in reverse order
        //   int i = 10;
        //  for(int a=10; a>=0; a--){
        //       System.out.println(i*a);
        // wrtie a program to print sum the numbers in the table of 8

            int n = 8;
           int sum = 0;
           for (int c = 1; c <= 10; c++) {
               sum = sum+n*c;
        }
        System.out.println(sum);
    }
}
