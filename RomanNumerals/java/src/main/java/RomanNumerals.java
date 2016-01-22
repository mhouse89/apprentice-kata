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
        conversion.put('L', 50);
        conversion.put('C', 100);
        //conversion.put('D', 500);
        conversion.put('M', 1000);

        romanNumeralBuffer = new StringBuilder(romanNumeral);
        StringBuilder reverse = romanNumeralBuffer.reverse();
        total = 0;
        int lastVal = 0;

        for(index = 0; index < reverse.length(); index++) {
                if (lastVal > conversion.get(reverse.charAt(index))) {
                  total += lastVal - conversion.get(reverse.charAt(index)) - lastVal;
                }

                else {
                  total += conversion.get(reverse.charAt(index));
                }

                lastVal = conversion.get(reverse.charAt(index));

        }
        return total;
}

}
