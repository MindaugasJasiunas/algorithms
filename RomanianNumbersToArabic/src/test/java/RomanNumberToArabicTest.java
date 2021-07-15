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

    @DisplayName("convertToArabic() invalid input - NON ROMAN SYMBOLS - returns -1")
    @Test
    void convertToArabic_invalidInput() {
        int result= romanNumberToArabic.convertToArabic("ABC");
        assertEquals(-1, result);
    }


}