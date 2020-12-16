package cp510.assignments.assignment9;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for the ChessPieceMap class.
 *
 * @author Tim
 */
public class ChessExceptionTest {


    /**
     *
     * Test method for ChessException errors.
     *
     * @param param
     */
    public void throwsChessExceptions(int param){

        ChessException ex = new ChessException();

        if(param == 0)
            throw new ChessException();
        else if(param == 1)
            throw new ChessException("Test error string.");
        else if(param == 2)
            throw new ChessException("Test error string.", ex);
        else
            throw new ChessException(ex);

    }

    /**
     * Test the invalid square exception handling no arguments.
     */
    @Test
    public void chessExceptionNoArgsTest() {
        assertThrows(ChessException.class, () -> throwsChessExceptions(0));
    }

    /**
     * Test the invalid square exception handling String message argument.
     */
    @Test
    public void chessExceptionStringArgTest() {
        Throwable thrown = assertThrows(ChessException.class, () -> throwsChessExceptions(1));
        assertThat(thrown.getMessage(), is("Test error string."));
        assertThrows(ChessException.class, () -> throwsChessExceptions(1));
    }

    /**
     * Test the invalid square exception handling String message and Throwable argument.
     */
    @Test
    public void chessExceptionStringAndThrowableArgTest() {
        Throwable thrown = assertThrows(ChessException.class, () -> throwsChessExceptions(2));
        assertThat(thrown.getMessage(), is("Test error string."));
        assertThrows(ChessException.class, () -> throwsChessExceptions(2));
    }

    /**
     * Test the invalid square exception handling Throwable argument.
     */
    @Test
    public void chessExceptionThrowableArgTest() {
        Throwable thrown = assertThrows(ChessException.class, () -> throwsChessExceptions(3));
        //assertThat(thrown.getCause(), is(ChessException.class));
        assertThrows(ChessException.class, () -> throwsChessExceptions(3));
    }

}
