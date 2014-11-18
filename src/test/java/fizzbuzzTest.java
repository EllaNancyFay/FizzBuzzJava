import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by ellaschofield on 18/11/2014.
 */
public class fizzbuzzTest {

    FizzBuzz fizzBuzz;

    @Before
    public void startUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test public void isDivisibleByThree() {
        assertTrue(fizzBuzz.isDivisibleByThree(3));
    }

    @Test public void isNotDivisibleByThree() {
        assertFalse(fizzBuzz.isDivisibleByThree(1));
    }

    @Test public void isDivisibleByFive() {
        assertTrue(fizzBuzz.isDivisibleByFive(5));
    }

    @Test public void isNotDivisibleByFive() {
        assertFalse(fizzBuzz.isDivisibleByFive(1));
    }

    @Test public void isDivisibleByFifteen() {
        assertTrue(fizzBuzz.isDivisibleByFifteen(15));
    }

    @Test public void isNotDivisibleByFifteen() {
        assertFalse(fizzBuzz.isDivisibleByFifteen(1));
    }

    @Test public void itSaysFizzWhenDivisibleByThree() {
        assertEquals("Fizz", fizzBuzz.itSays(3));
    }

    @Test public void itSaysBuzzWhenDivisibleByFive() {
        assertEquals("Buzz", fizzBuzz.itSays(5));
    }

    @Test public void itSaysFizzBuzzWhenDivisibleByFifteen() {
        assertEquals("FizzBuzz", fizzBuzz.itSays(15));
    }

    @Test public void itReturnsTheNumber() {
        assertEquals("4", fizzBuzz.itSays(4));
    }
}
