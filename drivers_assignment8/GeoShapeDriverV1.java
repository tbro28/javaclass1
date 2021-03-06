package cp510.assignments.geo_shape;

import java.awt.*;


public class GeoShapeDriverV1
{
    public static void main(String[] args)
    {
        cp510.assignments.geo_shape.GeoPoint point1  = new cp510.assignments.geo_shape.GeoPoint();
        point1.setXco( 5.55555 );;
        point1.setYco( 4.44444 );

        cp510.assignments.geo_shape.GeoPoint point2  = new cp510.assignments.geo_shape.GeoPoint();
        point2.setXco( 54.66666 );
        point2.setYco( 133.33333 );

        cp510.assignments.geo_shape.GeoPoint point3  = new cp510.assignments.geo_shape.GeoPoint();
        point3.setXco( 200 );
        point3.setYco( 400 );

        cp510.assignments.geo_shape.GeoPoint point4  = new cp510.assignments.geo_shape.GeoPoint();
        point4.setXco( 1000 );
        point4.setYco( 2000 );

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println(point4);

        System.out.println(point3.distance(point4));

//        point1.str();


        cp510.assignments.geo_shape.GeoPoint point5  = new cp510.assignments.geo_shape.GeoPoint();

        point5.setXco(.5);
        point5.setYco(.5);
        System.out.println(point5);

/*
        GeoShape    shape   = new GeoShape();

        shape.setColor( null );
        System.out.println( shape );
        shape.setOrigin( point1 );
        System.out.println( shape );
        shape.setColor( Color.RED );
        System.out.println( shape );
*/


        GeoRectangle    rect    = new GeoRectangle(1,1);
        rect.setColor( null );
        rect.setOrigin( point2 );
        rect.setWidth( 50.33333 );
        rect.setHeight( 60.66666 );
        System.out.println( rect );
        rect.setColor( Color.BLUE );
        System.out.println( rect );
        rect.setWidth( 5 );
        rect.setHeight( 10 );
        System.out.println( rect );
        System.out.println( rect.area() );
        System.out.println( rect.perimeter() );





        GeoOval oval    = new GeoOval(1, 1);
        oval.setColor( null );
        oval.setOrigin( point3 );
        oval.setWidth( 10.1234456 );
        oval.setHeight( 20.1234567 );
        System.out.println( oval );
        oval.setColor( Color.GREEN );
        System.out.println( oval );
        oval.setWidth( 10 );
        oval.setHeight( 20 );
        System.out.println( oval );



        cp510.assignments.geo_shape.GeoPoint start = new cp510.assignments.geo_shape.GeoPoint(1,1);
        cp510.assignments.geo_shape.GeoPoint end = new cp510.assignments.geo_shape.GeoPoint(5, 5);

        GeoLine line    = new GeoLine(start, end);

        line.setColor( null );
        line.setOrigin( point3 );
        line.setEnd( point1 );

        System.out.println( line );

        line.setColor( Color.GREEN );
        System.out.println( line );

        line.setStart( point2 );
        System.out.println("===" + line );
        line.setEnd( point3 );
        System.out.println("___" + line );


        System.out.println(line.length());

        System.out.println( new GeoPlane().getBackgroundColor() );

        System.out.println( "******** Null Point Checks *********" );
//        tryNullPoint( shape );
        tryNullPoint( rect );
        tryNullPoint( oval );
        tryNullPoint( line );


//        tryNullPoint( shape );
        System.out.println( new GeoPlane().getBackgroundColor() );

    }



    private static void tryNullPoint( GeoShape shape )
    {
        String  name    = shape.getClass().getName();
        System.out.print( name + "... " );
        try
        {
            shape.setOrigin( null );
            System.out.println( "failed" );
        }
        catch ( NullPointerException exc )
        {
            System.out.println( "passed" );
        }
    }




}
