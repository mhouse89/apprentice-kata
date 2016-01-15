import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzbuzzTest {

  @Test
  public void fizzbuzzReturns1WhenPassedTheNumber1() {
    Fizzbuzz fb = new Fizzbuzz();
    String result = fb.convert(1);
    assertEquals("1", result);
  }

  @Test
  public void fizzbuzzReturns2WhenPassedTheNumber2() {
    Fizzbuzz fb = new Fizzbuzz();
    String result = fb.convert(2);
    assertEquals("2", result);
  }

}
