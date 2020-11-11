package cp510.assignments.assignment5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

/**
 *  Tests for the Matrix class.
 *
 * @author Tim
 */
public class MatrixTest {

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


    /**
     * Validate that the MatrixException is thrown.
     */
    @Test
    public void testMatrixException() {

        double[][] testError = new double[][]
                {
                        { 0, 1, 2 },
                        { 3, 4, 5 },
                        { 6, 7 }
                };

        assertThrows(MatrixException.class, () -> new Matrix(testError));
    }

    /**
     * Validate adding two matrices.
     */
    @Test
    public void testAddMatrix() {

        double[][] testMatrixExpectedResult = new double[][]
                {
                        { 2, 4, 6 },
                        { 8, 10, 12 }
                };

        Matrix expectedMatrix = new Matrix(testMatrixExpectedResult);
        Matrix expectedMatrix2 = new Matrix(testMatrixExpectedResult);

        Matrix left = new Matrix(testMatrix1);
        Matrix right = new Matrix(testMatrix1);

        //left.add(right);

        //assertTrue(expectedMatrix.equals(left.add(right)));
//        left.add(right)
        assertTrue(expectedMatrix.toString().equals(left.add(right).toString()));
        //assertEquals(expectedMatrix.toString(), expectedMatrix2.toString());

       // assert
    }

    /**
     * Validate subtracting two matrices.
     */
    @Test
    public void testSubtractMatrix() {

        double[][] testMatrixExpectedResult = new double[][]
                {
                        { 0, 0, 0 },
                        { 0, 0, 0 }
                };

        Matrix expectedMatrix = new Matrix(testMatrixExpectedResult);
        Matrix expectedMatrix2 = new Matrix(testMatrixExpectedResult);

        Matrix left = new Matrix(testMatrix1);
        Matrix right = new Matrix(testMatrix1);

        //assertTrue(expectedMatrix.toString().equals(left.subtract(right).toString()));
        assertEquals(expectedMatrix.toString(), left.subtract(right).toString());


    }



    //MISSSSSSSSSSSSSSSSSSSSSSS MULT


    /**
     * Validate multiplying a matrix by a scaler.
     */
    @Test
    public void testMultipleScalerMatrix() {

        double[][] testMatrixExpectedResult = new double[][]
                {
                        { 2, 4, 6 },
                        { 8, 10, 12 }
                };

        Matrix expectedMatrix = new Matrix(testMatrixExpectedResult);

        Matrix left = new Matrix(testMatrix1);

        assertEquals(expectedMatrix.toString(), left.multiply(2.0).toString());

    }


    /**
     * Validate negating a matrix.
     */
    @Test
    public void testNegateMatrix() {

        double[][] testMatrixNegate = new double[][]
                {
                        { -1, 2, -3 },
                        { 4, -5, 6 }
                };

        double[][] testMatrixExpectedResult = new double[][]
                {
                        { 1, -2, 3 },
                        { -4, 5, -6 }
                };

        Matrix expectedMatrix = new Matrix(testMatrixExpectedResult);

        Matrix left = new Matrix(testMatrixNegate);

        //assertTrue(expectedMatrix.toString().equals(left.subtract(right).toString()));
        assertEquals(expectedMatrix.toString(), left.negate().toString());

    }


    /**
     * Validate getting an element within a matrix.
     */
    @Test
    public void testElementMatrix() {

        double[][] testMatrixElements = new double[][]
                {
                        { -1, 2, -3 },
                        { 4, -5, 6 }
                };

        //Matrix expectedMatrix = new Matrix(testMatrixCopy);

        Matrix left = new Matrix(testMatrixElements);

        //assertTrue(expectedMatrix.toString().equals(left.subtract(right).toString()));
        assertEquals(-5.0, left.getElement(1, 1));

    }


    /**
     * Validate copying a matrix.
     */
    @Test
    public void testCopyMatrix() {

        double[][] testMatrixCopy = new double[][]
                {
                        { -1, 2, -3 },
                        { 4, -5, 6 }
                };

        Matrix expectedMatrix = new Matrix(testMatrixCopy);

        Matrix left = new Matrix(testMatrixCopy);

        //assertTrue(expectedMatrix.toString().equals(left.subtract(right).toString()));
        assertEquals(testMatrixCopy.toString(), left.getData().toString());

    }


    /**
     * Validate getting a row from a matrix.
     */
    @Test
    public void testRowMatrix() {

        double[][] testMatrixRow = new double[][]
                {
                        { -1, 2, -3 },
                        { 4, -5, 6 }
                };

        double[] testMatrixRowExpectedResult = new double[]
                {
                        4, -5, 6
                };


        //Matrix expectedMatrix = new Matrix(testMatrixCopy);

        Matrix left = new Matrix(testMatrixRow);

        System.out.println(left);

        System.out.println(Arrays.equals(testMatrixRowExpectedResult, left.getRow(1)));

        System.out.println(left.getRow(1).toString());
        System.out.println(testMatrixRowExpectedResult.toString());

        assertTrue(Arrays.equals(testMatrixRowExpectedResult, left.getRow(1)));
    }


    /**
     * Validate getting a column from a matrix.
     */
 /*   @Test
    public void testColumnMatrix() {

        double[][] testMatrixColumn = new double[][]
                {
                        { -1, 2, -3 },
                        { 4, -5, 6 }
                };

        double[][] testMatrixColumnExpectedResult = new double[][]
                {
                        { 2 },
                        { -5 }
                };


        //Matrix expectedMatrix = new Matrix(testMatrixCopy);

        Matrix left = new Matrix(testMatrixColumn);

        //assertTrue(expectedMatrix.toString().equals(left.subtract(right).toString()));
        assertEquals(testMatrixColumnExpectedResult, left.get);

    }
*/


}
