// this is rishabh's code.
import java.util.HashSet;
import java.util.HashMap;

public class lengthoflongestsubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        HashMap<Integer, String> map = new HashMap<>();
        int max = 0;
        String substr = "";

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                if (substr.charAt(0) == s.charAt(i)) {
                    substr = substr.substring(1);
                    set.remove(s.charAt(i));
                } else {
                    map.put(substr.length(), substr);
                    set.clear();
                    substr = "";
                }
            }
            substr = substr + s.charAt(i);
            set.add(s.charAt(i));
        }

        if (map.isEmpty()) {
            return substr.length();
        }
        if (substr != "") {
            map.put(substr.length(), substr);
        }

        for (int i : map.keySet()) {
            max = Math.max(i, max);
        }

        return max;
    }

    public static void main(String[] args) {
        String str = "ohvhjdml";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
