public class power {

    // above code is not work in leetcode properly but here it works fine.
    public static double ans = 1.0;

    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n > 0) {
            int i = 0;
            while (i < n) {
                ans = ans * x;
                i++;
            }
        } else {
            int i = 0;
            while (i > n) {
                ans = ans * 1 / x;
                i--;
            }
        }
        return ans;
    }

    public static double myPow(double x, int n) {
        if (x < -10000 || x > 10000) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        }
        else {
            return x * myPow(x, n - 1);
        }
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        System.out.println(pow(x,n));
        System.out.println(myPow(x, n));
    }
}
