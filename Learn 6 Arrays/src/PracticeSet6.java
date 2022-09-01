import java.sql.SQLOutput;

public class PracticeSet6 {
    public static void main(String[] args) {
//        //Create an array of 5 floats and calculate their sum
//        float [] marks = {90f,50f,70f,65f,85f};
//        float sum = 0;
//        for(float element : marks){
//            System.out.println(element);
//            sum = sum+element;
//        }
//        System.out.println("The value of sum is : "+ sum);
//        float ave = sum*100/500;
//        System.out.println("The Percentage is : " + ave);

        //Write a program to find out whether a given integer is present in an array or not
//        int[] marks2 = {90, 50, 70, 65, 85};
//        int num = 30;
//        boolean isInArray = false;
//        for (int element : marks2) {
//            if (num == element) {
//                isInArray = true;
//                System.out.println("The value is in the array");
//            } else {
//                System.out.println("The value is not in the array");

        //Calculate the average marks from an array containing marks of all students in physics using for each loop

//        float [] marks = {45.7f,67.8f,63.4f,99.2f,100.0f};
//        float avg = 0;
//        float sum = 0;
//        for(float element:marks){
//            sum = sum + element;
//            }
//        System.out.print("The sum of marks is : ");
//        System.out.println(sum);
//        avg = sum / 5;
//        System.out.print("The average of marks is : ");
//        System.out.println(avg);

        //Create a Java program to add two matrices of size 2*3
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
    }
}
