import java.util.Scanner;
public class L4_5_Switch {
    public static void main(String[] args) {
        System.out.println("Enter your age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("You are going to be an adult");
                break;
   case 23:
                System.out.println("You are going to get a job");
                break;
            case 58:
                System.out.println("You aer going to get retired");
                break;
            case 80:
                System.out.println("Enjoy your last days");
                break;
            default:
                System.out.println("Enjoy your life and Trust the process");
                break;
        }
    }
}
