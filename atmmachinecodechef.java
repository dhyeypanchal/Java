import java.util.Scanner;

public class atmmachinecodechef {
    public static void atmmachine(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String newstr = "";
            int inputsize = sc.nextInt();
            int amount = sc.nextInt();
            int arr[]=new int[inputsize];
            for (int i = 0; i < inputsize; i++) {
                arr[i]=sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>amount) {
                    newstr+='0';
                }
                else{
                    newstr+='1';
                    amount=amount-arr[i];
                }
            }
            System.out.println(newstr);
        }
    }
    public static void main(String[] args) {
        atmmachine();
    }
}
