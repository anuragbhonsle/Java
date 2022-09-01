public class L6_3_MultidimensionalArraysinJava {
    public static void main(String[] args) {
        int[] marks; // A 1-D Array
        int[][] flats; // A 2-D Array
        flats = new int[2][3]; // See it as 2 rows and 3 column
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 104;
        flats[1][1] = 105;
        flats[1][2] = 106;
        //Displaying a 2-D Array (Using for loop)
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.println(flats[i][j]);
            }
            System.out.println();
        }
    }
}
