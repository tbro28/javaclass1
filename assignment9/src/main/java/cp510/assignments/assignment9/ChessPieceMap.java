package cp510.assignments.assignment9;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Encapsulates a mapping from a ChessPoint to a ChessPiece. Note that the
 * algorithm for hashing a ChessPoint is perfect, i.e., there will never be a
 * collision. Since there are 64 ChessPoints, an initial capacity of 100 and a
 * load factor of .75 will guarantee that the map never needs to be rehashed.
 *
 * @author Tim Brown
 */
public class ChessPieceMap extends HashMap<ChessPoint,ChessPiece> {

    HashMap<ChessPoint, ChessPiece> map;

    /**
     * Creates a <ChessPoint,ChessPiece> map with an initial size of 100,
     * and a load factor of .75.
     */
    public ChessPieceMap() {

        map = new HashMap<ChessPoint, ChessPiece>(100, 0.75f);
    }

    /**
     *
     *     Returns the ChessPiece mapped to the given ChessPoint.
     *     This method is identical to Map<ChessPoint,ChessPiece>.get,
     *     but throws an exception if the given point is not a valid square.
     *     Returns null if the ChessPoint is not in the map.
     *
     * @param point
     * @return
     * @throws ChessException
     */
    public ChessPiece get(ChessPoint point) throws ChessException{

        if (point.getRow() < 0 || point.getRow() > 7) {
            if (point.getCol() < 0 || point.getCol() > 7) {
                throw new ChessException("Not a valid square.");
            }
        }

        //Returns null if the ChessPoint is not in the map.
//WON'T THIS RETURN NULL if not found.
        return map.get(point);
    }


    /**
     *
     * Gets the key associated with the given value. Returns null if
     * the given value cannot be found.
     *
     * @param piece
     * @return
     */
    public ChessPoint getKey(ChessPiece piece) {

        ChessPoint point = null;

        // Iterate the map using for-each loop
        for(Map.Entry<ChessPoint, ChessPiece> e : map.entrySet()) {
            if (e.getValue() == piece) {
                point = e.getKey();
            }
        }

        return point;
    }


    /**
     *
     *     Adds a ChessPoint/ChessPiece entry to the map.
     *     Null values are not permitted.
     *     This method is identical to Map<ChessPoint,ChessPiece>.put,
     *     but throws an exception
     *     if the given point is not a valid square on a chess board,
     *     or the given value is null.
     *
     * @param point
     * @param piece
     * @return
     * @throws ChessException
     */
    public ChessPiece put(ChessPoint point, ChessPiece piece) throws ChessException {

        ChessPiece addedChessPiece;

        if (point.getRow() < 0 || point.getRow() > 7) {
            if (point.getCol() < 0 || point.getCol() > 7) {
                throw new ChessException("Not a valid square.");
            }
        }

        if(piece == null)
            throw new ChessException("The piece provided is NULL.");

        map.put(point, piece);
        //addedChessPiece = piece;

        return piece;
    }


    /**
     *
     *     Instantiates a ChessMap with all pieces in the traditional start positions;
     *     a black rook will be in square (0, 0).
     *
     * @return
     */
    public static ChessPieceMap newGame() {

        ChessPieceMap newGameMap = new ChessPieceMap();

        //Place the rooks.
        ChessPiece bRookPiece1 = new Rook(ChessColor.BLACK);
        ChessPiece bRookPiece2 = new Rook(ChessColor.BLACK);
        ChessPoint bRookPoint1 = new ChessPoint(0,0);
        ChessPoint bRookPoint2 = new ChessPoint(0,7);
        newGameMap.put(bRookPoint1, bRookPiece1);
        newGameMap.put(bRookPoint2, bRookPiece2);

        ChessPiece wRookPiece1 = new Rook(ChessColor.WHITE);
        ChessPiece wRookPiece2 = new Rook(ChessColor.WHITE);
        ChessPoint wRookPoint1 = new ChessPoint(7,0);
        ChessPoint wRookPoint2 = new ChessPoint(7,7);
        newGameMap.put(wRookPoint1, wRookPiece1);
        newGameMap.put(wRookPoint2, wRookPiece2);

        //Place the knights.
        ChessPiece bKnightPiece1 = new Knight(ChessColor.BLACK);
        ChessPiece bKnightPiece2 = new Knight(ChessColor.BLACK);
        ChessPoint bKnightPoint1 = new ChessPoint(0,1);
        ChessPoint bKnightPoint2 = new ChessPoint(0,6);
        newGameMap.put(bKnightPoint1, bKnightPiece1);
        newGameMap.put(bKnightPoint2, bKnightPiece2);

        ChessPiece wKnightPiece1 = new Knight(ChessColor.WHITE);
        ChessPiece wKnightPiece2 = new Knight(ChessColor.WHITE);
        ChessPoint wKnightPoint1 = new ChessPoint(7,1);
        ChessPoint wKnightPoint2 = new ChessPoint(7,6);
        newGameMap.put(wKnightPoint1, wKnightPiece1);
        newGameMap.put(wKnightPoint2, wKnightPiece2);

        //Place the bishops.
        ChessPiece bBishopPiece1 = new Bishop(ChessColor.BLACK);
        ChessPiece bBishopPiece2 = new Bishop(ChessColor.BLACK);
        ChessPoint bBishopPoint1 = new ChessPoint(0,2);
        ChessPoint bBishopPoint2 = new ChessPoint(0,5);
        newGameMap.put(bBishopPoint1, bBishopPiece1);
        newGameMap.put(bBishopPoint2, bBishopPiece2);

        ChessPiece wBishopPiece1 = new Bishop(ChessColor.WHITE);
        ChessPiece wBishopPiece2 = new Bishop(ChessColor.WHITE);
        ChessPoint wBishopPoint1 = new ChessPoint(7,2);
        ChessPoint wBishopPoint2 = new ChessPoint(7,5);
        newGameMap.put(wBishopPoint1, wBishopPiece1);
        newGameMap.put(wBishopPoint2, wBishopPiece2);

        //Place the Kings and queens.
        ChessPiece bKingPiece = new King(ChessColor.BLACK);
        ChessPoint bKingPoint = new ChessPoint(0,3);
        ChessPiece bQueenPiece = new Queen(ChessColor.BLACK);
        ChessPoint bQueenPoint = new ChessPoint(0,4);
        newGameMap.put(bKingPoint, bKingPiece);
        newGameMap.put(bQueenPoint, bQueenPiece);

        ChessPiece wKingPiece = new King(ChessColor.WHITE);
        ChessPoint wKingPoint = new ChessPoint(7,3);
        ChessPiece wQueenPiece = new Queen(ChessColor.WHITE);
        ChessPoint wQueenPoint = new ChessPoint(7,4);
        newGameMap.put(wKingPoint, wKingPiece);
        newGameMap.put(wQueenPoint, wQueenPiece);

        //Place the pawns.
        ChessPiece bPawnPiece;
        ChessPiece wPawnPiece;

        for(int col = 0; col < 8; col++) {
            bPawnPiece = new Pawn(ChessColor.BLACK);
            wPawnPiece = new Pawn(ChessColor.WHITE);
            newGameMap.put(new ChessPoint(1, col), bPawnPiece);
            newGameMap.put(new ChessPoint(6, col), wPawnPiece);
        }

        return newGameMap;
    }
}
