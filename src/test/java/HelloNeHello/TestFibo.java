package HelloNeHello;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFibo {
    @Test
    public void testFibonachi(){
        assertEquals(0, Matematica.fib(0));
        assertEquals(1, Matematica.fib(1));
        assertEquals(1, Matematica.fib(2));
        assertEquals(8, Matematica.fib(6));
    }
    @Test
    public void testFibonachiNegative(){
        assertEquals(0, Matematica.fib(-3));
    }
}
