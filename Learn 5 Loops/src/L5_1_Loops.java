public class L5_1_Loops {
    public static void main(String[] args) {
        System.out.println("Using loops :");
        int i, j;
        for(i=0;i < 5; i++){
            for(j=0;j<=i;j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}