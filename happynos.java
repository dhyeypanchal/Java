public class happynos {
    public static boolean isHappy(int n) {
        int ans=0;String str="";
        while(ans!=1){
            String a = Integer.toString(n);
            for (int i = 0; i < a.length(); i++) {
                System.out.println(a.length());
                ans+=(a.charAt(i)-'a')*(a.charAt(i)-'a');
                a=Integer.toString(ans);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
