import java.util.Scanner;
public class L4_4_ifelse {
    public static void main(String[] args) {
        System.out.println("Enter your age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You are an adult");
        }
        else if (age < 8) {
            System.out.println("You are an Kid");
        }
        else{
            System.out.println("You are a Teenager");
        }
    }
}
