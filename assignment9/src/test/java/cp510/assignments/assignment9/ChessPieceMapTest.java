package cp510.assignments.assignment9;

import org.junit.jupiter.api.Test;
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

       System.out.println(map.hashCode());
       System.out.println(map.get(new ChessPoint(0,0)));
       System.out.println(map.map);
       System.out.println(map.map.size());
       System.out.println(map.map.hashCode());

       int piecesCount = 0;
       for(ChessPiece piece : map.map.values()) {
           piecesCount++;
           //System.out.println(piece.getName());
       }
       System.out.println(map.map.size() + " cOUNT " + piecesCount);

       assertEquals(32, map.map.size());

    }


    /**
     * Test the creation of a new map
     * and verifies the hashcode.
     */
    @Test
    public void putErrorTest() {

        Rook  rookB = new Rook( ChessColor.BLACK );
        ChessPoint  rookBPos  = new ChessPoint( 9, 9 );

        ChessPieceMap   map = new ChessPieceMap();
        map.put( rookBPos, rookB );

        ChessException exception = new ChessException("Not a valid square.");

        assertThrows(ChessException.class, () -> map.put( rookBPos, rookB ), "Not a valid square.");
    }

}
