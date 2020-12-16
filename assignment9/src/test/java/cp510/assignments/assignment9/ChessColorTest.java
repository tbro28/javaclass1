package cp510.assignments.assignment9;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit tests for the ChessColor enum.
 * Best practices indicate to test enums,
 * especially for large teams and code bases.
 *
 * @author Tim
 */
public class ChessColorTest {

    /**
     * Test the White value.
     */
    @Test
    public void colorWhiteTest() {

        assertThat(ChessColor.valueOf("WHITE"), is(notNullValue()));
    }

    /**
     * Test the Black value.
     */
    @Test
    public void colorBlackTest() {

        assertThat(ChessColor.valueOf("BLACK"), is(notNullValue()));
    }
}
