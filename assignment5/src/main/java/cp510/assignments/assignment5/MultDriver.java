package cp510.assignments.assignment5;

import java.util.Random;

public class MultDriver {





    public static void main(String[] args) {

        double[][] testMatrix1 = new double[][]
                {
                        { 1, 2, 3 },
                        { 4, 5, 6 }
                };

        double[][] testMatrix2 = new double[][]
                {
                        { 7, 8 },
                        { 9, 10 },
                        { 11, 12 }
                };

        double[][] testMatrixMult = new double[][]
                {
                        { 58, 64 },
                        { 139, 154 }
                };

        Matrix leftMatrix = new Matrix(testMatrix1);
        Matrix rightMatrix = new Matrix(testMatrix2);

        leftMatrix.multiply(rightMatrix);



    }





    /*

                    if(num == 2)
                    formatted.format("");
                else if(num == 1)
                    formatted.format("*");


                if(Math.abs(item) == item)
                    formatted.format("_");
                else
                    formatted.format("");
*/


/*
        for(int lrow = 0; lrow < leftRowCount; lrow++) {

            for(int rcol = 0; rcol < rightColCount; rcol++) {

                System.out.println("Here.");

                double[] leftRow = this.getRow(lrow);
                double[] rightCol = toMul.getCol(rcol);

                //double itemMultiplied = 0;

                for(double leftItem : leftRow){

                    for(double rightItem : rightCol) {

                        System.out.println(leftItem + " *** " + rightItem);

                        //itemMultiplied += leftItem * rightItem;

                    }

                    System.out.println(" *** " + itemMultiplied);

                }

            }

        }
*/



        /*
    public Matrix multiply( Matrix toMul ) throws MatrixException {

        //int rows = data.length;
        int arrayLengthCount = this.getNumColumns(); //3


        System.out.println("Final matrix dimensions equal first number: "+this.getNumRows()+", "+this.getNumColumns());
        System.out.println("Final matrix dimensions equal: "+this.getNumRows()+", "+toMul.getNumColumns());

        double[][] mulMatrix = new double[this.getNumRows()][toMul.getNumColumns()];

        //this.getNumRows() != toMul.getNumRows() ||
        if(this.getNumColumns() != toMul.getNumRows()) {
            throw new MatrixException();
        }


        //[rows][cols]
        double result = 0;
        int rowCount = this.getNumRows(); //1
        int colCounts = 0;
        int rowCounts = 0;

        int rCols = 0;

        //Left row count
        for(int rows = 0; rows < rowCount; rows++) {


            //Right column count
            for (int lCols = 0; lCols < toMul.getNumColumns(); lCols++) {

          //      for (int lCols = 0; lCols < rowCount; lCols++) {
                System.out.println("------------------------------------------");
                rowCounts = 0;

                //Left column count
                for (int j = 0; j < arrayLengthCount; j++) {

                    System.out.println("Left: counts rCols: "+rCols+", j: "+ j);
                    System.out.println("Right: counts j: "+ j+", lCols: "+lCols);
                    System.out.println("");

                    //[rows][cols]
                    System.out.println(this.getElement(rCols, j) +" *** "+ toMul.getElement(j, lCols));
                    result += this.getElement(rCols, j) * toMul.getElement(j, lCols);
//                    result += this.getElement(j, lCols) * toMul.getElement(lCols, j);
                    System.out.println("Current total: " + result);

                }

                System.out.println("Out of inner most for loop.......................");
                System.out.println("left column count: "+ arrayLengthCount);
                System.out.println("total rows: "+ rowCount);
                System.out.println("rows: "+rows);
                System.out.println("lCols: "+lCols);
                System.out.println("result: "+result);

                System.out.println("Current row position: "+rowCounts+", column: "+colCounts);

                System.out.println("");




                //Should be 5,1
                mulMatrix[colCounts][rowCounts] = result;

                if(colCounts < toMul.getNumColumns())
                    colCounts++;

                if(rowCounts < toMul.getNumRows())
                    rowCounts++;

            }

            rCols++;

//            if(colCount == rowCount)
//                break;


        }
*/

        /*
                for(int i = 0; i < this.getNumRows(); i++) {

                    for(int j = 0; j < this.getNumColumns(); j++) {

                        mulMatrix[i][j] = this.getElement(i, j) * toMul.getElement(i, j);

                    }

                }
        */




/*

        Matrix multiplyMatrix = new Matrix(mulMatrix);
        return multiplyMatrix;


    }
*/




}
