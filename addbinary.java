public class addbinary {

    public static String addBinary(String a, String b) {
        String newstr = "";int carry=0;int sum=0;int i=0;int j = 0;
        while (i<a.length() && j<b.length()) {
            sum = a.charAt(a.length()-1-i)-'0'+b.charAt(b.length()-1-i)-'0'+carry;
            carry=sum/2;
            sum=sum%2;
            newstr=sum+newstr;
            i++;j++;
        }
        while (i<a.length()) {
            sum = a.charAt(a.length()-1-i)-'0'+carry;
            carry=sum/2;
            sum=sum%2;
            newstr=sum+newstr;
            i++;
        }
        while(j<b.length()) {
           sum = b.charAt(b.length()-1-j)-'0'+carry;
            carry=sum/2;
            sum=sum%2;
            newstr=sum+newstr;
            j++; 
        }
        if (carry!=0) {
            newstr=carry+newstr;
        }
        return newstr;
    }
    public static void main(String[] args) {
        String a ="100";
        String b ="110010";
        System.out.println(addBinary(a, b));
    }
}
