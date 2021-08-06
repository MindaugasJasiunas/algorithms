import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RomanNumberToArabic {
//    I, V, X, L, C, D, M
    // I - 1
    // V - 5
    // X - 10
    // L - 50
    // C - 100
    // D - 500
    // M - 1000
//    Do not repeat I, X, and C more than 3 times
//    Symbols V, L, and D cannot appear more than once consecutively.
//    Do not subtract a number from one that is more than 10 times greater: I may only precede V and X, X may only precede L and C, and C may only precede D and M

    public int convertToArabic(String romanText) {
        if (checkRomanFormat(romanText)) {
            int result = 0;
            int i = 0;
            while (romanText.length() > 0) {
                for (Roman symbol : Roman.getSortedFromBiggest()) {
                    if (romanText.startsWith(symbol.name())) {
                        result += symbol.getValue();
                        romanText = romanText.substring(symbol.toString().length(), romanText.length());
                        break;
                    }
                }
            }
            return result;
        }
        return -1;
    }

    public String convertToRoman(int arabicNumber) {
        StringBuilder romanText = new StringBuilder();
        int i = 0;
        while (arabicNumber > 0) {
            for (Roman symbol : Roman.getSortedFromBiggest()) {
                while (arabicNumber / symbol.getValue() >= 1) {
                    arabicNumber -= symbol.getValue();
                    romanText.append(symbol);
                }
            }
        }
        return romanText.toString();
    }

    boolean checkRomanFormat(String input) {
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (character != 'I' && character != 'V' && character != 'X' && character != 'L' && character != 'C' && character != 'D' && character != 'M') {
                return false;
            }
            /*if(i+1 < input.length()){
                // V , L or D more than once consecutively
                if(character=='V' && input.charAt(i+1)=='V'){
                    return false;
                }
                if(character=='L' && input.charAt(i+1)=='L'){
                    return false;
                }
                if(character=='D' && input.charAt(i+1)=='D'){
                    return false;
                }
                // dont subtract a number from one that is more than 10 times greater
                if(input.charAt(i+1)=='V' && (character!='I' && character!='X' && character!='L' && character!='C' && character!='D' && character!='M')){
                    return false;
                }
                if(input.charAt(i+1)=='X' && (character!='I' && character!='X' && character!='L' && character!='C' && character!='D' && character!='M')){
                    return false;
                }
                if(input.charAt(i+1)=='L' && (character!='X' && character!='C' && character!='D' && character!='M')){
                    return false;
                }
                if(input.charAt(i+1)=='C' && (character!='X' && character!='C' && character!='D' && character!='M')){
                    return false;
                }
                if(input.charAt(i+1)=='D' && (character!='C' && character!='M')){
                    return false;
                }
                if(input.charAt(i+1)=='M' && (character!='C' && character!='M')){
                    return false;
                }
            }
            if(i+3< input.length()){
                //Do not repeat I, X, and C more than 3 times
                if(character=='I' && input.charAt(i+1)=='I' && input.charAt(i+2)=='I' && input.charAt(i+3)=='I'){
                    return false;
                }
                if(character=='X' && input.charAt(i+1)=='X' && input.charAt(i+2)=='X' && input.charAt(i+3)=='X'){
                    return false;
                }
                if(character=='C' && input.charAt(i+1)=='C' && input.charAt(i+2)=='C' && input.charAt(i+3)=='C'){
                    return false;
                }
            }*/
        }
        return true;
    }
}

enum Roman {
    I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);

    Roman(int value) {
        this.value = value;
    }

    private int value;

    public int getValue() {
        return value;
    }

    static List<Roman> getSortedFromBiggest() {
        List<Roman> sorted = new ArrayList<>(Arrays.asList(Roman.values()));
        sorted.sort((o1, o2) -> {
            if (o1.value > o2.value) {
                return -1;
            } else if (o1.value < o2.value) {
                return 1;
            } else {
                return 0;
            }
        });
        return sorted;
    }
}