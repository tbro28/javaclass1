import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    public int num(int i) {
        return i+1;
    }

    @Test
    public void HelloNumTest() {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        HelloWorld.main(cars);

        assertEquals(1+1, 2);
        assertTrue(true);
        assertEquals(2, num(1));

        Assert.assertNull(null);
    }

}
