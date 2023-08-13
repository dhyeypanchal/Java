public class palindromic {
    public static String longestPalindrome(String s) {
        String newstr = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (newstr.indexOf(s.charAt(i)) == -1) {
                newstr += s.charAt(i);
            } else {
                newstr = newstr.substring(newstr.indexOf(s.charAt(i)) + 1);
                newstr += s.charAt(i);
            }
            if (newstr.length() > count) {
                count = newstr.length();
            }
            System.out.println(newstr);
        }
        return newstr;
    }
    public static void main(String[] args) {
        String s = "ohvhjdml";
        System.out.println(longestPalindrome(s));
    }
}
