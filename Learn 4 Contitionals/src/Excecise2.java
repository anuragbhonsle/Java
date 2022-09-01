import java.util.Random;
import java.util.Scanner;
public class Excecise2 {
    //Rock Paper Scissor Game taking user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rock = 1");
        System.out.println("Paper = 2");
        System.out.println("Scissor = 3");
        System.out.println("Enter your choice");
        byte number = sc.nextByte();
        int rock = 1;
        int paper = 2;
        int scissor = 3;
        int all = (rock+paper+scissor);
        Random rnum = new Random(all);
        System.out.println(rnum);

        int random = rnum.nextInt(3);


        //rock = 0
        //paper = 1
        //scissor = 2

                }
            }
