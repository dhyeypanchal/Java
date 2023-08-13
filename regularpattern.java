public class regularpattern {
    public static boolean isMatch(String s, String p){
        if (p.contains("*") || p.contains(".")) {
            if (p=="*.") {
                return true;
            }
            
        }
        else{
            if (s!=p) {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "aa";
        String p = "a";
        isMatch(s,p);
    }
}
