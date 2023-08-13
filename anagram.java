import java.util.Arrays;
public class anagram {
    public static boolean anagram1(String s1,String s2){
        char[]arr1 = new char[s1.length()];
        char[]arr2 = new char[s2.length()];
        if (s1.length()!=s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            arr1[i]=s1.charAt(i);
        }
        Arrays.sort(arr1);
        for (int i = 0; i < s2.length(); i++) {
            arr2[i]=s2.charAt(i);
        }
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(anagram1(s1, s2));
    }
    
}
