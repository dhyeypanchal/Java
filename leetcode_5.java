public class leetcode_5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("heheusvsyqhlqxqiwovwshsjwvslwbwowhbwkepwbwjsobwvw"));
        // xaabacxcabaaxcabaax
    }

    public static String longestPalindrome(String s) {
        if (s.isEmpty()) {
            return s;
        }
        String subStr = Character.toString(s.charAt(0));
        String helperText = "";
        int prev = 0;
        int next = 0;
        char charAtI;

        for (int i = 0; i <= s.length() - 1; i++) {
            charAtI = s.charAt(i);
            helperText = Character.toString(charAtI);
            prev = i - 1;
            next = i + 1;
            for (int j = next; j <= s.length() - 1; j++) {
                if (s.charAt(next) == charAtI) {
                    helperText = helperText + s.charAt(next);
                    ++next;
                } else {
                    break;
                }
            }
            for (int j = 0; j <= prev; j++) {
                if (s.charAt(prev) == charAtI) {
                    helperText = s.charAt(prev) + helperText;
                    --prev;
                } else {
                    break;
                }
            }
            while (prev >= 0 && next <= s.length() - 1) {
                if (s.charAt(prev) == s.charAt(next)) {
                    helperText = s.charAt(prev) + helperText + s.charAt(next);
                    --prev;
                    ++next;
                } else {
                    break;
                }
            }
            if (helperText.length() >= subStr.length()) {
                subStr = helperText;
            }
        }
        return subStr;
    }
}