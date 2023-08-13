import java.util.Scanner;

public class zeroonecodechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String newstr="";
            int a = sc.nextInt();
            for (int i = 1; i <= a; i++) {
                if (a%4==0) {
                    if (i%1==0 || i%4==0) {
                        newstr+='1';
                    }else{
                        newstr+='0';
                    }
                }
                else{
                    if (i%2==0) {
                        newstr+='0';
                    }else{
                        newstr+='1';
                    }
                }
            }
            System.out.println(newstr);
        }
    }
}
