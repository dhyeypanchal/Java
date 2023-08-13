public class reversestring {
    public static void reverseString(char[] s) {
        String newstr ="";
        for (int i = s.length; i >=0; i--) {
            newstr+=s[i];
        }
        for (int i = 0; i < newstr.length(); i++) {
            s[i]=newstr.charAt(i);
        }
    }
    public static void main(String[] args) {
        char[]s = { 'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }
}
