public class substrpalindrome {
    // public static String longestPalindrome(String s) {
    //     String newstr = "", reversedStr = "", ans = "";
    //     int count = 0;String[]arr = new String[(s.length() * (s.length() + 1) / 2)];int k=0;
    //     for (int i = 0; i < s.length(); i++) {
    //         newstr="";
    //         for (int j = i; j < s.length(); j++) {
    //             newstr += s.charAt(j);
    //             arr[k]=newstr;
    //             k++;
    //         }
    //     }
    //     for (int i = 0; i < arr.length; i++) {
    //         // reversedStr="";
    //         reversedStr=new StringBuilder(arr[i]).reverse().toString();
    //         // for (int j = 0; j < arr[i].length(); j++) {
    //         //     reversedStr = arr[i].charAt(j) + reversedStr;
    //         // }
    //         if (arr[i].compareTo(reversedStr) == 0 && count < arr[i].length()) {
    //             count = arr[i].length();
    //             ans = arr[i];
    //         }
    //     }
    //     return ans;
    // }
    public static String longestPalindrome(String s) {
        String newstr = "", reversedStr = "", ans = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            newstr = "";
            for (int j = i; j < s.length(); j++) {
                reversedStr = "";
                newstr += s.charAt(j);
                reversedStr = new StringBuilder(newstr).reverse().toString();
                if (newstr.compareTo(reversedStr) == 0 && count < newstr.length()) {
                    count = newstr.length();
                    ans = newstr;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "jkexvzsqshsxyytjmmhauoyrbxlgvdovlhzivkeixnoboqlfemfzytbolixqzwkfvnpacemgpotjtqokrqtnwjpjdiidduxdprngvitnzgyjgreyjmijmfbwsowbxtqkfeasjnujnrzlxmlcmmbdbgryknraasfgusapjcootlklirtilujjbatpazeihmhaprdxoucjkynqxbggruleopvdrukicpuleumbrgofpsmwopvhdbkkfncnvqamttwyvezqzswmwyhsontvioaakowannmgwjwpehcbtlzmntbmbkkxsrtzvfeggkzisxqkzmwjtbfjjxndmsjpdgimpznzojwfivgjdymtffmwtvzzkmeclquqnzngazmcfvbqfyudpyxlbvbcgyyweaakchxggflbgjplcftssmkssfinffnifsskmsstfclpjgblfggxhckaaewyygcbvblxypduyfqbvfcmzagnznquqlcemkzzvtwmfftmydjgvifwjoznzpmigdpjsmdnxjjfbtjwmzkqxsizkggefvztrsxkkbmbtnmzltbchepwjwgmnnawokaaoivtnoshywmwszqzevywttmaqvncnfkkbdhvpowmspfogrbmuelupcikurdvpoelurggbxqnykjcuoxdrpahmhiezaptabjjulitrilkltoocjpasugfsaarnkyrgbdbmmclmxlzrnjunjsaefkqtxbwoswbfmjimjyergjygzntivgnrpdxuddiidjpjwntqrkoqtjtopgmecapnvfkwzqxilobtyzfmeflqobonxiekvizhlvodvglxbryouahmmjtyyxshsqszvxekj";
        System.out.println(longestPalindrome(s));
    }
    
}
