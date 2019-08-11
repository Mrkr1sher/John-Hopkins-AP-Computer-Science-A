public class Unit16Lab1 {
    public static void main(String[] args) {
        System.out.println(helperMethod("racecar"));
        System.out.println(helperMethod("banana"));
        System.out.println(helperMethod("don't nod"));
        System.out.println(helperMethod("my gym"));

    }

    public static boolean helperMethod(String s) {
        s = s.replaceAll("\\W", "");
        return s.equals(testPalindrome(s));
    }

    public static String testPalindrome(String s) {
        if (s.length() == 0) {
            return s;
        }
        return s.charAt(s.length() - 1) + testPalindrome(s.substring(0, s.length() - 1));
    }
}