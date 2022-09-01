public class L6_2_ForEachLoopinJava {
    public static void main(String[] args) {
        int[] marks = marks = new int[5];
        marks[0] = 70;
        marks[1] = 90;
        marks[2] = 73;
        marks[3] = 67;
        marks[4] = 89;
        //  System.out.println(marks[0]);
        //  System.out.println(marks.length);
        //   String [] students = {"Harry","Spider","Lion","Jett"};
        //   System.out.println(students[2]);

        // using for loop to display array

        //  for(int i=0; i<marks.length;i++){
        //     System.out.println(marks[i]);

        // using for loop to display array in reverser order
        //for(int i=marks.length-1;i>=0;i--){
        //    System.out.println(marks[i]);

        //for each loop
        for (int element : marks) {
            System.out.println(element);
        }
    }
}
