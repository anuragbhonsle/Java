public class L4_3_Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        // All values must be true to get true in AND (&&) operator
        System.out.println("For Logical AND");
        if (a && b && c) {
            System.out.println("True");
        } else {
            System.out.println("False");
            // One values must be true to get true in AND (&&) operator
            System.out.println("For Logical OR");
            if (a || b || c) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
