public class Task3 {
    public static int romanToArabic(String romanNumerals) {
        if (romanNumerals == null || romanNumerals.isEmpty()) {
            throw new IllegalArgumentException("Неверная цифра");
        }
        int result = 0;
        int precedingValue = 0;
        for (int i = romanNumerals.length() - 1; i >= 0; i--) {
            char currentSymbol = romanNumerals.charAt(i);
            int actualValue = getRomanValue(currentSymbol);
            if (actualValue < precedingValue) {
                result -= actualValue;
            } else {
                result += actualValue;
            }
            precedingValue = actualValue;
        }
        return result;
    }

    private static int getRomanValue(char numeral) {
        switch (numeral) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Неверная цифра: " + numeral);
        }
    }
}
