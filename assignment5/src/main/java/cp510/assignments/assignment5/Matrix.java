package cp510.assignments.assignment5;

import java.lang.RuntimeException.*;
import java.lang.Exception.*;
import java.util.Formatter;


/**
 *
 * capable of performing the following matrix operations.
 * 	Addition
 * 	Subtraction
 * 	Scalar multiplication
 * 	Negation
 * 	Multiplication
 *
 * @author Tim
 */
public class Matrix {


    /**
     * Holds the double array.
     */
    private double[][] data;


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
     * @return added matrices
     * @throws MatrixException
     */
    public Matrix add( Matrix toAdd ) throws MatrixException {

        int rows = data.length;
        int maxDataLength = 0;
        int maxToAddLength = 0;
        double[][] addMatrix = new double[this.getNumRows()]
                [this.getNumColumns()];

        if(this.getNumRows() != toAdd.getNumRows() ||
                this.getNumColumns() != toAdd.getNumColumns())
            throw new MatrixException();

        for(int i = 0; i < this.getNumRows(); i++) {

            for(int j = 0; j < this.getNumColumns(); j++) {

                addMatrix[i][j] = this.getElement(i, j) +
                        toAdd.getElement(i, j);

            }

        }

        Matrix sumMatrix = new Matrix(addMatrix);

        return sumMatrix;
    }


    /**
     *
     * Subtracts a given matrix from this matrix.
     * The result is a new matrix object.
     *
     * @param toSub
     * @return subtracted result matrix
     * @throws MatrixException
     */
    public Matrix subtract( Matrix toSub ) throws MatrixException {

        int rows = data.length;

        double[][] subMatrix = new double[this.getNumRows()]
                [this.getNumColumns()];

        if(this.getNumRows() != toSub.getNumRows() ||
                this.getNumColumns() != toSub.getNumColumns())
            throw new MatrixException();

        for(int i = 0; i < this.getNumRows(); i++) {

            for(int j = 0; j < this.getNumColumns(); j++) {

                subMatrix[i][j] = this.getElement(i, j) -
                        toSub.getElement(i, j);
            }
        }

        Matrix subtractMatrix = new Matrix(subMatrix);

        return subtractMatrix;
    }


    /**
     *
     * Multiplies this matrix times a given matrix;
     * this matrix is the left operand.
     *
     * @param toMul
     * @return multiplied result matrix
     * @throws MatrixException
     */
    public Matrix multiply( Matrix toMul ) throws MatrixException {

        int leftRowCount = this.getNumRows();
        int leftColCount = this.getNumColumns();
        int rightRowCount = toMul.getNumRows();
        int rightColCount = toMul.getNumColumns();


        if(leftColCount != rightRowCount) {
            throw new MatrixException();
        }

        double[][] dataIn = new double[leftRowCount][rightColCount];
        Matrix matrixMultiplied = new Matrix(dataIn);

        double[][] itemMultiplied = new double[leftRowCount][rightColCount];;

        for(int i = 0; i < leftRowCount; i++) {
            for (int j = 0; j < rightColCount; j++) {
                for (int k = 0; k < leftColCount; k++) {
                    itemMultiplied[i][j] += this.getElement(i, k) *
                            toMul.getElement(k, j);
                }
            }
        }

        Matrix matrixFinal = new Matrix(itemMultiplied);
        return matrixFinal;
    }


    /**
     *
     * Multiplies this matrix by a given scalar.
     *
     * @param scalar
     * @return multiplied matrix
     */
    public Matrix multiply( double scalar ) {

        double[][] mulMatrix = new double[this.getNumRows()]
                [this.getNumColumns()];

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
     * Returns a new matrix which is the negation of this matrix.
     *
     * @return the negated values in a new matrix
     */
    public Matrix negate() {

        double[][] negMatrix = new double[this.getNumRows()]
                [this.getNumColumns()];

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
     * Returns the value of the element at a given row and column.
     *
     * @param row
     * @param col
     * @return the specified element value
     * @throws IndexOutOfBoundsException
     */
    public double getElement( int row, int col )
            throws IndexOutOfBoundsException {
        return this.data[row][col];
    }


    /**
     *
     * Returns an array which is a copy of the internal array.
     *
     * @return a copy of the Matrix data
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
     * @return the specified row values
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
     * @return the specified column values
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
     * @return the number of rows
     */
    public int getNumRows() {
        return data.length;
    }


    /**
     *
     * Returns the number of columns in this matrix.
     *
     * @return the number of columns
     */
    public int getNumColumns() {
        return data[0].length;
    }


    /**
     *
     * Returns true if this matrix is approximately equal
     * to a given matrix.
     * The two matrices are equal if:
     * 	They have the same number of rows.
     * 	They have the same number of columns.
     * 	Corresponding elements are approximately equal as determined
     *
     * @param test
     * @param epsilon
     * @return whether the two matrices are approximately equal
     */
    public boolean approxEqual(Matrix test, double epsilon) {

        boolean aprxEqual = true;


        if(this.getNumRows() != test.getNumRows())
            aprxEqual = false;

        if(this.getNumColumns() != test.getNumColumns())
            aprxEqual = false;

        for(int row = 0; row < this.getNumRows(); row++) {

            for (int col = 0; col < this.getNumColumns(); col++) {

                if(Math.abs(this.getElement(row, col) -
                        test.getElement(row, col)) >= epsilon) {
                    aprxEqual = false;
                }
            }
        }

        return aprxEqual;
    }


    /**
     * Overrides the toString method to return a formatted version
     * of the output.
     *
     * @return the string representation of a Matrix
     */
    public String toString() {

        StringBuilder sb = new StringBuilder();
        Formatter formatted = new Formatter(sb);

        int num = 0;
        String strItem = "";

        for(int i = 0; i < data.length; i++) {

            formatted.format("| ");

            for (double item : data[i]) {

                num = (int)item;
                strItem = Integer.toString(num);
                num = strItem.length();

                if(Math.abs(item) == item && num ==1)
                    formatted.format("  ");
                else if(Math.abs(item) == item && num ==2)
                    formatted.format(" ");
                else if(Math.abs(item) != item && num ==2)
                    formatted.format(" ");
                else if(Math.abs(item) != item && num ==1)
                    formatted.format(" ");

                formatted.format("%.3f", item);     // 4 decimal places
            }

            formatted.format(" |\n");
        }

        return formatted.toString();
    }
}
