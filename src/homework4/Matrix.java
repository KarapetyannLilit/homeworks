package homework4;

import java.util.Scanner;

public class Matrix {
    private int numberOfRows;
    private int numberOfColumns;
    private int array[][];

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public int getNumberOfColumns(int i) {
        return numberOfColumns;
    }

    public Matrix() {
        super();
    }

    public Matrix(int numberOfRows, int numberOfColumns) {
        this.numberOfRows=numberOfRows;
        this.numberOfColumns=numberOfColumns;
    }

        public void setTheElements ( int[][] array){
            this.array = array;
            Scanner input = new Scanner(System.in);

            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    array[i][j] = input.nextInt();
                }

            }

        }

    protected int[][] setTheElements() {
        return array;
    }
}
