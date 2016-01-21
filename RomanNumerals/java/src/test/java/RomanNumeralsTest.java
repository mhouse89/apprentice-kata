import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsTest {

int result;

@Test
public void testRomanNumeralsConvertsIto1() throws Exception {
        result = RomanNumerals.convert("I");
        assertEquals(1, result);

}

@Test
public void testRomanNumeralsConvertsIIto2() throws Exception {
        result = RomanNumerals.convert("II");
        assertEquals(2, result);

}

@Test
public void testRomanNumeralsConvertsIIIto3() throws Exception {
        result = RomanNumerals.convert("III");
        assertEquals(3, result);

}

}
