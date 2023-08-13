public class revwordinstring {
    public static void reverseWords(String s) {
        String []ans = s.trim().split("\\s+");
        String newstr="";
        for (int i = ans.length-1; i >=0; i--) {
            if (i!=ans.length-1) {  
                newstr=newstr+" "+ans[i];
            }
            else{
                newstr+=newstr+ans[i];
            }
        }
        System.out.println(newstr);
    }
    public static void main(String[] args) {
        String s = "  a good   example ";
        reverseWords(s);
    }
}
