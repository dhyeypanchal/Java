import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class chefanddolls {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        // int t = sc.nextInt();
        // while (t-->0) {
        //     int a = sc.nextInt();
        //     for (int i = 0; i < a; i++) {
        //         int n = sc.nextInt();
        //         if (map.containsKey(n)) {
        //             map.put(n, map.get(n)+1);
        //         }
        //         else{
        //             map.put(n, 1);
        //         }
        //     }
        // }
        // for (Map.Entry<Integer,Integer> set : map.entrySet()) {
        //     if (set.getValue()!=2) {
        //         System.out.println(set.getKey());
        //     }
        // }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a+b>6) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
