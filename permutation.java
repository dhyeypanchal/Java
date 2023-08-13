class permutation{

    public static void permutation1(String s,String permutation){
        if (s.length()==0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char currchar = s.charAt(i);
            String newstr = s.substring(0, i)+s.substring(i+1);
            permutation1(newstr, permutation+currchar);
        }
    }

    public static long reverse(int x){
        String s = String.valueOf(x); //covert integer to String.
        String reversedStr = "";
        for (int i = 0; i <s.length() ; i++) {
            reversedStr = s.charAt(i) + reversedStr;
        }
        if (reversedStr.charAt(reversedStr.length()-1)!='-') {
            long n = Long.parseLong(reversedStr);
            // System.out.println(n);
            return n;
        }
        else{
            String newstr = reversedStr.substring(0, reversedStr.length()-1);
            long n = Long.parseLong(newstr);
            return (-1*n);
        }
    }

    public static int strtoint(String s){
        // String newstr = s.trim();int i =0;
        // // System.out.println(newstr);
        // while(newstr.charAt(i)!=' '&&i<newstr.length()-1){
        //     //     ans += ans+ newstr.charAt(i);
        //     s=newstr.substring(0, i+2).trim();
        //     i++;
        // }
        // int a = Integer.parseInt(s);
        // System.out.println(s);
        if (s=="") {
            // System.out.println("0");
            return 0;
        }
        int i = 0;String n = "";
        while(i<s.length()){
            if (((s.charAt(0)<'0' || s.charAt(0)>'9') && s.charAt(0)!=' ' && s.charAt(0)!='-') || (s.charAt(i)=='-'&&s.charAt(i+1)=='+') || (s
                    .charAt(i) == '+' && s.charAt(i + 1) == '-')) {
                        // System.out.println("0");
                return 0;
            }
            if ((s.charAt(i)>='0' && s.charAt(i)<='9') || s.charAt(i)=='-' || s.charAt(i)=='.') {
                n = n + s.charAt(i);
                // System.out.println("hello");
            }
            i++;
        }
        // System.out.println(n);
        double a = Double.parseDouble(n);
        a = (a > Integer.MAX_VALUE) ? Integer.MAX_VALUE : a;
        a = (a < Integer.MIN_VALUE) ? Integer.MIN_VALUE : a;
        // System.out.println((int)a);
        return (int)a;
    }

    public static String findprefix(String []strs){
        // this code is copied from leetcode solutions
        String ans = strs[0];
        String sub = "";

        for (int i = 1; i < strs.length; i++) {

            for (int j = 0; j < Math.min(ans.length(), strs[i].length()); j++) {

                if (ans.charAt(j) == strs[i].charAt(j)) {
                    sub += ans.charAt(j);
                } else {
                    break;
                }
            }
            ans = sub;
            sub = "";
        }
        return ans;
    }
    public static void main(String[] args) {
        // String s = "";
        // permutation1(s, "");
        // System.out.println(reverse(1534236469));

        // System.out.println(strtoint(s));

        String []arr = {"flower","flow","flew"};
        System.out.println(findprefix(arr));
    }
}