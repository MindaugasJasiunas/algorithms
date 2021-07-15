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

    public int convertToArabic(String romanText){
        if(checkRomanFormat(romanText)){
            int result=0;
            int i=0;
            while(romanText.length()>0){
                for(Roman symbol : Roman.getSortedFromBiggest()){
                    if(romanText.startsWith(symbol.name())){
                        result+=symbol.getValue();
                        romanText=romanText.substring(symbol.toString().length(), romanText.length());
                        break;
                    }
                }
            }
            return result;
        }
        return -1;
    }

    public String convertToRoman(int arabicNumber){
        StringBuilder romanText=new StringBuilder();
        int i=0;
        while(arabicNumber>0){
            for(Roman symbol : Roman.getSortedFromBiggest()){
                while(arabicNumber/symbol.getValue()>=1){
                    arabicNumber-=symbol.getValue();
                    romanText.append(symbol);
                }
            }
        }
        return romanText.toString();
    }

    boolean checkRomanFormat(String input){
        for(int i=0; i<input.length(); i++){
            char character= input.charAt(i);
            if(character!='I' && character!='V' && character!='X' && character!='L' && character!='C' && character!='D' && character!='M'){
                return false;
            }
        }
        return true;
    }
}

enum Roman{
    I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);

    Roman(int value){
        this.value=value;
    }
    private int value;

    public int getValue() {
        return value;
    }

    static List<Roman> getSortedFromBiggest(){
        List<Roman> sorted=new ArrayList<>(Arrays.asList(Roman.values()));
        sorted.sort((o1, o2) -> {
            if(o1.value > o2.value){
                return -1;
            }else if(o1.value < o2.value){
                return 1;
            }else{
                return 0;
            }
        });
        return sorted;
    }
}