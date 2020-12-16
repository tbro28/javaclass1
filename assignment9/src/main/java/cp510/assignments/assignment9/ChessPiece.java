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

    /**
     * The name of this chess piece, e.g. "bishop".
     */
    String name;

    /**
     * The image to draw on the chess board.
     * Note: for this assignment this value will always be null.
     */
    Image image;

    /**
     * The color of this chess piece.
     */
    ChessColor color;

    /**
     * True if this chess piece has not been captured.
     */
    boolean isAlive;


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
        image = null;
        isAlive = true;
        //imagePath is not implemented and is always empty.
    }

    /**
     *
     *     Returns a list of all valid moves for this chess piece
     *     given the state of the chess board.
     *     Note: all ChessPiece subclasses except Bishop and Rook
     *     should return an empty list (return new ArrayList<ChessPoint>()).
     *
     * @param chessMap
     * @return valid moves.
     */
    public abstract List<ChessPoint> getValidMoves(ChessPieceMap chessMap);

    /**
     *
     * Getter for the name property.
     *
     * @return the chess piece name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * Getter for the image property.
     * Note: for this assignment this method should return null.
     *
     * @return the chess piece image.
     */
    public Image getImage() {
        return null;
    }

    /**
     *
     * Getter for this chess piece's color.
     *
     * @return the chess piece color.
     */
    public ChessColor getColor() {
        return color;
    }

    /**
     *
     * Getter for the isAlive property.
     * Returns true if this piece has not been captured.
     *
     * @return if the chess piece is alive.
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
