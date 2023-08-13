import java.util.Stack;

public class minimaldeletetomakestringbalanced {
    public static int minimumDeletions(String s) { // in sum problem is different and i was understand different.
        Stack<Character> st = new Stack<>();int ans = 0;
        if (st.isEmpty()) {
            st.push(s.charAt(0));
        }
        for (int j = 1; j < s.length(); j++) {
            if (st.contains(s.charAt(j))) {
                continue;
            }
            else{
                st.push(s.charAt(j));
            }
        }
        System.out.println(st);
        int []arr = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (st.elementAt(i)==s.charAt(j)) {
                    arr[i]+=1;
                }
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        return ans;
    }
    public static void main(String[] args) {
        String s = "bbaaaaabb";
        System.out.println(minimumDeletions(s));
    }
}
