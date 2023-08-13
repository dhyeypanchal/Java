public class subset {
    public static void subset1(String s, String result) {
        if (s.length() == 0) {
            System.out.print(result+" ");
            return;
        }
        System.out.println(result);
        for (int i = 0; i < s.length(); i++) {
            String newStr = s.substring(i + 1);
            subset1(newStr, result + s.charAt(i));
        }
    }
    public static void main(String[] args) {
        int n = 5;
        String s = "";
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        subset1(s, "");
    }
}
