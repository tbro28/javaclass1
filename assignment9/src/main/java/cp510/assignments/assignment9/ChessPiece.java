package cp510.assignments.assignment9;

import java.awt.*;
import java.util.List;

/**
 *
 * Root class of all chess pieces.
 *
 * @author Tim Brown
 */
public abstract class ChessPiece {

    String name;	    //the name of this chess piece, e.g. "bishop"
    Image image;		//the image to draw on the chess board
                        //Note: for this assignment this value will always be null
    ChessColor color;	//the color of this chess piece
    boolean isAlive;	//true if this chess piece has not been captured


    /**
     *
     * When invoking this constructor, the imagePath should be the empty string,
     * the color will be one of ChessColor.BLACK or ChessColor.WHITE,
     * and the name will be the name of the chess piece.
     *
     * @param name
     * @param imagePath
     * @param color
     */
    public ChessPiece(String name, String imagePath, ChessColor color) {
        this.name = name;
        this.color = color;
        this.image = null;
        //imagePath is always empty.
    }

    /**
     *
     *     Returns a list of all valid moves for this chess piece
     *     given the state of the chess board.
     *     Note: all ChessPiece subclasses except Bishop and Rook
     *     should return an empty list (return new ArrayList<ChessPoint>()).
     *
     * @param chessMap
     * @return
     */
    public abstract List<ChessPoint> getValidMoves(ChessPieceMap chessMap);

    /**
     *
     * Getter for the name property.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * Getter for the image property.
     * Note: for this assignment this method should return null.
     *
     * @return
     */
    public Image getImage() {
        return null;
    }

    /**
     *
     * Getter for this chess piece's color.
     *
     * @return
     */
    public ChessColor getColor() {
        return color;
    }

    /**
     *
     * Getter for the isAlive property. Returns true if this piece has not been captured.
     *
     * @return
     */
    public boolean isAlive() {
        return isAlive;
    }

    /**
     *
     * Setter for the isAlive property.
     *
     * @param alive
     */
    public void setAlive(boolean alive) {
        isAlive = alive;
    }

}
