public class L6_1_arrays {
    public static void main(String[] args) {
        // 1. Declaration and memory allocation
        // int [] marks = new int[5];
        // 2. Declaration and then memory allocation
        int[] marks = marks = new int[5];
        marks[0] = 70;
        marks[1] = 90;
        marks[2] = 73;
        marks[3] = 67;
        marks[4] = 89;
        //System.out.println(marks[3]);
        // 3. Declaration, memory allocation and initialization together
        // int [] marks = {98, 45, 79, 99, 80};
        //System.out.println(marks.length);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}