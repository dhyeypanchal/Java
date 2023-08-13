import java.util.Stack;

class longestvalidpara {

    // public static int longestValidParentheses(String s) {
    //     Stack<Character> s1 = new Stack<>();int count = 0;
    //     for (int i = 0; i<s.length();i++) {
    //         if (s.charAt(i)==')') {
    //             if (s1.peek()=='(') {
    //                 s1.pop();
    //                 count++;
    //             }
    //         }
    //         else
    //         if (s.charAt(i)=='}' && s1.peek()=='{') {
    //             s1.pop();
    //             count++;
    //         }
    //         if (s.charAt(i)==']' && s1.peek()=='[') {
    //             s1.pop();
    //             count++;
    //         }
    //     }

    //     return 1;
    // }
    // public static int longestValidParentheses(String s) {
    //     Stack<Character> s1 = new Stack<>();int count = 0;
    //     for (int i = 0; i<s.length();i++) {
    //         if (s.charAt(i)==')') {
    //             if (s1.peek()=='(') {
    //                 s1.pop();
    //                 count++;
    //             }
    //         }
    //         else
    //         if (s.charAt(i)=='}' && s1.peek()=='{') {
    //             s1.pop();
    //             count++;
    //         }
    //         if (s.charAt(i)==']' && s1.peek()=='[') {
    //             s1.pop();
    //             count++;
    //         }
    //     }

    //     return 1;
    // }

    public static int longestValidParentheses(String s) {
        Stack<Character> s1 = new Stack<>();int count = 0;
        // for (int i = 0; i<s.length();i++) {
        //     if (s1.isEmpty()) {
        //         s1.push(s.charAt(i));
        //     }
        //     if (s1.peek()=='{') {
        //         if (s.charAt(i)=='}') {  
        //             s1.pop();
        //             count++;
        //         }
        //         else{
        //             if (s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(') {
        //                 count++;
        //             }
        //             s1.push(s.charAt(i));
        //         }
        //     }
        //     if (s1.peek()=='{') {
        //         if (s.charAt(i)==']') {  
        //             s1.pop();
        //             count++;
        //         }
        //         else{
        //             if (s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(') {
        //                 count++;
        //             }
        //             s1.push(s.charAt(i));
        //         }
        //     }
        //     if (s1.peek()=='(') {
        //         if (s.charAt(i)==')') {  
        //             s1.pop();
        //             count++;
        //         }
        //         else{
        //             if (s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(') {
        //                 count++;
        //             }
        //             s1.push(s.charAt(i));
        //         }
        //     }
        //     System.out.println("shhs");
        //     if (s1.peek()=='}' || s1.peek()==']' || s1.peek()==')') {
        //         s1.push(s.charAt(i));
        //     }
        // }
        for (int i = 0; i < s.length(); i++) {
            if (s1.isEmpty()) {
                if (s.charAt(i)=='(') {  
                    s1.push(s.charAt(i));
                }
                continue;
            }
            if (s1.peek()=='(' && s.charAt(i)==')') {
                s1.pop();
                count+=2;
                continue;
            }
            else if (s1.peek()=='(') {
                s1.push(s.charAt(i));
                continue;
            }
        }
        while (!s1.isEmpty()) {
            if (s1.peek()=='(') {
                s1.pop();
                // if (count>2) {     
                //     count-=2;
                // }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "(()()";
        // String s = "()(()";
        // String s = "(()";
        System.out.println(longestValidParentheses(s));
    }
}
