package HelloNeHello;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFact {
    @Test
    public void testFactorial() {
        assertEquals(1, Matematica.fact(0));
        assertEquals(1, Matematica.fact(1));
        assertEquals(3628800, Matematica.fact(10));
        //assertEquals("Не надо так!", Matematica.fact(-3));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Matematica.fact(-3);
    }
}
