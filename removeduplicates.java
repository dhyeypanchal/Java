import java.util.Stack;

public class removeduplicates {
    public static String removeDuplicateLetters(String s) {
        String newstr = "";
        Stack<Character> st = new Stack<>();
        boolean []arr = new boolean[26];
        int i=0;
        while (i<s.length()) {
            if (st.contains(s.charAt(i))) {
                i++;
                continue;
            }
            st.push(s.charAt(i));
            i++;
        }
        System.out.println(st);

        return newstr;
        
        // while (!st.isEmpty()) {
        //     arr[st.pop()-'a'] = true;
        // }int j = 0;
        // while (j<arr.length) {
        //     if (arr[j]==true) {
        //         newstr+=(char)(j+'a');
        //     }
        //     j++;
        // }

        // another method to sort abcd wise but we need in lexicographic order not abcd wise
        //  while (!st.isEmpty()) {
        //     newstr+=st.pop();
        // }
        // // Convert the string to character array
        // char[] charArray = newstr.toCharArray();
        
        // // Sort the character array in lexicographic order
        // Arrays.sort(charArray);
    }
    public static void main(String[] args) {
        String s = "cdacdcbc";
        System.out.println(removeDuplicateLetters(s));
    }
}
