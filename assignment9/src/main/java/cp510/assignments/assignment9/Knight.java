package cp510.assignments.assignment9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Encapsulates the characteristics of a knight on a chess board.
 *
 * @author Tim Brown
 */
public class Knight extends ChessPiece {

    /**
     *
     * Constructor for a Knight.
     *
     * @param color
     */
    public Knight(ChessColor color) {
        super("knight", "", color);
    }

    /**
     *
     * Given the state of a chess board calculate all valid moves for this Knight.
     * If there are no valid moves an empty list will be returned.
     *
     * @param chessMap
     * @return
     */
    public List<ChessPoint> getValidMoves(ChessPieceMap chessMap) {

        return new ArrayList<ChessPoint>();
    }

}
