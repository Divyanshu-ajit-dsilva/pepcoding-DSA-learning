// Program to practise on Strings in java
public class Strings {
    public static void main(String[] args) {
        String s = "abcd";

        // Loop to print all substrings of a string
        /*
         * for(int i = 0; i < s.length(); i++){
         * for (int j = i+1; j <= s.length(); j++) {
         * System.out.print(s.substring(i, j) + " ");
         * }
         * System.out.println();
         * }
         */

        String s1 = "abccba";
        // printing all pallindormic substrings
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String ss = s1.substring(i, j);
                if (isPallindrome(ss) == true) {
                    System.out.println(ss);
                }
            }
        }

        /*
         * String s2 = "abc def ghi jkl";
         * String[] parts = s2.split(" ");
         * for (int i = 0; i < parts.length; i++) {
         * System.out.println(parts[i]);
         * }
         */
    }

    public static boolean isPallindrome(String ss) {
        int i = 0, j = ss.length() - 1;

        while (i <= j) {
            char ch1 = ss.charAt(i);
            char ch2 = ss.charAt(j);

            if (ch1 != ch2) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
