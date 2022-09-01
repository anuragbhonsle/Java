public class L5_5_BreakandContinue {
    public static void main(String[] args) {
        //Break and Continue statement
        //      for (int i = 0; i < 5; i++) {
        //          System.out.println(i);
        //          System.out.println("I love Java");
        //          if (i == 3) {
        //              System.out.println("This loops will break here");
        //               break; }// Loop will break when i=3 condition is met
        //we can use break in while loop also
        //      int a = 0;
        //      while(a<10){
        //          System.out.println(a);
        //          System.out.println("java op");
        //          if(a==7){
        //             System.out.println("Loop ends");
        //               break;
//        }a++;

        //          }
        //      }
        for(int i=0; i<10; i++){
            if(i==5){
                System.out.println("This will not execute");
                continue;
            }
            System.out.println(i);
            System.out.println("Jva");
        }
    }
}
