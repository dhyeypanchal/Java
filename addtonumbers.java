import java.util.LinkedList;

public class addtonumbers {
    public static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void print(){
        Node curr = head;
        if (head==null) {
            return;
        }
        while (curr!=null) {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void insertfirst(int data){
        Node curr = new Node(data);
        if (head==null) {
            head = curr;
            curr.next = null;
            return;
        }
        curr.next = head;
        head = curr;
    }

    public static LinkedList<Integer> addTwoNumbers(int[] arr, int[] arr1){
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            l1.add(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            l2.add(arr1[i]);
        }

        // int max = arr.length>=arr1.length?arr.length:arr1.length;
        int carry = 0;int count=0;
        if (arr.length>=arr1.length) {
            for (int i = 0; i < arr1.length; i++) {
                int sum = (int)(l1.get(i))+(int)(l2.get(i));
                System.out.println(sum);
                if (sum>=10) {
                    sum = sum - 10;
                    if (carry==0) {
                        l3.add(i, sum);
                    }
                    else {
                        l3.add(i, sum + carry);
                    }
                    carry = 1;
                }
                else{
                    l3.add(i,sum+carry);
                }
                count++;
            }
            if (carry==1 && arr.length>arr1.length) {
                System.out.println(count);
                l3.add(count, (int)l1.get(count)+1);
            }
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                int sum = (int) (l1.get(i)) + (int) (l2.get(i));
                System.out.println(sum);
                if (sum >= 10) {
                    sum = sum - 10;
                    if (carry == 0) {
                        l3.add(i, sum);
                    } else {
                        l3.add(i, sum + carry);
                    }
                    carry = 1;
                } else {
                    l3.add(i, sum + carry);
                }
                count++;
            }
            if (carry == 1 && arr1.length > arr.length) {
                l3.add(count, (int) l2.get(count) + 1);
            }
        }
        if (arr.length>=arr1.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(l3.get(i)+" ");
            }
        }
        else{
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(l2.get(i) + " ");
            } 
        }
        return l1;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        // addtonumbers l = new addtonumbers();
        // insertfirst(5);
        // insertfirst(7);
        // insertfirst(9);
        // print();

        // int[] arr = { 9, 9, 9, 9, 9, 9, 9 };
        // int[] arr1 = { 9, 9, 9, 9 };
        // addTwoNumbers(arr, arr1);

        LinkedList<Integer>l1 = new LinkedList<>();
        LinkedList<Integer>l2 = new LinkedList<>();
        LinkedList<Integer>l3 = new LinkedList<>();
        
       l1.add(9);
       l1.add(9);
       l1.add(9);
       l1.add(9);
       l1.add(9);
       l1.add(9);
       l1.add(9);

       l2.add(9);
       l2.add(9);
       l2.add(9);
       l2.add(9);

        int carry = 0;
        int i = 0;

        for (; i <l1.size(); i++) {

            if (i >=l2.size()) {
               l3.add((l1.get(i) + carry)%10);
                carry = (l1.get(i) + carry)/10;
            }
            else {
               l3.add((l1.get(i) +l2.get(i) + carry)%10);
                carry = (l1.get(i) +l2.get(i) + carry)/10;
            }
        }

        if (l2.size() >l1.size()) {
            while (i <l2.size()) {
               l3.add((l2.get(i) + carry)%10);
                carry = (l2.get(i) + carry)/10;
                i++;
            }
        }

        if (carry > 0) {
           l3.add(carry);
        }

        // System.out.println(l3);
    }
}
