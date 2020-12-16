package cp510.assignments.assignment9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the ChessPoint class.
 *
 * @author Tim
 */
public class ChessPointTest {


    /**
     * Test the empty constructor.
     */
    @Test
    public void constructorNoParamsTest() {

        ChessPoint  defaultPoint = new ChessPoint();

        assertEquals(new ChessPoint(0,0), defaultPoint);
    }

    /**
     * Test the two parameter constructor.
     */
    @Test
    public void constructorTwoParamsTest() {

        ChessPoint  defaultPoint = new ChessPoint(1,2);

        assertEquals(1, defaultPoint.getRow());
        assertEquals(2, defaultPoint.getCol());
    }

    /**
     * Test the copy constructor.
     */
    @Test
    public void chessPointCopyTest() {

        ChessPoint  point1    = new ChessPoint( 0, 1 );
        ChessPoint  point2    = new ChessPoint( point1 );

        assertEquals(point2, point1);
    }

    /**
     * Test the add method.
     */
    @Test
    public void chessPointAddMethodTest() {

        ChessPoint  defaultPoint = new ChessPoint(1,1);

        defaultPoint.add(2, 2);

        assertEquals(3, defaultPoint.getRow());
        assertEquals(3, defaultPoint.getCol());
    }

    /**
     * Test the set method.
     */
    @Test
    public void chessPointSetMethodTest() {

        ChessPoint  defaultPoint = new ChessPoint(1,1);

        defaultPoint.setPoint(6, 6);

        assertEquals(6, defaultPoint.getRow());
        assertEquals(6, defaultPoint.getCol());
    }

    /**
     * Test the hashcode method.
     */
    @Test
    public void chessPointHashcodeMethodTest() {

        ChessPoint  defaultPoint = new ChessPoint(1,1);

        assertEquals(47, defaultPoint.hashCode());
    }

    /**
     * Test the setRow method.
     */
    @Test
    public void chessPointSetRowMethodTest() {

        ChessPoint  defaultPoint = new ChessPoint(1,1);

        defaultPoint.setRow(7);

        assertEquals(7, defaultPoint.getRow());
    }

    /**
     * Test the setCol method.
     */
    @Test
    public void chessPointSetColMethodTest() {

        ChessPoint  defaultPoint = new ChessPoint(1,1);

        defaultPoint.setCol(7);

        assertEquals(7, defaultPoint.getCol());
    }

    /**
     * Test the toString method.
     */
    @Test
    public void chessPointToStringMethodTest() {

        ChessPoint  defaultPoint = new ChessPoint(1,2);

        assertEquals("row=1,column=2", defaultPoint.toString());
    }

}
