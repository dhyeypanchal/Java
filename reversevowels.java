import java.util.HashSet;

public class reversevowels {
    public static String reverseVowels(String s) {
        HashSet<Character> vow = new HashSet<>();String newstr="";String ans="";int k=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
                newstr+=s.charAt(i);
                vow.add(s.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (vow.contains(s.charAt(i))) {
                ans+= newstr.charAt(newstr.length()-k-1);
                System.out.println(newstr.length()-k-1);
                k++;
            }
            else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
