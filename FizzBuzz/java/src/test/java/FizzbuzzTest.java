import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzbuzzTest {

  String result;
  Fizzbuzz fb;

  @Before
  public void setUp() {
          fb = new Fizzbuzz();
  }


  @Test
  public void fizzbuzzReturns1WhenPassedTheNumber1() {
          result = fb.convert(1);
          assertEquals("1", result);
  }

  @Test
  public void fizzbuzzReturns2WhenPassedTheNumber2() {
          result = fb.convert(2);
          assertEquals("2", result);
  }

  @Test
  public void fizzbuzzReturnsFizzWhenPassedTheNumber3() {
          result = fb.convert(3);
          assertEquals("Fizz", result);
  }

  @Test
  public void fizzbuzzReturnsBuzzWhenPassedTheNumber5() {
          result = fb.convert(5);
          assertEquals("Buzz", result);
  }

  @Test
  public void fizzbuzzReturnsFizzWhenPassedAMultipleOf3() {
          result = fb.convert(6);
          assertEquals("Fizz", result);
  }

  @Test
  public void fizzbuzzReturnsBuzzWhenPassedAMultipleOf5() {
          result = fb.convert(10);
          assertEquals("Buzz", result);
  }

  @Test
  public void fizzBuzzReturnsFizzBuzzWhenPassedAMultipleOf3And5() {
          result = fb.convert(15);
          assertEquals("FizzBuzz", result);
  }

}
