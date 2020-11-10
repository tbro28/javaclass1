package cp510.assignments.geo_shape;

/**
 * Encapsulates a line.
 *
 * @author Tim
 */
public class GeoLine extends GeoShape {

    /**
     * End point of the line.
     */
    private GeoPoint end;

    /**
     * Constructor to create an end point.
     */
    GeoLine(){
        end = new GeoPoint();
    }

    /**
     * Returns the endpoint of this line.
     *
     * @return end
     */
    public GeoPoint getEnd() {
        return end;
    }

    /**
     * Sets the endpoint of this line to the given value.
     *
     * @param end
     * @throws NullPointerException
     */
    public void setEnd( GeoPoint end ) throws NullPointerException {

        if(end.equals(null))
            throw new NullPointerException();
        else
            this.end = end;
    }

    /**
     * Returns the starting point of this line.
     *
     * @return origin
     */
    public GeoPoint getStart() {
        return super.getOrigin();
    }

    /**
     * Sets the starting point of the line.
     *
     * @param start
     */
    public void setStart( GeoPoint start ) {
        super.setOrigin(start);
    }

    /**
     * Returns the length of this line.
     *
     * @return length
     */
    public double length() {

        double x = Math.pow((end.getXco() - getStart().getXco()), 2);
        double y = Math.pow((end.getYco() - getStart().getYco()), 2);
        double c = Math.sqrt((x+y));

        return c;
    }

    /**
     * Returns a string describing the properties of this line.
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() +
                "," +
                "end=" + end;
    }

}
