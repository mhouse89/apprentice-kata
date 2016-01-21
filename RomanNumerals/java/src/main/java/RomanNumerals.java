import java.util.Hashtable;

public class RomanNumerals {

private static StringBuilder romanNumeralBuffer;
private static int total;
private static int index;
private static Hashtable<Character, Integer> conversion =
  new Hashtable<Character, Integer>();


  public static int convert(String romanNumeral) {
    conversion.put('I', 1);
    romanNumeralBuffer = new StringBuilder(romanNumeral);
    total = 0;

    for(index = 0; index < romanNumeralBuffer.length(); index++) {
      total += conversion.get(romanNumeralBuffer.charAt(index));
    }

    return total;
  }

}
