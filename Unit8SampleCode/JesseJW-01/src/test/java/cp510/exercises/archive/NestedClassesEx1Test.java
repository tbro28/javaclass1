//package cp510.exercises.archive;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import java.awt.AWTException;
//import java.awt.Component;
//import java.awt.Frame;
//import java.awt.Graphics;
//import java.awt.Robot;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.image.BufferedImage;
//import java.util.function.Predicate;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import cp510.exercises.Utils;
//
//class NestedClassesEx1Test
//{
//    private NestedClassesEx1    tester;
//    private Robot               robot;
//    private Object              interruptObject;
//    private long                pauseForNewFrame    = 250;
//    private long                pauseForButtonClick = 250;
//    
//    @BeforeEach
//    private void init()
//    {
//        tester = new NestedClassesEx1();
//        interruptObject = null;
//        Utils.pause( pauseForNewFrame );
////        dumpFrames();
//        Component   comp    = 
//            Utils.findComponent( c -> c instanceof JFrame );
//        assertNotNull( comp );
//        assertTrue( ((JFrame)comp).isVisible() );
//        
//        try
//        {
//            robot = new Robot();
//            robot.delay( 500 );
//        }
//        catch ( AWTException exc )
//        {
//            exc.printStackTrace();
//            throw new RuntimeException( "failed to create robot" );
//        }
//    }
//
//    @AfterEach
//    void disposeAll()
//    {
//        Frame[] frames      = Frame.getFrames();
//        for ( Frame frame : frames )
//            frame.dispose();
//    }
//    
////    @Test
////    void testNestedClassesEx1()
////    {
//           // constructor is tested in @BeforeEach method
////    }
//
//    @Test
//    void testChangeSandboxColor()
//    {
//        BufferedImage   imageBefore = getBitMap();
//        tester.changeSandboxColor();
//        BufferedImage   imageAfter  = getBitMap();
//        
//        int             colorBefore = imageBefore.getRGB( 0,  0 );
//        int             colorAfter  = imageAfter.getRGB( 0,  0 );
//        assertNotEquals( colorBefore, colorAfter );
//        
////        int width   = imageBefore.getWidth();
////        for ( int inx = 0 ; inx < 20 ; ++inx )
////            System.out.print( imageBefore.getRGB( inx, 0 ) );
////        System.out.println( width );
////        
////        width   = imageAfter.getWidth();
////        for ( int inx = 0 ; inx < 20 ; ++inx )
////            System.out.print( imageAfter.getRGB( inx, 0 ) + ' ' );
////        System.out.println( width ); 
//    }
//
//    @Test
//    void testChangeShapeColor()
//    {
//        BufferedImage   imageBefore = getBitMap();
//        tester.changeShapeColor();
//        BufferedImage   imageAfter  = getBitMap();
//        
//        int             width       = imageBefore.getWidth();
//        int             height      = imageBefore.getHeight();
//        assertEquals( width, imageAfter.getWidth() );
//        assertEquals( height, imageAfter.getHeight() );
//        
//        int             bgBefore    = imageBefore.getRGB( 0, 0 );
//        int             bgAfter     = imageAfter.getRGB( 0, 0 );
//        assertEquals( bgBefore, bgAfter );
//        
//        int             xco         = width / 2;
//        int             yco         = height / 2;
//        int             colorBefore = imageBefore.getRGB( xco, yco );
//        int             colorAfter  = imageAfter.getRGB( xco, yco );
//        assertNotEquals( colorBefore, colorAfter );
//    }
//
//    @Test
//    void testAddSandboxListener()
//    {
//        JButton button  = getButton( "sand" );
//        tester.addSandboxListener( new ButtonListener() );
//        assertNotNull( button );
//        
//        doClick( button );
//        assertNotNull( interruptObject );
//        assertEquals( button, interruptObject );
//    }
//
//    @Test
//    void testAddShapeListener()
//    {
//        JButton button  = getButton( "shape" );
//        tester.addShapeListener( new ButtonListener() );
//        assertNotNull( button );
//        
//        button.doClick();
//        Utils.pause( pauseForButtonClick );
//        assertNotNull( interruptObject );
//        assertEquals( button, interruptObject );
//    }
//
//    @Test
//    void testAddExitListener()
//    {
//        JButton button  = getButton( "exit" );
//        tester.addExitListener( new ButtonListener() );
//        assertNotNull( button );
//        
//        button.doClick();
//        Utils.pause( pauseForButtonClick );
//        assertNotNull( interruptObject );
//        assertEquals( button, interruptObject );
//    }
//    
//    @Test
//    void temp()
//    {
//        BufferedImage   image   = getBitMap();
//        int             width   = image.getWidth();
//        int             height  = image.getHeight();
//        int             bgColor = image.getRGB( 0, 0 );
//        for ( int yco = 0 ; yco < height ; ++yco )
//        {
//            for ( int xco = 0 ; xco < width ; ++xco )
//            {
//                int     color   = image.getRGB( xco, yco );
//                char    out     = color == bgColor ? 'b' : 'F';
//                System.out.print( out );
//            }
//            System.out.println();
//        }
//    }
//    
//    private JButton getButton( final String label )
//    {
//        Predicate<Component>    pred    = new Predicate<>()
//        {
//            @Override
//            public boolean test( Component comp )
//            {
//                boolean rcode   = false;
//                if ( rcode = (comp instanceof JButton) )
//                {
//                    final String toFind = label.toLowerCase();
//                    
//                    JButton butt    = (JButton)comp;
//                    String  text    = butt.getText().toLowerCase();
//                    rcode = text.startsWith( toFind );
//                }
//                return rcode;
//            }
//        };
//        
//        JButton button  = (JButton)Utils.findComponent( pred );
//        return button;
//    }
//    
//    private void doClick( JButton button )
//    {
//        button.doClick();
//        Utils.pause( pauseForButtonClick );
//    }
//    
////    private void dumpFrames()
////    {
////        Frame[] frames      = Frame.getFrames();
////        int     frameLen    = frames.length;
////        StringBuilder   bldr    = new StringBuilder( frames.length );
////        System.out.print( frameLen );
////        for ( Frame frame : frames )
////        {
////            bldr.append( " visible=" ).append( frame.isVisible() )
////                .append( " state=" ).append( frame.getExtendedState() );
////            System.out.print( bldr );
////        }
////        System.out.println();
////    }
//    
//    private BufferedImage getBitMap()
//    {
//        Predicate<Component> pred    = 
//            c -> c instanceof JPanel && ((JPanel)c).getComponentCount() == 0;
//        Component   comp    = Utils.findComponent( pred );
//        assertNotNull( comp );
//        
//        JPanel          panel   = (JPanel)comp;
//        int             width   = panel.getWidth();
//        int             height  = panel.getHeight();
//        int             type    = BufferedImage.TYPE_INT_RGB;
//        BufferedImage   image   = new BufferedImage( width, height, type );
//        Graphics        gtx     = image.getGraphics(); 
//        panel.getParent().paintComponents( gtx );
//        return image;
//    }
//
//    private class ButtonListener implements ActionListener
//    {
//        public void actionPerformed( ActionEvent evt )
//        {
//            interruptObject = evt.getSource();
////            System.out.println( interruptObject );
//        }
//    }
//}
