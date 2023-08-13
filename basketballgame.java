import java.util.Stack;

public class basketballgame {
    public static int calPoints(String[] operations) {
        int sum = 0;
        Stack<String> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if(operations[i]=="+"){
                String a = st.peek();
                String b = st.elementAt(st.size()-2);
                int c = Integer.parseInt(a)+Integer.parseInt(b);
                st.push(Integer.toString(c));
            }
            else if (operations[i]=="C") {
                st.pop();
            }
            else if (operations[i]=="D") {
                String a = st.peek();
                int b = 2*Integer.parseInt(a);
                st.push(Integer.toString(b));
            }
            else{
                st.push(operations[i]);
            }
        }
        System.out.println(st);
        while (!st.isEmpty()) {
            int a = Integer.parseInt(st.pop());
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        System.out.println(calPoints(operations));
    }
}
