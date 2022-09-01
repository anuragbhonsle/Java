import java.util.Scanner;
public class PracticeSet4 {
    public static void main(String[] args) {
        //Write a Java program to find out weather a student is pass of fail. If it requires a total 40% and at least 33% in each subject to pass. Assume three subjects and take marks as an input from the user,
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Python");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in C++");
        m2= sc.nextByte();

        System.out.println("Enter your marks in Java");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your Overall percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, You have been promoted");
       }
        else{
            System.out.println("Sorry, You have not been promoted! Please try again.");
        }
    }
}
