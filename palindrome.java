public class palindrome {

    public static boolean ispalindrome(int n){
        String str = Integer.toString(n);
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            newstr = str.charAt(i)+newstr;
        }
        // System.out.println(newstr);
        
        if (str.compareTo(newstr)==0) {
            System.out.println("true");
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int n = -121;
        ispalindrome(n);
    }
}
