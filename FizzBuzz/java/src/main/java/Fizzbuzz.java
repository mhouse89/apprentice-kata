
public class Fizzbuzz {

  public String convert(int number) {

    StringBuilder result = new StringBuilder();

    if (number % 3 == 0) {
          result.append("Fizz");
    }

    if (number % 5 == 0) {
          result.append("Buzz");
    }

    if (result.length() < 1){
          result.append(Integer.toString(number));
    }

    return result.toString();

  }

}
