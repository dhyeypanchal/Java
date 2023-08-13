import java.util.Scanner;

public class codechefstreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int []addy = new int[n];
            int []om = new int[n];
            for (int i = 0; i < n; i++) {
               om[i]=sc.nextInt(); 
            }
            for (int i = 0; i < n; i++) {
               addy[i]=sc.nextInt(); 
            }
            int countom = 0;int sumom = 0;
            int countaddy = 0;int sumaddy= 0;
            for (int i = 0; i < om.length; i++) {
                if (om[i]!=0) {
                    countom+=1;
                    if (countom>sumom) {
                        sumom=countom;
                    }
                }
                else{
                    countom = 0;
                }
                if (addy[i]!=0) {
                    countaddy+=1;
                    if (countaddy>sumaddy) {
                        sumaddy=countaddy;
                    }
                }
                else{
                    countaddy = 0;
                }
            }
            if (sumaddy>sumom) {
                System.out.println("Addy");
            }
            else if (sumom>sumaddy) {
                System.out.println("Om");
            }
            else{
                System.out.println("Draw");
            }
        }
    }
}
