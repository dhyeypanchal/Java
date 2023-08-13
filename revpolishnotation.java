import java.util.Stack;

public class revpolishnotation {
    public static int evalRPN(String[] tokens) {
        String a = "";String b="";int c =0;
        Stack<String> s = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                a = s.pop();
                b = s.pop();
                c = Integer.parseInt(b)+Integer.parseInt(a);
                s.push(Integer.toString(c));
            }
            else if (tokens[i].equals("-")) {
                a = s.pop();
                b = s.pop();
                c = Integer.parseInt(b)-Integer.parseInt(a);
                s.push(Integer.toString(c));
            }
            else if (tokens[i].equals("*")) {
                a = s.pop();
                b = s.pop();
                c = Integer.parseInt(b)*Integer.parseInt(a);
                s.push(Integer.toString(c));
            }
            else if (tokens[i].equals("/")) {
                a = s.pop();
                b = s.pop();
                c = Integer.parseInt(b)/Integer.parseInt(a);
                s.push(Integer.toString(c));
            }
            else{
                s.push(tokens[i]);
            }
        }
        System.out.print(s);
        c = Integer.parseInt(s.peek());
        return c;
    }
    public static void main(String[] args) {
        // String tokens[] = {"2","1","+","3","*"};
        String tokens[] = {"4","13","5","/","+"};
        // String tokens[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
}
