package cp510.assignments.assignment9;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the Knight class.
 *
 * @author Tim
 */
public class KnightTest {

    /**
     *
     * Validate the Knight piece isn't implemented.
     * Results in no moves, so it should be an empty list.
     *
     */
    @Test
    public void knightValidTest() {

        Knight  knightW = new Knight( ChessColor.WHITE );

        ChessPoint  knightWPos  = new ChessPoint( 4, 4 );

        ChessPieceMap   map = new ChessPieceMap();
        map.put( knightWPos, knightW );

        List<ChessPoint> list    = knightW.getValidMoves( map );

        assertTrue(list.isEmpty());
    }

}
