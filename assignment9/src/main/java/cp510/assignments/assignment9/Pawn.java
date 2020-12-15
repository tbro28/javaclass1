package cp510.assignments.assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;

/**
 *
 * Encapsulates the characteristics of a queen on a chess board.
 *
 * @author Tim Brown
 */
public class Pawn extends ChessPiece {

    private Object ChessPoint;

    /**
     *
     * Constructor for a Pawn.
     *
     * @param color
     */
    public Pawn(ChessColor color) {
        super("pawn", "", color);
    }

    /**
     *
     * Given the state of a chess board calculate all valid moves for this Pawn.
     * If there are no valid moves an empty list will be returned.
     *
     * @param chessMap
     * @return
     */
    public List<ChessPoint> getValidMoves(ChessPieceMap chessMap) {

        return new ArrayList<ChessPoint>();
    }

}
