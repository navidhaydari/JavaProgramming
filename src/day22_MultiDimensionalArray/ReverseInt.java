package day22_MultiDimensionalArray;

public class ReverseInt {
    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3},{4,5,6}};
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+ " ");

            }
            System.out.println();

        }
    }
}
