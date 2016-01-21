import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsTest {

  @Test
  public void testRomanNumeralsConvertsIto1() throws Exception {
    int result = RomanNumerals.convert("I");
    assertEquals(1, result);

  }

}
