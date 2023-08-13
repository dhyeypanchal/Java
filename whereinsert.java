public class whereinsert {
    public static int insert(int []arr, int n){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (n<=arr[i]) {
               break; 
            }
            count++;
        }
        return count;
    }


    // public static void lastwordandlength(String s){
    //     int i=0,n=0;
    //     String [] arr=new String[10];
    //     while (i!=s.length()) {
    //        if (s.charAt(i)==' ') {
    //             n++;
    //         }
    //         arr[n]+=s.charAt(i);
    //         i++;
    //     }
    //     System.out.println(arr[0]);
    // }

    public static int lastwordandlength(String s){
        s = s.trim();
        int a=0;
        int b = s.length()-1;
        while (b>=0 && s.charAt(b)!= ' ') {
            b--;
            a++;
        }
        return a;
    }

    public static int[] plusOne(int[] digits) {
        // above 2 method don't work in long no's
        // int res = 0;
        // for (int i = 0; i < digits.length; i++) {
        //     res = res * 10 + digits[i];
        // }
        // String temp = BigDecimal.valueOf(res+1)+" ";
        // String temp2;
        // int temp3;
        // int[] newGuess = new int[temp.length()-1];
        // // for (int i = 0; i < temp.length(); i++) {
        // //     if (i != temp.length()) {
        // //         temp2 = temp.substring(i, i + 1);
        // //     } else {
        // //         temp2 = temp.substring(i);
        // //         // System.out.println(i);
        // //     }
        // //     temp3 = Integer.parseInt(temp2);
        // //     newGuess[i] = temp3;
        // // }

        // // this is another and easy method
        // for (int i = 0; i < temp.length()-1; i++) {
        //     newGuess[i] = temp.charAt(i) - '0';
        // }

        // for (int i = 0; i < newGuess.length; i++) {
        //     System.out.println(newGuess[i]);
        // }
        // return newGuess;

        // above will work in long no.
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        // int [] arr = {1,3,5,6};
        // int n = 7;
        // System.out.println(insert(arr, n));

        // String s = "Hello World";
        // lastwordandlength(s);

        int[] arr = { 99 };
        System.out.println(plusOne(arr));

    }
}
