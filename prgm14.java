import java.util.*;
import java.lang.*;

class prgm14 {
    public static void main(String args[]) {
        String[] strArr = { "Hi", "How", "Are", "You" };
        String s1 = "Programming";
        String s2 = "Language";
        String s3 = " trimming ";
        String s4 = "World";
        System.out.println("1. Concatenation of 2 strings: " + conCate(s2,
                s4));
        System.out.println("2. Index of 'a' in [" + s1 + "]: " + indexOfString(s1,
                'a'));
        System.out.println("3. Character at 8th position in [" + s1 + "]:" + charAtString(s1, 8));
        System.out.println("4. Replacing 'g' with 'z': " + stringReplace(s1,
                'z'));
        System.out.println("5. Uppercase of [" + s1 + "]: " + upperCase(s1));
        System.out.println("6. Lowercase of [" + s1 + "]: " + lowerCase(s1));
        System.out.println("7. Length of [" + s1 + "]: " + stringLength(s1));
        System.out.println("8. Does the [" + s1 + "] starts with (He)?:" + stringStartWith(s1));
        System.out.println("9. Does the [" + s1 + "] ends with (ing)?:" + stringEndWith(s1));
        System.out.println("10.Trimming whitespace in prefix and suffix:" + stringTrim(s3));
        System.out.println("11.Substring from 4 in [" + s1 + "]: " + stringSub(s1,
                4));
        System.out.println("12.Substring from 4 to 9 in [" + s1 + "]:" + stringSub(s1, 4, 9));
        System.out.println("13.Case insensitive comparison:" + noCaseCheck(s1, s2));
        System.out.println("14.Checks if [gram] is present in [" + s1 + "]:" + checkChar(s1, "gram"));
        System.out.println("15.Dictionary checking of 2 strings: " + compareToString(s1, s2));
        System.out.println("16.Is the string empty?: " + emptyCheck(s2));
        System.out.println("17.Last index of 'g' occured in:" + occurenceCheck(s1, 'g') + " index");
        System.out.println("18.Unicode of 5th letter: " + unicodeString(s1,
                5));
        System.out.println("19.Converting [" + s1 + "] to character array:" + strToCharArr(s1));
        System.out.println("20.Joining string array into single element:" + joiningString(strArr));
    }

    public static String conCate(String s1, String s2) {
        String s3;
        return s3 = s1.concat(s2);
    }

    public static int indexOfString(String s1, char s) {
        return s1.indexOf(s);
    }

    public static char charAtString(String s1, int n) {
        return s1.charAt(n);
    }

    public static String lowerCase(String s1) {
        return s1.toLowerCase();
    }

    public static String upperCase(String s1) {
        return s1.toUpperCase();
    }

    public static String stringReplace(String s1, char z) {
        return s1.replace('g', z);
    }

    public static int stringLength(String s1) {
        return s1.length();
    }

    public static boolean stringStartWith(String s1) {
        return s1.startsWith("He");
    }

    public static boolean stringEndWith(String s1) {
        return s1.endsWith("ing");
    }

    public static String stringTrim(String s1) {
        return s1.trim();
    }

    public static String stringSub(String s1, int n, int m) {
        String x;
        return x = s1.substring(n, m);
    }

    public static String stringSub(String s1, int n) {
        String x;
        return x = s1.substring(n);
    }

    public static boolean noCaseCheck(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }

    public static boolean checkChar(String s1, String seq) {
        return s1.contains(seq);
    }

    public static int compareToString(String s1, String s2) {
        return s1.compareTo(s2);
    }

    public static boolean emptyCheck(String s1) {
        return s1.isEmpty();
    }

    public static int occurenceCheck(String s1, char x) {
        return s1.lastIndexOf(x);
    }

    public static int unicodeString(String s1, int n) {
        return s1.codePointAt(n);
    }

    public static String strToCharArr(String s1) {
        char x[] = s1.toCharArray();
        return (Arrays.toString(x));
    }

    public static String joiningString(String[] s5) {
        String newStr = String.join("$ ", s5);
        return newStr;
    }
}