package cp510.assignments.assignment9;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Rook class.
 *
 * @author Tim
 */

public class RookTest {

    /**
     *
     *   0 1 2 3 4 5 6 7
     * 0 x x x x o x x x
     * 1 x x x x o x x x
     * 2 x x x x o x x x
     * 3 x x x x o x x x
     * 4 o o o o r o o B
     * 5 x x x x w x x x
     * 6 x x x x x x x x
     * 7 x x x x x x x x
     *
     * Validates end of move conditions:
     * - reaching the end of the map.
     * - reaching the same color piece.
     * - reaching a different color piece.
     *
     */
    @Test
    public void rookValidMovesTest() {

        Rook  rookW = new Rook( ChessColor.WHITE );
        Rook  rookW2 = new Rook( ChessColor.WHITE );
        Rook  rookB = new Rook( ChessColor.BLACK );

        ChessPoint  rookWPos  = new ChessPoint( 4, 4 );
        ChessPoint  rookWPos2    = new ChessPoint( 4, 7 );
        ChessPoint  rookBPos    = new ChessPoint( 5, 4 );

        ChessPieceMap   map = new ChessPieceMap();
        map.put( rookWPos, rookW );
        map.put( rookWPos2, rookW2 );
        map.put( rookBPos, rookB );

        List<ChessPoint> list    = rookW.getValidMoves( map );

        List<ChessPoint> validMoveslist = new ArrayList<>();
        validMoveslist.add(new ChessPoint(4,0));
        validMoveslist.add(new ChessPoint(4,1));
        validMoveslist.add(new ChessPoint(4,2));
        validMoveslist.add(new ChessPoint(4,3));
        validMoveslist.add(new ChessPoint(4,5));
        validMoveslist.add(new ChessPoint(4,6));
        validMoveslist.add(new ChessPoint(0,4));
        validMoveslist.add(new ChessPoint(1,4));
        validMoveslist.add(new ChessPoint(2,4));
        validMoveslist.add(new ChessPoint(3,4));
        validMoveslist.add(new ChessPoint(5,4));

        assertTrue(list.containsAll(validMoveslist));

    }

    /**
     *
     * Validate same color in all directions.
     * Results in no moves, so it should be an empty list.
     *
     */
    @Test
    public void rookValidSameColorTest() {

        Rook  rookW = new Rook( ChessColor.WHITE );
        Rook  rook1 = new Rook( ChessColor.WHITE );
        Rook  rook2 = new Rook( ChessColor.WHITE );
        Rook  rook3 = new Rook( ChessColor.WHITE );
        Rook  rook4 = new Rook( ChessColor.WHITE );


        ChessPoint  rookWPos  = new ChessPoint( 4, 4 );
        ChessPoint  rook1Pos  = new ChessPoint( 4, 3 );
        ChessPoint  rook2Pos  = new ChessPoint( 4, 5 );
        ChessPoint  rook3Pos  = new ChessPoint( 3, 4 );
        ChessPoint  rook4Pos  = new ChessPoint( 5, 4 );

        ChessPieceMap   map = new ChessPieceMap();
        map.put( rookWPos, rookW );
        map.put( rook1Pos, rook1 );
        map.put( rook2Pos, rook2 );
        map.put( rook3Pos, rook3 );
        map.put( rook4Pos, rook4 );

        List<ChessPoint> list    = rookW.getValidMoves( map );

        assertTrue(list.isEmpty());
    }

    /**
     *
     * Validate different color in all directions.
     *
     */
    @Test
    public void rookValidDifferentColorTest() {

        Rook  rookW = new Rook( ChessColor.WHITE );
        Rook  rook1 = new Rook( ChessColor.BLACK );
        Rook  rook2 = new Rook( ChessColor.BLACK );
        Rook  rook3 = new Rook( ChessColor.BLACK );
        Rook  rook4 = new Rook( ChessColor.BLACK );


        ChessPoint  rookWPos = new ChessPoint( 4, 4 );
        ChessPoint  rook1Pos  = new ChessPoint( 4, 3 );
        ChessPoint  rook2Pos  = new ChessPoint( 4, 5 );
        ChessPoint  rook3Pos  = new ChessPoint( 3, 4 );
        ChessPoint  rook4Pos  = new ChessPoint( 5, 4 );

        ChessPieceMap   map = new ChessPieceMap();
        map.put( rookWPos, rookW );
        map.put( rook1Pos, rook1 );
        map.put( rook2Pos, rook2 );
        map.put( rook3Pos, rook3 );
        map.put( rook4Pos, rook4 );


        List<ChessPoint> list    = rookW.getValidMoves( map );

        List<ChessPoint> validMoveslist = new ArrayList<>();
        validMoveslist.add(new ChessPoint(4,3));
        validMoveslist.add(new ChessPoint(4,5));
        validMoveslist.add(new ChessPoint(3,4));
        validMoveslist.add(new ChessPoint(5,4));

        assertTrue(list.containsAll(validMoveslist));
    }

}
