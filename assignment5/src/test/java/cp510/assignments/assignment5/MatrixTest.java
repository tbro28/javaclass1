package cp510.assignments.assignment5;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.lang.Exception.*;

/**
 * Tests for the Matrix class.
 *
 * @author Tim
 */
public class MatrixTest {

    /**
     * Matrix to be used in the test cases.
     */
    double[][] testMatrix1 = new double[][]
        {
            {1, 2, 3},
            {4, 5, 6}
        };

    /**
     * Matrix to be used in the test cases.
     */
    double[][] testMatrix2 = new double[][]
        {
            {7, 8},
            {9, 10},
            {11, 12}
        };


    /**
     * Validate that the MatrixException is thrown.
     */
    @Test
    public void testMatrixException() {

        double[][] testError = new double[][]
            {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7}
            };

        assertThrows(NuMatrixException.class, () -> new Matrix(testError));
    }

    /**
     * Validate adding two matrices.
     */
    @Test
    public void testAddMatrix() {

        double[][] testMatrixExpectedResult = new double[][]
            {
                {2, 4, 6},
                {8, 10, 12}
            };

        Matrix expectedMatrix = new Matrix(testMatrixExpectedResult);
        Matrix expectedMatrix2 = new Matrix(testMatrixExpectedResult);

        Matrix left = new Matrix(testMatrix1);
        Matrix right = new Matrix(testMatrix1);

        assertTrue(expectedMatrix.toString()
                .equals(left.add(right).toString()));
    }


    /**
     * Validate subtracting two matrices.
     */
    @Test
    public void testSubtractMatrix() {

        double[][] testMatrixExpectedResult = new double[][]
            {
                {0, 0, 0},
                {0, 0, 0}
            };

        Matrix expectedMatrix = new Matrix(testMatrixExpectedResult);

        Matrix left = new Matrix(testMatrix1);
        Matrix right = new Matrix(testMatrix1);

        assertEquals(expectedMatrix.toString(),
                left.subtract(right).toString());
    }


    /**
     * Validate multiple two matrices.
     */
    @Test
    public void testMultipleMatrix() {

        double[][] testMatrixExpectedResult = new double[][]
            {
                {58, 64},
                {139, 154}
            };

        Matrix expectedMatrix = new Matrix(testMatrixExpectedResult);

        Matrix left = new Matrix(testMatrix1);
        Matrix right = new Matrix(testMatrix2);

        assertEquals(expectedMatrix.toString(),
                left.multiply(right).toString());
    }


    /**
     * Validate multiplying a matrix by a scaler.
     */
    @Test
    public void testMultipleScalerMatrix() {

        double[][] testMatrixExpectedResult = new double[][]
            {
                {2, 4, 6},
                {8, 10, 12}
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

        double[][] stMatrixNegate = new double[][]
            {
                {-1, 2, -3},
                {4, -5, 6}
            };

        double[][] testMatrixExpectedResult = new double[][]
            {
                {1, -2, 3},
                {-4, 5, -6}
            };

        Matrix expectedMatrix = new Matrix(testMatrixExpectedResult);

        Matrix left = new Matrix(stMatrixNegate);

        assertEquals(expectedMatrix.toString(),
                left.negate().toString());
    }


    /**
     * Validate getting an element within a matrix.
     */
    @Test
    public void testElementMatrix() {

        double[][] testMatrixElements = new double[][]
            {
                {-1, 2, -3},
                {4, -5, 6}
            };

        Matrix left = new Matrix(testMatrixElements);

        assertEquals(-5.0, left.getElement(1, 1));
    }


    /**
     * Validate copying a matrix.
     */
    @Test
    public void testCopyMatrix() {

        double[][] testMatrixCopy = new double[][]
            {
                {-1, 2, -3},
                {4, -5, 6}
            };

        Matrix expectedMatrix = new Matrix(testMatrixCopy);

        Matrix left = new Matrix(testMatrixCopy);

        assertEquals(testMatrixCopy.toString(),
                left.getData().toString());
    }


    /**
     * Validate getting a row from a matrix.
     */
    @Test
    public void testRowMatrix() {

        double[][] testMatrixRow = new double[][]
            {
                {-1, 2, -3},
                {4, -5, 6}
            };

        double[] testMatrixRowExpectedResult = new double[] { 4, -5, 6 };

        Matrix left = new Matrix(testMatrixRow);

        assertTrue(Arrays.equals(testMatrixRowExpectedResult, left.getRow(1)));
    }


    /**
     * Validate getting a column from a matrix.
     */
    @Test
    public void testColumnMatrix() {

        double[][] testMatrixColumn = new double[][]
            {
                {-1, 2, -3},
                {4, -5, 6}
            };

        double[] testMatrixColumnExpectedResult = new double[] { 2, -5 };

        Matrix left = new Matrix(testMatrixColumn);

        assertTrue(Arrays.equals(testMatrixColumnExpectedResult,
                left.getCol(1)));
    }


    /**
     * Validate that two matrices are approximately equal.
     */
    @Test
    public void testApproxEqualMatrix() {

        double[][] testMatrix = new double[][]
            {
                {0001, 2, 3},
                {4, 5, 7.99}
            };

        double epsilon = 1;

        Matrix left = new Matrix(testMatrix1);
        Matrix right = new Matrix(testMatrix);

        assertTrue(left.approxEqual(right, 2));
    }

    /**
     * Validate MatrixException with a string.
     */
    @Test
    public void testMatrixExceptionString() {

        MatrixException exceptionTest = new MatrixException("test");

        assertNotNull(exceptionTest);
    }


    /**
     * Validate MatrixException with a Throwable.
     */
    @Test
    public void testMatrixExceptionThrowable() {

        MatrixException exceptionTest =
                new MatrixException(new MatrixException());

        assertNotNull(exceptionTest);
    }


    /**
     * Validate MatrixException with a string and a Throwable.
     */
    @Test
    public void testMatrixExceptionStringThrowable() {

        MatrixException exceptionTest =
                new MatrixException("test", new MatrixException());

        assertNotNull(exceptionTest);
    }
}
