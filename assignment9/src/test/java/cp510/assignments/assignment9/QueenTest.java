package cp510.assignments.assignment9;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the Queen class.
 *
 * @author Tim
 */
public class QueenTest {

    /**
     *
     * Validate the Queen piece isn't implemented.
     * Results in no moves, so it should be an empty list.
     *
     */
    @Test
    public void queenValidTest() {

        Queen  queenW = new Queen( ChessColor.WHITE );

        ChessPoint  queenWPos  = new ChessPoint( 4, 4 );

        ChessPieceMap   map = new ChessPieceMap();
        map.put( queenWPos, queenW );

        List<ChessPoint> list    = queenW.getValidMoves( map );

        assertTrue(list.isEmpty());
    }

}
