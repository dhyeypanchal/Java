public class strtoint {
    public static int myAtoi(String s) {
        if (s == "") {
            return 0;
        }
        String newstr = s.trim();String n = "";
        int count =0;
        for (int i = 0; i < newstr.length(); i++) {
            if ((newstr.charAt(i)<'0' || newstr.charAt(i)>'9') && count==0 && newstr.charAt(i)!='-' && newstr.charAt(i)!='+') {
                return 0;
            }
            if (n!=""&& (newstr.charAt(i) < '0' || newstr.charAt(i) > '9')) {
                System.out.println("hello");
                break;
            }
            if ((newstr.charAt(i) >= '0' && newstr.charAt(i) <= '9') || newstr.charAt(i) == '-' || newstr.charAt(i) == '.' 
                    || newstr.charAt(i) == '+') {
                if (i<newstr.length()-1) {  
                    if ((newstr.charAt(i) == '-' && (newstr.charAt(i + 1) == '+' || newstr.charAt(i + 1) == ' ' || newstr.charAt(i+1) == '-')) || (newstr.charAt(i) == '+' && (newstr.charAt(i + 1) == '-'|| newstr.charAt(i + 1) == ' ' || newstr.charAt(i+1) == '+'))) {
                        return 0;
                    }
                }
                n = n + newstr.charAt(i);
            }
            count++;
        }
        if (n != "") {
            try{
                double a = Double.parseDouble(n);
                a = (a > Integer.MAX_VALUE) ? Integer.MAX_VALUE : a;
                a = (a < Integer.MIN_VALUE) ? Integer.MIN_VALUE : a;
                // System.out.println((int)a);
                return (int) a;
            }
            catch(Exception e){
                return 0;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String s = "  +b12102370352";
        System.out.println(myAtoi(s));
    }
}
