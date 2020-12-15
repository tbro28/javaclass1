package cp510.assignments.assignment9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Encapsulates the characteristics of a rook on a chess board.
 * It has no properties other than those inherited from its superclass.
 * It has one constructor and one method
 * (as required by the abstract superclass).
 *
 * @author Tim Brown
 */
public class Rook extends ChessPiece {

    /**
     *
     * Constructor for a rook.
     *
     * @param color
     */
    public Rook(ChessColor color) {

        //ChessPiece(String name, Image image, ChessColor color)
        super("rook", "", color);

    }

    /**
     *
     * Given the state of a chess board calculate all valid moves for this Rook.
     * If there are no valid moves an empty list will be returned.
     *
     * @param chessMap
     * @return
     */
    @Override
    public List<ChessPoint> getValidMoves(ChessPieceMap chessMap) {

        List<ChessPoint> moves = new ArrayList<>();
        ChessPoint currentPoint;

        currentPoint = chessMap.getKey(this);

        int pieceRow = currentPoint.getRow();
        int pieceCol = currentPoint.getCol();
        int piecePotentialValidMoveRow = currentPoint.getRow();
        int piecePotentialValidMoveCol = currentPoint.getCol();


        //Trying to get the row entries to the left
        //Need to get row, col-1 until col < 0
        while(piecePotentialValidMoveCol >= 0) {

            chessMap.get(piecePotentialValidMoveRow, piecePotentialValidMoveCol-1)
            if(chessMap.get())

                if(chessMap.containsValue(Ma)){}


            piecePotentialValidMoveCol--;
        }

        currentPoint.getRow()




        return moves;
    }


}
