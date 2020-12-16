package cp510.assignments.assignment9;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the Pawn class.
 *
 * @author Tim
 */
public class PawnTest {

    /**
     *
     * Validate the Pawn piece isn't implemented.
     * Results in no moves, so it should be an empty list.
     *
     */
    @Test
    public void pawnValidTest() {

        Pawn  pawnW = new Pawn( ChessColor.WHITE );

        ChessPoint  pawnWPos  = new ChessPoint( 4, 4 );

        ChessPieceMap   map = new ChessPieceMap();
        map.put( pawnWPos, pawnW );

        List<ChessPoint> list    = pawnW.getValidMoves( map );

        assertTrue(list.isEmpty());
    }

}
