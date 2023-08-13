import java.util.HashMap;

public class containssubstr {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Integer,Character> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(i,magazine.charAt(i));
        }
        System.out.println(map);
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.containsValue(ransomNote.charAt(i))) {
                
                map.remove(i, ransomNote.charAt(i));
                continue;
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
