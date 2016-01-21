import java.util.Hashtable;

public class RomanNumerals {
public static int convert(String romanNumeral) {

        StringBuilder romanNumeralBuffer;
        int total;
        int index;
        Hashtable<Character, Integer> conversion =
                new Hashtable<Character, Integer>();
        conversion.put('I', 1);
        conversion.put('V', 5);
        conversion.put('X', 10);

        romanNumeralBuffer = new StringBuilder(romanNumeral);
        StringBuilder reverse = romanNumeralBuffer.reverse();
        total = 0;
        char lastChar = 'a';

        for(index = 0; index < reverse.length(); index++) {
                if (lastChar != 'a' && conversion.get(lastChar) > conversion.get(reverse.charAt(index))) {
                  total = conversion.get(lastChar) - conversion.get(reverse.charAt(index));
                }

                else {
                  total += conversion.get(reverse.charAt(index));
                }

                lastChar = reverse.charAt(index);

        }
        return total;
}

}
