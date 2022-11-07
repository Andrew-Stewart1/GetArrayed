public class TwoDimensionalArray {
    public static void main(String[] args) {
        final int ROW = 3;
        final int COLUMN = 4;
        int[][] ages = new int[ROW][COLUMN];
        ages[0][0]=2;
        ages[0][1]=3;
        ages[1][0]=4;
        ages[1][1]=5;

        System.out.println("Array length: " + ages[0].length);
        for(int row = 0; row < ages[0].length; row++){
            for (int column = 0; column < ages[row].length; column++){
                System.out.printf("%5d", ages[row][column]);
            }
            System.out.println("");
        }
    }
}
