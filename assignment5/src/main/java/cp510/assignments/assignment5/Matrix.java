package cp510.assignments.assignment5;

import java.lang.RuntimeException.*;
import java.lang.Exception.*;
import java.util.Formatter;
//import java.lang.RuntimeException.matrix.*;



/**
 *
 * capable of performing the following matrix operations:
 * ●	Addition
 * ●	Subtraction
 * ●	Scalar multiplication
 * ●	Negation
 * ●	Multiplication
 *
 * @author Tim
 */
public class Matrix {


    /**
     * Holds the double array
     */
    private double[][] data;


    /**
     * TESTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
     * DELETE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Creates an empty matrix object.
     *
     */
    public Matrix() {}


    /**
     *
     * Creates a matrix object from the given input.
     * Throw MatrixException if the array is not rectangular
     * (i.e. if rows have different lengths).
     *
     * @param dataIn
     * @throws MatrixException
     */
    public Matrix( double[][] dataIn ) throws MatrixException {

        int colLength1 = 0;
        int colLength2 = 0;

        for(int i = 0; i < dataIn.length; i++) {
            if(i == 0) {
                colLength2 = dataIn[i].length;
            }
            else {
                colLength1 = colLength2;
                colLength2 = dataIn[i].length;
                if(colLength1 != colLength2)
                    throw new MatrixException();
            }
        }

        data = dataIn;
    }


    /**
     *
     * Adds a given matrix to this matrix. The result is a new matrix object.
     *
     * @param toAdd
     * @return
     * @throws MatrixException
     */
    public Matrix add( Matrix toAdd ) throws MatrixException {

        int rows = data.length;
        int maxDataLength = 0;
        int maxToAddLength = 0;
        double[][] addMatrix = new double[this.getNumRows()][this.getNumColumns()];

        if(this.getNumRows() != toAdd.getNumRows() || this.getNumColumns() != toAdd.getNumColumns())
           throw new MatrixException();

        for(int i = 0; i < this.getNumRows(); i++) {

            for(int j = 0; j < this.getNumColumns(); j++) {

                addMatrix[i][j] = this.getElement(i, j) + toAdd.getElement(i, j);

            }

        }

        Matrix sumMatrix = new Matrix(addMatrix);

        /*
        for(int i = 0; i < data.length; i++) {
            //for(int j = 0; j < data[i].length)
            if(maxDataLength < data[i].length)
                maxDataLength = data[i].length;
        }

        for(int i = 0; i < toAdd.get.length; i++) {
            //for(int j = 0; j < data[i].length)
            if(maxDataLength < data[i].length)
                maxDataLength = data[i].length;
        }
*/

        return sumMatrix;
    }


    /**
     *
     *     Subtracts a given matrix from this matrix. The result is a new matrix object.
     *
     * @param toSub
     * @return
     * @throws MatrixException
     */
    public Matrix subtract( Matrix toSub ) throws MatrixException {

        int rows = data.length;

        double[][] subMatrix = new double[this.getNumRows()][this.getNumColumns()];

        if(this.getNumRows() != toSub.getNumRows() || this.getNumColumns() != toSub.getNumColumns())
            throw new MatrixException();

        for(int i = 0; i < this.getNumRows(); i++) {

            for(int j = 0; j < this.getNumColumns(); j++) {

                subMatrix[i][j] = this.getElement(i, j) - toSub.getElement(i, j);

            }

        }

        Matrix subtractMatrix = new Matrix(subMatrix);

        return subtractMatrix;
    }


    /**
     *
     * Multiplies this matrix times a given matrix; this matrix is the left operand.
     *
     * @return
     * @throws MatrixException
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









    /**
     *
     *     Multiplies this matrix by a given scalar.
     *
     * @param scalar
     * @return
     */
    public Matrix multiply( double scalar ) {

        double[][] mulMatrix = new double[this.getNumRows()][this.getNumColumns()];

        for(int i = 0; i < this.getNumRows(); i++) {

            for(int j = 0; j < this.getNumColumns(); j++) {

                mulMatrix[i][j] = this.getElement(i, j) * scalar;

            }

        }

        Matrix multiplyMatrix = new Matrix(mulMatrix);

        return multiplyMatrix;

    }


    /**
     *
     *     Returns a new matrix which is the negation of this matrix.
     *
     * @return
     */
    public Matrix negate() {

        double[][] negMatrix = new double[this.getNumRows()][this.getNumColumns()];

        for(int i = 0; i < this.getNumRows(); i++) {

            for(int j = 0; j < this.getNumColumns(); j++) {

                negMatrix[i][j] = -(this.getElement(i, j));

            }

        }

        Matrix negateMatrix = new Matrix(negMatrix);

        return negateMatrix;

    }


    /**
     *
     * Returns the value of the element at a given row and column
     *
     * @param row
     * @param col
     * @return
     * @throws IndexOutOfBoundsException
     */
    public double getElement( int row, int col ) throws IndexOutOfBoundsException {
        return this.data[row][col];
    }


    /**
     *
     * Returns an array which is a copy of the internal array.
     *
     * @return
     */
    public double[][] getData() {

        double[][] dataCopy = data;

        return dataCopy;
    }


    /**
     *
     * Returns a one-dimensional array containing a copy of the given row.
     *
     * @param row
     * @return
     * @throws IndexOutOfBoundsException
     */
    public double[] getRow( int row ) throws IndexOutOfBoundsException {

        double[] rowData = data[row];

        return rowData;

    }


    /**
     *
     * Returns a one-dimensional array reflecting the data in the given column.
     *
     * @param col
     * @return
     * @throws IndexOutOfBoundsException
     */
    public double[] getCol( int col ) throws IndexOutOfBoundsException {

        //int columnCount = this.getNumColumns();

        double[] columnArray = new double[this.getNumRows()];

        for(int i = 0; i < this.getNumRows(); i++) {
            columnArray[i] = this.getElement(i, col);
        }

        return columnArray;
    }


    /**
     *
     * Returns the number of rows in this matrix.
     *
     * @return
     */
    public int getNumRows() {
        return data.length;
    }


    /**
     *
     * Returns the number of columns in this matrix.
     *
     * @return
     */
    public int getNumColumns() {
        return data[0].length;
    }


    /**
     *
     * Returns true if this matrix is approximately equal to a given matrix. The two matrices are equal if:
     * ●	They have the same number of rows.
     * ●	They have the same number of columns.
     * ●	Corresponding elements are approximately equal as determined
     *
     * @param test
     * @param epsilon
     * @return
     */
    public boolean approxEqual(Matrix test, double epsilon) {
        return true;
    }


    /**
     * Overrides the toString method to return a formatted version
     * of the output.
     *
     * @return
     */
    public String toString() {

        StringBuilder sb = new StringBuilder();
        Formatter formatted = new Formatter(sb);

        //formatted.format("%.4f", yco);
        int num = 0;
        String strItem = "";

        for(int i = 0; i < data.length; i++) {

            formatted.format("| ");

            for (double item : data[i]) {

                if(Math.abs(item) == item)
                    formatted.format(" ");

                num = (int)item;
                strItem = Integer.toString(num);
                num = strItem.length();

//                System.out.println("Characters: " + num);

                formatted.format("%.3f", item);     // 4 decimal places

                if(num == 2)
                    formatted.format(" ");
                else if(num == 1)
                    formatted.format("  ");



                if(Math.abs(item) == item)
                    formatted.format(" ");
                else
                    formatted.format("  ");

                //formatted.format(" ");


            }
            formatted.format(" |\n");


        }


        return formatted.toString();
    }



}
