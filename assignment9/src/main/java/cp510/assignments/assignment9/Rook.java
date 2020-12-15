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

        ChessPoint potentialValidMove = new ChessPoint(piecePotentialValidMoveRow, piecePotentialValidMoveCol);

        //Trying to get the row entries to the left
        //Need to get row, col-1 until col is less than 0
        while(potentialValidMove.getCol() > 0) {

            potentialValidMove.setCol(potentialValidMove.getCol()-1);

            //if spot is empty then it is valid.
            //if the spot has a piece of the same color, then it's not valid and stop.
            //if the spot has a piece of a different color, then it's valid and stop.
            System.out.print( chessMap.get(potentialValidMove) + " -- ");
            //System.out.println( "col #"+potentialValidMove.getCol());

            if(chessMap.get(potentialValidMove) == null)
                moves.add(new ChessPoint(pieceRow, potentialValidMove.getCol()));
            else if (chessMap.get(potentialValidMove).color == this.color) {
                System.out.println("Piece with same color");
                break;
            }
            else {
                System.out.println("Piece with diff color");
                moves.add(new ChessPoint(pieceRow, potentialValidMove.getCol()));
                break;
            }

            //System.out.println(potentialValidMove.getRow()+"--------"+potentialValidMove.getCol());
            System.out.println("ROOK left: " + potentialValidMove);
        }

        //System.out.println(moves);

        //Trying to get the row entries to the right
        //Need to get row, col+1 e.getCol() is greater than 7) {
        potentialValidMove.setCol(pieceCol);

        while(potentialValidMove.getCol() < 7) {

            potentialValidMove.setCol(potentialValidMove.getCol()+1);

            //if spot is empty then it is valid.
            //if the spot has a piece of the same color, then it's not valid and stop.
            //if the spot has a piece of a different color, then it's valid and stop.
            System.out.print( chessMap.get(potentialValidMove) + " -- ");

            if(chessMap.get(potentialValidMove) == null)
                moves.add(new ChessPoint(pieceRow, potentialValidMove.getCol()));
            else if (chessMap.get(potentialValidMove).color == this.color) {
                System.out.println("Piece with same color");
                break;
            }
            else {
                System.out.println("Piece with diff color");
                moves.add(new ChessPoint(pieceRow, potentialValidMove.getCol()));
                break;
            }
            System.out.println("ROOK right: " + potentialValidMove);
        }

        //Trying to get the col entries to the top
        //Need to get col, row-1 e.getRow() is less than 0) {
        potentialValidMove.setCol(pieceCol);

        while(potentialValidMove.getRow() > 0) {

            potentialValidMove.setRow(potentialValidMove.getRow()-1);

            //if spot is empty then it is valid.
            //if the spot has a piece of the same color, then it's not valid and stop.
            //if the spot has a piece of a different color, then it's valid and stop.
            System.out.print( chessMap.get(potentialValidMove) + " -- ");
            //System.out.println( "col #"+potentialValidMove.getCol());

            if(chessMap.get(potentialValidMove) == null)
                moves.add(new ChessPoint(potentialValidMove.getRow(), pieceCol));
            else if (chessMap.get(potentialValidMove).color == this.color) {
                System.out.println("Piece with same color");
                break;
            }
            else {
                System.out.println("Piece with diff color");
                moves.add(new ChessPoint(potentialValidMove.getRow(), pieceCol));
                break;
            }

            //System.out.println(potentialValidMove.getRow()+"--------"+potentialValidMove.getCol());
            System.out.println("ROOK up: " + potentialValidMove);
        }


        //Trying to get the col entries to the top
        //Need to get col, row-1 e.getRow() is less than 0) {
        potentialValidMove.setRow(pieceRow);

        while(potentialValidMove.getRow() < 7) {

            potentialValidMove.setRow(potentialValidMove.getRow()+1);

            //if spot is empty then it is valid.
            //if the spot has a piece of the same color, then it's not valid and stop.
            //if the spot has a piece of a different color, then it's valid and stop.
            System.out.print( chessMap.get(potentialValidMove) + " -- ");
            //System.out.println( "col #"+potentialValidMove.getCol());

            if(chessMap.get(potentialValidMove) == null)
                moves.add(new ChessPoint(potentialValidMove.getRow(), pieceCol));
            else if (chessMap.get(potentialValidMove).color == this.color) {
                System.out.println("Piece with same color");
                break;
            }
            else {
                System.out.println("Piece with diff color");
                moves.add(new ChessPoint(potentialValidMove.getRow(), pieceCol));
                break;
            }

            //System.out.println(potentialValidMove.getRow()+"--------"+potentialValidMove.getCol());
            System.out.println("ROOK down: " + potentialValidMove);
        }
/*
        for (ChessPoint i : moves) {
            System.out.println("What? "+i);
        }
*/

        return moves;
    }


}
