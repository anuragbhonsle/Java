import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age : ");
        int a = sc.nextInt();
        int year = 2022;
        int birthyear = year-a;
        System.out.println("Your age is "+birthyear);
    }
}
