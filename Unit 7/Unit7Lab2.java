
/**
 * This program converts between decimal, hexadecimal, octal, and binary
 * numbers.
 * 
 * @author Krish Thawani
 *
 */
public class Unit7Lab2 {
    public static void main(String[] args) {

        int decimalTest = 78;
        String binaryTest = "010110101101001";

        System.out.println("\n\n");
        System.out.println("Binary Digit: " + binaryTest + " To Decimal: " + binaryToDecimal(binaryTest));
        System.out.println("Binary Digit: " + binaryTest + " To Hexadecimal: " + binaryToHex(binaryTest));
        System.out.println("Decimal: " + decimalTest + " To Binary: " + decimalToBinary(decimalTest));
        System.out.println("Decimal: " + decimalTest + " To Hexadecimal: " + decimalToHex(decimalTest));
        System.out.println("\n\n");
    }

    public static int binaryToDecimal(String binaryString) {
        int count = 0;
        for (int i = 0; i < binaryString.length(); i++)
            count += Character.getNumericValue(binaryString.charAt(i)) * Math.pow(2, (binaryString.length() - (i + 1)));
        return count;
    }

    public static String binaryToHex(String binaryString) {

        StringBuilder hex = new StringBuilder();
        String binary4;
        binaryString = new StringBuilder(binaryString).reverse().toString();

        for (int i = 0; i < binaryString.length(); i += 4) {
            binary4 = new StringBuilder(binaryString.substring(i, Math.min(i + 4, binaryString.length()))).reverse()
                    .toString();
            hex.append(decimalToHex(binaryToDecimal(binary4)));
        }
        return hex.reverse().toString();
    }

    public static String decimalToBinary(int decimalNumber) {

        int nextNum;
        StringBuilder binary = new StringBuilder();

        do {
            nextNum = decimalNumber / 2;
            binary.append(decimalNumber - nextNum * 2);
            decimalNumber = nextNum;
        } while (decimalNumber > 0);

        return binary.reverse().toString();
    }

    public static String decimalToHex(int decimalNumber) {
        int nextNum;
        StringBuilder hex = new StringBuilder();
        int stringConvert;

        do {
            nextNum = decimalNumber / 16;
            stringConvert = decimalNumber - nextNum * 16;

            hex.append(convertToHex(stringConvert));

            decimalNumber = nextNum;

        } while (decimalNumber > 0);

        return hex.reverse().toString();
    }

    public static char convertToHex(int s) {
        switch (s) {
        case 10:
            return 'A';
        case 11:
            return 'B';
        case 12:
            return 'C';
        case 13:
            return 'D';
        case 14:
            return 'E';
        case 15:
            return 'F';
        default:
            return Character.forDigit(s, 10);
        }
    }
}