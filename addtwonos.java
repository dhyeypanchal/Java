import java.util.LinkedList;
import java.util.Stack;

public class addtwonos {
    public static void addTwoNumbers(LinkedList<Integer> l1,LinkedList<Integer> l2) {
        Stack<Integer> s1= new Stack<>(); 
        Stack<Integer> s2= new Stack<>(); 
        int i=0;
        while (i<l1.size()) {
            s1.push(l1.get(i));
            i++;
        }
        int j=0;
        while (j<l2.size()) {
            s2.push(l2.get(j));
            j++;
        }
        int sum=0;int carry=0;int ans = 0;
        LinkedList<Integer> l3 = new LinkedList<>();
        Stack<Integer> s3= new Stack<>();
        if (s1.size()>=s2.size()) {
            while (!s2.isEmpty()) {
                sum=(s1.pop()+s2.pop()+carry);
                ans=sum%10;
                s3.push(ans);
                carry=(sum)/10;
                sum=0;
            }
            while (!s1.isEmpty()) {
                sum = (s1.pop()+carry);
                ans = sum%10;
                s3.push(ans);
                carry = sum/10;
                sum=0;
            }
            if (carry!=0) {
                s3.push(carry);
            }
        }
        else{
            while (!s1.isEmpty()) {
                sum=(s1.pop()+s2.pop()+carry);
                ans=sum%10;
                s3.push(ans);
                carry=(sum)/10;
                sum=0;
            }
            while (!s2.isEmpty()) {
                sum = (s2.pop()+carry);
                ans = sum%10;
                s3.push(ans);
                carry = sum/10;
                sum=0;
            }
            if (carry!=0) {
                s3.push(carry);
            }
        }
        System.out.println(s3);
        while (!s3.isEmpty()) {
            l3.add(s3.pop());
        }
        System.out.println(l3);
    }
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        // l1.add(7);
        l1.add(2);
        l1.add(4);
        l1.add(3);
        // l1.add(0);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);
        l2.add(0);
        addTwoNumbers(l1, l2);
    }
}
