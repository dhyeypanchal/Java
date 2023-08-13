import java.util.Stack;

public class simplifypath {
    public static String simplifyPath(String path) {
        Stack<Character> st = new Stack<>();int count=0;
        for (int i = 0; i < path.length(); i++) {
            if (st.isEmpty()) {
                st.push(path.charAt(i));
                continue;
            }
            if (st.peek()=='/' && path.charAt(i)=='/') {
                continue;
            }
            if (st.peek()=='.') {
                count++;
                st.push(path.charAt(i));
                if (count==2) {
                    st.pop();
                }
                // st.pop();
                continue;
            }
            st.push(path.charAt(i));
        }
        while (st.peek()=='/'|| st.peek()=='.' && st.size()>1) {
            st.pop();
        }
        String newstr = "";
        while (!st.isEmpty()) {
            newstr=st.pop()+newstr;
        }
        return newstr;
    }
    public static void main(String[] args) {
        String path = "/home/chirag/../";
        System.out.println(simplifyPath(path));
    }
}
