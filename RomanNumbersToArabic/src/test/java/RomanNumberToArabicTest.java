import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberToArabicTest {
    private final RomanNumberToArabic romanNumberToArabic=new RomanNumberToArabic();

    @DisplayName("convertToArabic() XIX - 19")
    @Test
    void convertToArabic_19() {
        int result= romanNumberToArabic.convertToArabic("XIX");
        assertEquals(19, result);
    }

    @DisplayName("convertToArabic() MMXVIII - 2018")
    @Test
    void convertToArabic_2018() {
        int result= romanNumberToArabic.convertToArabic("MMXVIII");
        assertEquals(2018, result);
    }

    @DisplayName("convertToArabic() MCMXCIX - 1999")
    @Test
    void convertToArabic_1999() {
        int result= romanNumberToArabic.convertToArabic("MCMXCIX");
        assertEquals(1999, result);
    }



    @DisplayName("convertToArabic() invalid input - NON ROMAN SYMBOLS - returns -1")
    @Test
    void convertToArabic_invalidInput() {
        int result= romanNumberToArabic.convertToArabic("ABC");
        assertEquals(-1, result);
    }

    @DisplayName("convertToRoman() 1999 - returns empty string")
    @Test
    void convertToRoman_1999() {
        String result= romanNumberToArabic.convertToRoman(1999);
        assertEquals("MCMXCIX", result);
    }

    @DisplayName("convertToRoman() 2018 - returns empty string")
    @Test
    void convertToRoman_2018() {
        String result= romanNumberToArabic.convertToRoman(2018);
        assertEquals("MMXVIII", result);
    }

    @DisplayName("convertToRoman() 0 - returns empty string")
    @Test
    void convertToRoman_zero() {
        String result= romanNumberToArabic.convertToRoman(0);
        assertTrue(result.isEmpty());
    }

}