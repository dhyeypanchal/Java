import java.util.Stack;

public class decodestr {
    public static String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        String newstr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==']') {
                while (st.peek()!='[') {
                    
                }
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        String s = "3[a2[c]]";
    }
}
