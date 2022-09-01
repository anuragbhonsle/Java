public class L7_2_MethodsOverloading {
    static void foo(){
        System.out.println("hello how are you");
    }
    static void foo(int a){;
        System.out.println("hello how are you "+ a);
    }
    static void foo(int a, int b) {
        ;
        System.out.println("hello how are you " + a);
        System.out.println("hello how are you " + b);
    }
    static void foo(int a, int b, int c) {
        ;
        System.out.println("hello how are you " + a);
        System.out.println("hello how are you " + b);
        System.out.println("hello how are you " + c);
    }
//    static void change(int [] arr){
//        arr[0] = 70;
//    }
//    static void telljoke(){
//        System.out.println("Hear about the new restaurant called Karma?\n" +
//                "There’s no menu: You get what you deserve.");
//    }

    public static void main(String[] args) {
//        telljoke();
//        int[] marks = {24, 56, 12, 67, 23};
//        change (marks);
//        System.out.println(marks[0]);

        //Method overloading
        foo();
        foo(50); //500 is an argument and a is an parameter, arguments are actual ( actual values )
        foo(200, 474);
        foo(777,888,333);
    }
}
