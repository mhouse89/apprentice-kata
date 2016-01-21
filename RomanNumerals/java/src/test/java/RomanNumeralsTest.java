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

@Test
public void testRomanNumeralsConvertsIVto4() throws Exception {
        result = RomanNumerals.convert("IV");
        assertEquals(4, result);

}

@Test
public void testRomanNumeralsConvertsVto5() throws Exception {
        result = RomanNumerals.convert("V");
        assertEquals(5, result);

}

@Test
public void testRomanNumeralsConvertsVIto6() throws Exception {
        result = RomanNumerals.convert("VI");
        assertEquals(6, result);

}

@Test
public void testRomanNumeralsConvertsIXto9() throws Exception {
        result = RomanNumerals.convert("IX");
        assertEquals(9, result);

}

@Test
public void testRomanNumeralsConvertsXIVto14() throws Exception {
        result = RomanNumerals.convert("XIV");
        assertEquals(14, result);

}

@Test
public void testRomanNumeralsConvertsXLto40() throws Exception {
        result = RomanNumerals.convert("XL");
        assertEquals(40, result);

}

@Test
public void testRomanNumeralsConvertsXLIVto44() throws Exception {
        result = RomanNumerals.convert("XLIV");
        assertEquals(44, result);

}

@Test
public void testRomanNumeralsConvertsLXXXIXto89() throws Exception {
        result = RomanNumerals.convert("LXXXIX");
        assertEquals(89, result);

}

@Test
public void testRomanNumeralsConvertsXCto90() throws Exception {
        result = RomanNumerals.convert("XC");
        assertEquals(90, result);

}

@Test
public void testRomanNumeralsConvertsXCIVto94() throws Exception {
        result = RomanNumerals.convert("XCIV");
        assertEquals(94, result);

}

@Test
public void testRomanNumeralsConvertsCXLIVto144() throws Exception {
        result = RomanNumerals.convert("CXLIV");
        assertEquals(144, result);

}

@Test
public void testRomanNumeralsConvertsCMXCIXto999() throws Exception {
        result = RomanNumerals.convert("CMXCIX");
        assertEquals(999, result);

}

}
