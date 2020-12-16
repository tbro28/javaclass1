package cp510.assignments.assignment9;

import java.util.Objects;

/**
 *
 * This class will have the following properties, constructors and methods.
 *
 * @author Tim Brown
 */
public class ChessPoint {

    private int row;    //the row of a square on the board
    private int col; // the column of a square on the board

    /**
     * Sets the row and col properties to (0, 0).
     */
    public ChessPoint() {
        row = 0;
        col = 0;
    }

    /**
     *
     * Sets the row and column to the given values.
     *
     * @param row
     * @param col
     */
    public ChessPoint(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     *
     * Copy constructor; copies the properties of the
     * given ChessPoint to this ChessPoint.
     *
     * @param toCopy
     */
    public ChessPoint( ChessPoint toCopy ) {

        this.row = toCopy.getRow();
        this.col = toCopy.getCol();
    }

    /**
     *
     *     Adds the given values to the row and column of this object.
     *     If the operation would cause either property to be less than 0
     *     or greater than 7 the operation is not performed
     *     and false is returned.
     *
     * @param row
     * @param col
     * @return a boolean for whether adding to
     * the chess point positions was valid.
     */
    public boolean add( int row, int col ) {

        boolean added = false;

        int newRow = this.row + row;
        int newCol = this.col + col;

        if(newRow < 8 && newRow > -1) {
            if(newCol < 8 && newCol > -1) {

                this.row = newRow;
                this.col = newCol;
                added = true;
            }
        }

        return added;
    }


    /**
     *
     *     Calculates a hash code for this ChessPoint. The algorithm produces
     *     a perfect hash in the range (0, 0) to (7, 7), inclusive.
     *     There should never be a collision between two points
     *     on a chess board.
     *
     * @return the hashcode of this chess point.
     */
    public int hashCode() {

        int hash = Objects.hash(8*(row+col));

        return hash;
    }

    /**
     *
     *     Returns true if this ChessPoint is equal to the given object.
     *     The objects are equal if the given object is non-null,
     *     is an instance of
     *     ChessPoint and has the same row and column coordinates
     *     as this ChessPiece.
     *
     * @param obj
     * @return whether the to points are equal.
     */
    public boolean equals(Object obj) {

        boolean areEqual = false;

        if(obj != null) {
            if(obj instanceof ChessPoint) {
                if(this.row == ((ChessPoint) obj).getRow()
                        && this.col == ((ChessPoint) obj).col) {
                    areEqual = true;
                }
            }
        }

        return areEqual;
    }

    /**
     *
     * Getter for the column property.
     *
     * @return the column value for this chess point.
     */
    public int getCol() {
        return col;
    }

    /**
     *
     * Setter for the column property.
     *
     * @param col
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     *
     * Getter for the row property.
     *
     * @return the row value for this chess point.
     */
    public int getRow() {
        return row;
    }

    /**
     *
     * Setter for the row property.
     *
     * @param row
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     *
     * Convenience method to set the row and column properties at the same time.
     *
     * @param row
     * @param col
     */
    public void setPoint(int row, int col) {

        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return  "row=" + row +
                ",column=" + col;
    }

}
