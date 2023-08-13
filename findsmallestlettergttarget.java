public class findsmallestlettergttarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int []arr = new int[letters.length];int ans=Integer.MAX_VALUE;
        int t = target-'a';int count=0;
        for (int i = 0; i < letters.length; i++) {
            arr[i]= letters[i]-'a';
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans && arr[i]-t>0) {
                ans=arr[i];
                System.out.println(ans);
            }
            if (t>=arr[i]) {
                count++;
            }
        }
        if (count==arr.length) {
            return letters[0];
        }
        return (char)((char)ans+'a');
    }
    public static void main(String[] args) {
        char[] letters = {'e','e','e','k','q','q','q','v','v','y'};
        System.out.println(nextGreatestLetter(letters, 'h'));
    }   
}
