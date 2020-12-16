package cp510.assignments.assignment9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Encapsulates the characteristics of a queen on a chess board.
 *
 * @author Tim Brown
 */
public class King extends ChessPiece {

    /**
     *
     * Constructor for a King.
     *
     * @param color
     */
    public King(ChessColor color) {
        super("king", "", color);
    }

    /**
     *
     * Given the state of a chess board calculate all valid moves for this King.
     * If there are no valid moves an empty list will be returned.
     *
     * @param chessMap
     * @return a list of valid moves.
     */
    public List<ChessPoint> getValidMoves(ChessPieceMap chessMap) {

        return new ArrayList<ChessPoint>();
    }

}
