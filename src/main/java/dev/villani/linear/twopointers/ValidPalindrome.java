package dev.villani.linear.twopointers;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s.isBlank()) return true;

        int pointerStart = 0;
        int pointerEnd = s.length() - 1;

        while (pointerStart < pointerEnd) {

            char c = s.charAt(pointerStart);
            char c2 = s.charAt(pointerEnd);

            if (!Character.isLetterOrDigit(c)) {
                pointerStart++;
            } else if (!Character.isLetterOrDigit(c2)) {
                pointerEnd--;
            } else {
                if (Character.toLowerCase(c) != Character.toLowerCase(c2)) return false;
                pointerStart++;
                pointerEnd--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean result = isPalindrome("A man, a plan, a canal: Panama");
        //Output: true
        System.out.println(result);

        boolean result2 = isPalindrome("race a car");
        //Output: false
        System.out.println(result2);

        boolean result3 = isPalindrome(" ");
        //Output: true
        System.out.println(result3);
    }
}
