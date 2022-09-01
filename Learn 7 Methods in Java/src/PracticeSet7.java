import org.w3c.dom.ls.LSOutput;

public class PracticeSet7 {
    static int table(int n) { // Problem 1
        for (int i = 1; i < 10; i++) {
            System.out.println(n*i);
        }
        return n;
    }
    static void stars (int x, int a){ // Problem 2
        for (x=0;x<5;x++){
            for(a=0;a<x;a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

        public static void main (String[]args){
            table(5); // Problem 1
            stars(5,4); // Problem 2
        }
}

