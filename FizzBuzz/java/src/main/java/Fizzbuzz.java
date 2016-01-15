
public class Fizzbuzz {

  public String convert(int number) {

    if(number == 3) {
      return "Fizz";
    }
    else if (number == 5) {
      return "Buzz";
    }
    return Integer.toString(number);
  }

}
