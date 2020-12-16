package cp510.assignments.assignment9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the ChessPiece class.
 *
 * @author Tim
 */

public class ChessPieceTest {

    /**
     *
     * Validate the chess piece constructor and parameters set.
     */
    @Test
    public void chessPieceConstructorTest() {

        Rook  rook = new Rook( ChessColor.WHITE );

        assertEquals("rook", rook.name);
        assertEquals(null, rook.image);
        assertEquals(ChessColor.WHITE, rook.color);
    }

    /**
     *
     * Validate the getName method.
     */
    @Test
    public void chessPieceGetNameTest() {

        Rook  rook = new Rook( ChessColor.WHITE );

        assertEquals("rook", rook.getName());
    }

    /**
     *
     * Validate the getImage method.
     */
    @Test
    public void chessPieceGetImageTest() {

        Rook  rook = new Rook( ChessColor.WHITE );

        assertEquals(null, rook.getImage());
    }

    /**
     *
     * Validate the getColor method.
     */
    @Test
    public void chessPieceGetColorTest() {

        Rook  rook = new Rook( ChessColor.BLACK );

        assertEquals(ChessColor.BLACK, rook.getColor());
    }

    /**
     *
     * Validate the isAlive method.
     */
    @Test
    public void chessPieceIsAliveTest() {

        Rook  rook = new Rook( ChessColor.BLACK );

        assertTrue(rook.isAlive());
    }

    /**
     *
     * Validate the setAlive method.
     */
    @Test
    public void chessPieceSetAliveTest() {

        Rook  rook = new Rook( ChessColor.BLACK );

        rook.setAlive(false);

        assertFalse(rook.isAlive);
    }

}
