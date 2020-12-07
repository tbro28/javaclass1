package cp510.assignments.assignment7;

public class ListDriverV2
{
    public static void main(String[] args)
    {
        addRemoveHead();
        addRemoveTail();
        addRemoveMiddle1();
        addRemoveMiddle2();
    }

    private static void addRemoveHead()
    {
        DList   list    = new DList();
        list.setData( " list:: " );

        System.out.println( "*******************************" );
        System.out.println( "******** addRemoveHead ********" );
        printList( list );
        for ( int inx = 0 ; inx < 5 ; ++inx )
        {
            String  data    = " Node " + inx + "::";
            DNode   node    = new DNode( data );
            list.addHead( node );;
            printList( list );
        }

        System.out.println("---Size should be 5: " + list.size());

        while ( !list.isEmpty() )
        {
            list.removeHead();
            printList( list );
        }
    }

    private static void addRemoveTail()
    {
        DList   list    = new DList();
        list.setData( " list:: " );

        System.out.println( "*******************************" );
        System.out.println( "******** addRemoveTail ********" );
        printList( list );
        for ( int inx = 0 ; inx < 5 ; ++inx )
        {
            String  data    = " Node " + inx + "::";
            DNode   node    = new DNode( data );
            list.addTail( node );;
            printList( list );
        }

        while ( !list.isEmpty() )
        {
            list.removeTail();
            printList( list );
        }

        list.setData("---Remove tail for an already empty list.");

        list.removeTail();

        printList( list );
    }

    private static void addRemoveMiddle1()
    {
        DList   list    = new DList();
        list.setData( " list:: " );
        DNode   head    = new DNode( " head::" );
        list.addHead( head );

        System.out.println( "*******************************" );
        System.out.println( "******* addRemoveMiddle1 ******" );

        printList( list );
        for ( int inx = 0 ; inx < 5 ; ++inx )
        {
            String  data    = " Node " + inx + "::";
            DNode   node    = new DNode( data );
            head.addAfter( node );;
            printList( list );
        }

        DNode   next;
        while ( (next = head.getNext()) != list )
        {
            next.remove();
            printList( list );
        }
        printList( list );
        list.getNext().remove();
        printList( list );
        list.getNext().remove();
        printList( list );
        head.remove();
        printList( list );
    }

    private static void addRemoveMiddle2()
    {
        DList   list    = new DList();
        list.setData( " list:: " );
        DNode   tail    = new DNode( " tail::" );
        list.addTail( tail );

        System.out.println( "*******************************" );
        System.out.println( "******* addRemoveMiddle2 ******" );

        printList( list );
        for ( int inx = 0 ; inx < 5 ; ++inx )
        {
            String  data    = " Node " + inx + "::";
            DNode   node    = new DNode( data );
            tail.addBefore( node );;
            printList( list );
        }

        DNode   prev;
        while ( (prev = tail.getPrevious()) != list )
        {
            prev.remove();
            printList( list );
        }
        printList( list );
        list.getPrevious().remove();
        printList( list );
        list.getNext().remove();
        printList( list );
        tail.remove();
        printList( list );
    }


    private static void printList( DList list )
    {
        DNode   node    = null;
        for ( node = list.getHead() ; node != list ; node = node.getNext() )
            System.out.print( node.getData() );
        System.out.println( node.getData() );
    }
}