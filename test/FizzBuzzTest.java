import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void of_0is0() {
        assertEquals("0", FizzBuzz.of(0));
    }

    @Test
    public void of_1is1() {
        assertEquals("1", FizzBuzz.of(1));
    }

    @Test
    public void of_3isFizz() {
        assertEquals("Fizz", FizzBuzz.of(3));
    }

    @Test
    public void of_5isBuzz() {
        assertEquals("Buzz", FizzBuzz.of(5));
    }

    @Test
    public void of_6isFizz() {
        assertEquals("Fizz", FizzBuzz.of(6));
    }

    @Test
    public void of_10isBuzz() {
        assertEquals("Buzz", FizzBuzz.of(10));
    }

    @Test
    public void of_15isFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.of(15));
    }
}
