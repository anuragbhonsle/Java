public class L2_2_AssociativityofOperators {
    public static void main(String[] args) {
        // Precedence & Associativity
        int x = 4*5-10/2;
        System.out.println(x);

//        Highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity
//            =20-10/2
//            =20-5
//            =15

        int a = 2;
        int b = 4;
        int c = 10;
        int k = a*a + 2*a*b + b*b;
        System.out.println(k);
    }
}
