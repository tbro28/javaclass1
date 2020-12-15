package cp510.assignments.assignment9;

import java.util.ArrayList;
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

        List<ChessPoint> moves = new ArrayList<>();

        ChessPoint currentPoint;

        currentPoint = chessMap.getKey(this);

        int pieceRow = currentPoint.getRow();
        int pieceCol = currentPoint.getCol();
        int piecePotentialValidMoveRow = currentPoint.getRow();
        int piecePotentialValidMoveCol = currentPoint.getCol();

        ChessPoint potentialValidMove = new ChessPoint(piecePotentialValidMoveRow, piecePotentialValidMoveCol);

        //Trying to get the row entries to the left-up
        //Need to get row, col-1 until col is less than 0
        while(potentialValidMove.getCol() > 0 && potentialValidMove.getRow() > 0) {

            potentialValidMove.setCol(potentialValidMove.getCol()-1);
            potentialValidMove.setRow(potentialValidMove.getRow()-1);

            //if spot is empty then it is valid.
            //if the spot has a piece of the same color, then it's not valid and stop.
            //if the spot has a piece of a different color, then it's valid and stop.
            System.out.print( chessMap.get(potentialValidMove) + " -- ");
            //System.out.println( "col #"+potentialValidMove.getCol());

            if(chessMap.get(potentialValidMove) == null)
                moves.add(new ChessPoint(potentialValidMove.getRow(), potentialValidMove.getCol()));
            else if (chessMap.get(potentialValidMove).color == this.color) {
                System.out.println("Piece with same color");
                break;
            }
            else {
                System.out.println("Piece with diff color");
                moves.add(new ChessPoint(potentialValidMove.getRow(), potentialValidMove.getCol()));
                break;
            }

            //System.out.println(potentialValidMove.getRow()+"--------"+potentialValidMove.getCol());
            System.out.println("Bishop left-up: " + potentialValidMove);
        }

        potentialValidMove.setRow(pieceRow);
        potentialValidMove.setCol(pieceCol);

        //Trying to get the row entries to the right-up
        while(potentialValidMove.getCol() < 7 && potentialValidMove.getRow() > 0) {

            potentialValidMove.setCol(potentialValidMove.getCol()+1);
            potentialValidMove.setRow(potentialValidMove.getRow()-1);

            //if spot is empty then it is valid.
            //if the spot has a piece of the same color, then it's not valid and stop.
            //if the spot has a piece of a different color, then it's valid and stop.
            System.out.print( chessMap.get(potentialValidMove) + " -- ");
            //System.out.println( "col #"+potentialValidMove.getCol());

            if(chessMap.get(potentialValidMove) == null)
                moves.add(new ChessPoint(potentialValidMove.getRow(), potentialValidMove.getCol()));
            else if (chessMap.get(potentialValidMove).color == this.color) {
                System.out.println("Piece with same color");
                break;
            }
            else {
                System.out.println("Piece with diff color");
                moves.add(new ChessPoint(potentialValidMove.getRow(), potentialValidMove.getCol()));
                break;
            }

            //System.out.println(potentialValidMove.getRow()+"--------"+potentialValidMove.getCol());
            System.out.println("Bishop right-up: " + potentialValidMove);
        }

        potentialValidMove.setRow(pieceRow);
        potentialValidMove.setCol(pieceCol);
        /*
         * Rook
         *   0 1 2 3 4 5 6 7
         * 0 x x o x x x R x
         * 1 x x x o x o x x
         * 2 x x x x B x x x
         * 3 x x x o x o x x
         * 4 x x o x x x o x
         * 5 x r x x x x x o
         * 6 x x x x x x x x
         * 7 x x x x x x x x
         */
        //ChessPoint  bishopWPos  = new ChessPoint( 2, 4 );
        //3,3 - 4,2 - 5,1
        //Trying to get the row entries to the left-down
        while(potentialValidMove.getCol() > 0 && potentialValidMove.getRow() < 7) {

            potentialValidMove.setCol(potentialValidMove.getCol()-1);
            potentialValidMove.setRow(potentialValidMove.getRow()+1);

            //if spot is empty then it is valid.
            //if the spot has a piece of the same color, then it's not valid and stop.
            //if the spot has a piece of a different color, then it's valid and stop.
            System.out.print( chessMap.get(potentialValidMove) + " -- ");
            //System.out.println( "col #"+potentialValidMove.getCol());

            if(chessMap.get(potentialValidMove) == null)
                moves.add(new ChessPoint(potentialValidMove.getRow(), potentialValidMove.getCol()));
            else if (chessMap.get(potentialValidMove).color == this.color) {
                System.out.println("Piece with same color");
                break;
            }
            else {
                System.out.println("Piece with diff color");
                moves.add(new ChessPoint(potentialValidMove.getRow(), potentialValidMove.getCol()));
                break;
            }

            //System.out.println(potentialValidMove.getRow()+"--------"+potentialValidMove.getCol());
            System.out.println("Bishop left-down: " + potentialValidMove);
        }

        potentialValidMove.setRow(pieceRow);
        potentialValidMove.setCol(pieceCol);

        //Trying to get the row entries to the right-down
        while(potentialValidMove.getCol() < 7 && potentialValidMove.getRow() < 7) {

            potentialValidMove.setCol(potentialValidMove.getCol()+1);
            potentialValidMove.setRow(potentialValidMove.getRow()+1);

            //if spot is empty then it is valid.
            //if the spot has a piece of the same color, then it's not valid and stop.
            //if the spot has a piece of a different color, then it's valid and stop.
            System.out.print( chessMap.get(potentialValidMove) + " -- ");
            //System.out.println( "col #"+potentialValidMove.getCol());

            if(chessMap.get(potentialValidMove) == null)
                moves.add(new ChessPoint(potentialValidMove.getRow(), potentialValidMove.getCol()));
            else if (chessMap.get(potentialValidMove).color == this.color) {
                System.out.println("Piece with same color");
                break;
            }
            else {
                System.out.println("Piece with diff color");
                moves.add(new ChessPoint(potentialValidMove.getRow(), potentialValidMove.getCol()));
                break;
            }

            //System.out.println(potentialValidMove.getRow()+"--------"+potentialValidMove.getCol());
            System.out.println("Bishop right-down: " + potentialValidMove);
        }




        return moves;
    }






}
