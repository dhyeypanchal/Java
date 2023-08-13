public class seachsubstr {
    public static int strStr(String haystack, String needle) {
        int len = needle.length();
        if (haystack.length()== needle.length()) {
            if (haystack.compareTo(needle) == 0) {
                return 0;
            }
            return -1;
        }
        for (int i = 0; i < haystack.length() - len+1; i++) {
            System.out.println(haystack.substring(i, i+len)+" "+needle);
            if (haystack.substring(i, i + len).compareTo(needle)==0) {
                return i;
            }
        }
        return -1;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] num = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    num[0] = i;
                    num[1] = j;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        return num;
    }
    
    public static String longestPalindrome(String s) {
        String newstr = "", reversedStr="",ans="";int count = 0;
        for (int i = 0; i < s.length(); i++) {
            newstr="";
            for (int j = i; j < s.length(); j++) {
                reversedStr="";
                newstr+=s.charAt(j);
                for (int k = 0; k < newstr.length(); k++) {
                    reversedStr = newstr.charAt(k) + reversedStr;
                }
                if (newstr.compareTo(reversedStr)==0 && count<newstr.length()) {
                    count = newstr.length();
                    ans=newstr;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // String haystack = "baaa";
        // String needle = "abbb";
        // System.out.println(strStr(haystack, needle));

        // int []nums = { 3, 2, 4};
        // int target = 6;
        // System.out.println(twoSum(nums, target));

        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPalindrome(s));
    }
}
