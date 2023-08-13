import java.lang.Math;
public class beautifulno {
    public static int minimumBeautifulSubstrings(String s) {
        String substr = "";int count = 0;String second = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                substr+=s.charAt(j);
                second+=s.substring(i);
                if (substr.charAt(0)=='0' || second.charAt(0)=='0') { 
                    break;
                }
                int number[] = findno(substr,second);
                if (isPowerOfFive(number[0]) && isPowerOfFive(number[1])) {
                    count++;
                }
            }
            substr="";
        }
        return count==0?-1:count;
    }
    public static boolean isPowerOfFive(int number) {
        if (number <= 0) {
            return false;
        }
        while (number % 5 == 0) {
            number /= 5;
        }
        return number == 1;
    }
    public static int[] findno(String s,String sec){
        int sum = 0,sum2=0;int arr[] = new int[2];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='1') {
                sum+=Math.pow(2, s.length()-i-1);
            }
            else{
                sum+=1;
            }
        }
        for (int i = 0; i < sec.length(); i++) {
            if (sec.charAt(i)=='1') {
                sum2+=Math.pow(2, sec.length()-i-1);
            }
            else{
                sum2+=1;
            }
        }
        arr[0]=sum;arr[1]=sum2;
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(minimumBeautifulSubstrings("1011"));
    }
}
