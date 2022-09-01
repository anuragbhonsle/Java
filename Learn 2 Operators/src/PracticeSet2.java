import java.util.Scanner;
public class PracticeSet2 {
    public static void main(String[] args) {
        //Write a Java program to encrypt a grade by adding 8 to it, then decrypt it by showing the correct grade.
        char grade = 'B';
        //Encrypting
        grade = (char) (grade + 8);
        System.out.println(grade);
        //Decrypting
        grade = (char) (grade - 8);
        System.out.println(grade);
        //Write a Java program that uses comparison operator to find out whether a given number is greater than the user entered number
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(a>8);
    }
}
