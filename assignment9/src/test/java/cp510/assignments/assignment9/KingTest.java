package cp510.assignments.assignment9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the King class.
 *
 * @author Tim
 */
public class KingTest {

    /**
     *
     * Validate the King piece isn't implemented.
     * Results in no moves, so it should be an empty list.
     *
     */
    @Test
    public void kingValidTest() {

        King  kingW = new King( ChessColor.WHITE );

        ChessPoint  kingWPos  = new ChessPoint( 4, 4 );

        ChessPieceMap   map = new ChessPieceMap();
        map.put( kingWPos, kingW );

        List<ChessPoint> list    = kingW.getValidMoves( map );

        assertTrue(list.isEmpty());
    }

}
