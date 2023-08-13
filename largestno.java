public class largestno {
    public static String largestNumber(int[] nums) {
        String newstr ="";String ans="";int count=0;int index=-1;
        String[] newnum = new String[nums.length];
        String[] output = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newnum[i]=Integer.toString(nums[i]);
        }
        for (int i = 0; i < newnum.length; i++) {
            for (int j = 1; j < newnum.length; j++) {
                if (newnum[i].length()>=newnum[j].length()) {
                    for (int j2 = 0; j2 < newnum[j].length(); j2++) {
                        if(newnum[i].charAt(j2)>newnum[j].charAt(j2)){
                            index=i;
                            break;
                        }
                        else if(newnum[i].charAt(j2)<newnum[j].charAt(j2)){
                            index=j;
                            break;
                        }
                    }
                    if (newnum[i].length()>newnum[j].length() && index==-1) {   
                        if (newnum[i].charAt(newnum[j].length())>=newnum[j].charAt(newnum[j].length()-1)) {
                            index=i;
                        }
                        else{
                            index=j;
                        }
                    }
                    else if (newnum[i].length()==newnum[j].length() && index==-1) {
                        index=i;
                    }
                }
                else{
                    for (int j2 = 0; j2 < newnum[i].length(); j2++) {
                        if(newnum[i].charAt(j2)>newnum[j].charAt(j2)){
                            index=i;
                            break;
                        }
                        else if(newnum[i].charAt(j2)<newnum[j].charAt(j2)){
                            index=j;
                            break;
                        }
                    }
                    if (newnum[j].charAt(newnum[i].length())>newnum[i].charAt(newnum[i].length()-1) && index==-1) {
                        index=j;
                        break;
                    }
                    else if (index==-1) {
                       index=i;
                       break; 
                    }
                }
            }
            output[i]=newnum[index];
            // index=-1;
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+" ");
        }
        return ans;        
    }
    public static void main(String[] args) {
        int [] nums = {3,4,0,6,9,32};
        System.out.println(largestNumber(nums));
    }
}
