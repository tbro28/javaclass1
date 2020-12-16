package cp510.assignments.assignment9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BishopTest {


    /**
     *
     *   0 1 2 3 4 5 6 7
     * 0 x x x x x x x x
     * 1 x x x x x x x o
     * 2 x x x x x x o x
     * 3 x x x w x o x x
     * 4 x x x x b x x x
     * 5 x x x o x o x x
     * 6 x x o x x x o x
     * 7 x B x x x x x o
     *
     * Validates end of move conditions:
     * - reaching the end of the map.
     * - reaching the same color piece.
     * - reaching a different color piece.
     *
     */
    @Test
    public void bishopValidMovesTest() {

        Bishop  bishopW  = new Bishop( ChessColor.WHITE );
        Bishop  bishopW2 = new Bishop( ChessColor.WHITE );
        Bishop  bishopB  = new Bishop( ChessColor.BLACK );

        ChessPoint  bishopWPos  = new ChessPoint( 4, 4 );
        ChessPoint  bishopWPos2 = new ChessPoint( 3, 3 );
        ChessPoint  bishopBPos  = new ChessPoint( 7, 1 );

        ChessPieceMap   map = new ChessPieceMap();
        map.put( bishopWPos, bishopW );
        map.put( bishopWPos2, bishopW2 );
        map.put( bishopBPos, bishopB );

        List<ChessPoint> list    = bishopW.getValidMoves( map );

        List<ChessPoint> validMoveslist = new ArrayList<>();
        validMoveslist.add(new ChessPoint(5,3));
        validMoveslist.add(new ChessPoint(6,2));
        validMoveslist.add(new ChessPoint(7,1));
        validMoveslist.add(new ChessPoint(3,5));
        validMoveslist.add(new ChessPoint(2,6));
        validMoveslist.add(new ChessPoint(1,7));
        validMoveslist.add(new ChessPoint(5,5));
        validMoveslist.add(new ChessPoint(6,6));
        validMoveslist.add(new ChessPoint(7,7));

        assertTrue(list.containsAll(validMoveslist));
    }

    /**
     *
     * Validate same color in all directions.
     * Results in no moves, so it should be an empty list.
     *
     */
    @Test
    public void bishopValidSameColorTest() {

        Bishop  bishopW = new Bishop( ChessColor.WHITE );
        Bishop  bishop1 = new Bishop( ChessColor.WHITE );
        Bishop  bishop2 = new Bishop( ChessColor.WHITE );
        Bishop  bishop3 = new Bishop( ChessColor.WHITE );
        Bishop  bishop4 = new Bishop( ChessColor.WHITE );


        ChessPoint  bishopWPos  = new ChessPoint( 4, 4 );
        ChessPoint  bishop1Pos  = new ChessPoint( 3, 3 );
        ChessPoint  bishop2Pos  = new ChessPoint( 3, 5 );
        ChessPoint  bishop3Pos  = new ChessPoint( 5, 3 );
        ChessPoint  bishop4Pos  = new ChessPoint( 5, 5 );

        ChessPieceMap   map = new ChessPieceMap();
        map.put( bishopWPos, bishopW );
        map.put( bishop1Pos, bishop1 );
        map.put( bishop2Pos, bishop2 );
        map.put( bishop3Pos, bishop3 );
        map.put( bishop4Pos, bishop4 );

        List<ChessPoint> list    = bishopW.getValidMoves( map );

        assertTrue(list.isEmpty());
    }

    /**
     *
     * Validate different color in all directions.
     *
     */
    @Test
    public void bishopValidDifferentColorTest() {

        Bishop  bishopW = new Bishop( ChessColor.WHITE );
        Bishop  bishop1 = new Bishop( ChessColor.BLACK );
        Bishop  bishop2 = new Bishop( ChessColor.BLACK );
        Bishop  bishop3 = new Bishop( ChessColor.BLACK );
        Bishop  bishop4 = new Bishop( ChessColor.BLACK );


        ChessPoint  bishopWPos = new ChessPoint( 4, 4 );
        ChessPoint  bishop1Pos = new ChessPoint( 3, 3 );
        ChessPoint  bishop2Pos = new ChessPoint( 3, 5 );
        ChessPoint  bishop3Pos = new ChessPoint( 5, 3 );
        ChessPoint  bishop4Pos = new ChessPoint( 5, 5 );

        ChessPieceMap   map = new ChessPieceMap();
        map.put( bishopWPos, bishopW );
        map.put( bishop1Pos, bishop1 );
        map.put( bishop2Pos, bishop2 );
        map.put( bishop3Pos, bishop3 );
        map.put( bishop4Pos, bishop4 );


        List<ChessPoint> list    = bishopW.getValidMoves( map );

        List<ChessPoint> validMoveslist = new ArrayList<>();
        validMoveslist.add(new ChessPoint(3,3));
        validMoveslist.add(new ChessPoint(3,5));
        validMoveslist.add(new ChessPoint(5,3));
        validMoveslist.add(new ChessPoint(5,5));

        assertTrue(list.containsAll(validMoveslist));
    }

}
