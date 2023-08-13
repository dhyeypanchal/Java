public class checkparenthesis {
    public static int check(String s){
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(' && s.charAt(i+1)==')' && i==0) {
                count++;
            }
            else if (i>0 && s.charAt(i - 1) != '(') {
                count++;
            }
            else if (s.charAt(i)==')' && s.substring(0, i).contains("(")) {
                count1++;
            }
        }
        if (count>=count1) {
            return count1*2;
        }
        else{
            return count*2;
        }
    }
    public static void main(String[] args) {
        String s = "()(()"; // output expected to be 2 but it is 4
        System.out.println(check(s));
    }
}
