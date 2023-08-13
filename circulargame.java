import java.util.HashSet;

public class circulargame {
    public static int[] circularGameLosers(int n, int k) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        int no = (1 + k) % n;
        boolean flag = false;
        while (no != ans) {
            if (!flag) {
                set.add(1);
                ans = (1 + k) % n;
                set.add(ans);
                flag = true;
            }
            k += 2;
            ans = (ans + k) % n;
            set.add(ans);
        }
        System.out.println(set);
        int newarr[] = new int[n - set.size()];
        int x = 0;
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
            } else {
                newarr[x] = i;
                x++;
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
        return newarr;
    }

    public static void main(String[] args) {
        int n = 4, k = 4;
        circularGameLosers(n, k);
    }
}
