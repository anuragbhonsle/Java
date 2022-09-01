public class L7_3_VarArgs {
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println("The sum of 4 and 3 is :"+sum(4,3));
        System.out.println("The sum of 4, 2, and 3 is :"+sum(4,2,3));
        System.out.println("The sum of 4, 2, 1 and 3 is :"+sum(4,2,1,3));
        System.out.println("The sum of 4, 2, 5 and 3 is :"+sum(4,2,5,3));
    }
}
