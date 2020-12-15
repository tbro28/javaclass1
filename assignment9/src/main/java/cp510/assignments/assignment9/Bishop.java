package cp510.assignments.assignment9;

import java.util.List;

/**
 *
 * Encapsulates the characteristics of a bishop on a chess board.
 * It has no properties other than those inherited from its superclass.
 * It has one constructor and one method
 * (as required by the abstract superclass).
 *
 * @author Tim Brown
 */
public class Bishop extends ChessPiece {

    /**
     *
     * Constructor for a bishop.
     *
     * @param color
     */
    public Bishop(ChessColor color) {
        super("bishop", "", color);
    }

    /**
     *
     * Given the state of a chess board calculate all valid moves for this Bishop.
     * If there are no valid moves an empty list will be returned.
     *
     * @param chessMap
     * @return
     */
    public List<ChessPoint> getValidMoves(ChessPieceMap chessMap) {


        return new java.util.List<ChessPoint>;

    }






}
