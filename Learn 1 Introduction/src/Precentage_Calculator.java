import java.util.Scanner;

public class Precentage_Calculator {
    public static void main(String[] args) {
        System.out.println("Enter the marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject 1:");
        int a = sc.nextInt();
        System.out.println("Enter marks of subject 2:");
        int b = sc.nextInt();
        System.out.println("Enter marks of subject 3:");
        int c = sc.nextInt();
        System.out.println("Enter marks of subject 4:");
        int d = sc.nextInt();
        System.out.println("Enter marks of subject 5:");
        int e = sc.nextInt();
        float total = a + b + c + d + e;
        float percentage = total/500*100;
        System.out.println("The Percentage of Student is :");
        System.out.println(percentage);

    }
}
