import java.util.Hashtable;

public class RomanNumerals {
public static int convert(String romanNumeral) {

        StringBuilder romanNumeralBuffer;
        int total;
        int index;
        Hashtable<Character, Integer> conversion =
                new Hashtable<Character, Integer>();
        conversion.put('I', 1);
        
        romanNumeralBuffer = new StringBuilder(romanNumeral);
        total = 0;

        for(index = 0; index < romanNumeralBuffer.length(); index++) {
                total += conversion.get(romanNumeralBuffer.charAt(index));
        }

        return total;
}

}
