public class L7_1_Methods {
     static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
//        L7_1_Methods obj = new L7_1_Methods(); // This can also be used if we don't want to use static method
        c = logic(a,b); // we will have to add ojb. before logic
        int a1 = 5;
        int b1 = 2;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}

