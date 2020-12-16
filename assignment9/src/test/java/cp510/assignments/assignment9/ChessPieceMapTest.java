package cp510.assignments.assignment9;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the ChessPieceMap class.
 *
 * @author Tim
 */
public class ChessPieceMapTest {


    /**
     * Test the creation of a new map
     * and verifies the piece count.
     */
    @Test
    public void newMapPiecesCountTest() {

        ChessPieceMap map = ChessPieceMap.newGame();

        assertEquals(32, map.map.size());

    }


    /**
     * Test the invalid square exception handling.
     */
    @Test
    public void putErrorInvalidSquareTest() {

        Rook  rookB = new Rook( ChessColor.BLACK );
        ChessPoint  rookBPos  = new ChessPoint( 9, 9 );

        ChessPieceMap   map = new ChessPieceMap();

        Throwable thrown = assertThrows(ChessException.class,
                () -> map.put( rookBPos, rookB ));
        assertThat(thrown.getMessage(), is("Not a valid square."));
        assertThrows(ChessException.class, () -> map.put( rookBPos, rookB ));
    }

    /**
     * Test the NULL chess piece exception handling.
     */
    @Test
    public void putErrorNullPieceTest() {

        ChessPoint  rookBPos  = new ChessPoint( 7, 7 );

        ChessPieceMap   map = new ChessPieceMap();

        Throwable thrown = assertThrows(ChessException.class,
                () -> map.put( rookBPos, null ));
        assertThat(thrown.getMessage(), is("The piece provided is NULL."));
        assertThrows(ChessException.class, () -> map.put( rookBPos, null ));
    }

    /**
     * Test the get chess piece exception handling.
     */
    @Test
    public void getErrorInvalidSquareTest() {

        Rook  rookB = new Rook( ChessColor.BLACK );
        ChessPoint  rookBPos  = new ChessPoint( -1, -1 );

        ChessPieceMap   map = new ChessPieceMap();

        Throwable thrown = assertThrows(ChessException.class,
                () -> map.put( rookBPos, rookB ));
        assertThat(thrown.getMessage(), is("Not a valid square."));
        assertThrows(ChessException.class, () -> map.put( rookBPos, rookB ));
    }
}
