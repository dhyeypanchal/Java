public class LL {
    Node head;
    static class Node{
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }

    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast.next.next!= null){
            fast = fast.next.next;
            slow=slow.next;
            if (slow==fast) {
                return true;
            }
        }
        return false;
    }

    public static Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null &&fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        return prev;
    }

    public static boolean ispalindrome(Node head){
        // System.out.println(head.next.data);
        if (head == null) {
            return false;
        }
        Node mid = findmid(head);
        Node rev = reverse(mid.next);
        // System.out.println(mid.data);
        // System.out.println(rev.data); //gives the first index where elements are reversed
        Node curNode = head;
        while (rev!=null) {
            if (curNode.data!=rev.data) {
                return false;
            }
            curNode = curNode.next;
            rev=rev.next;
        }
        return true;
    }


    public static Node deleteDuplicates(Node head) {
        Node curr = new Node(-1);
        curr.next = head;
        // curr = curr.next;
        while (curr != null && curr.next != null) {
            // System.out.println(curr.data);
            if (curr.data == curr.next.data) {
                // System.out.println(curr.data);
                curr.next = curr.next.next;
            }
            curr = curr.next;
            // System.out.println(curr.data);
        }
        // while (head!=null) {
        //     System.out.println(head.data+" ");
        //     head = head.next;
        // }
        return head.next;
    }
    
    public static void main(String[] args) {
        LL s1 = new LL();
        s1.head = new Node(1);
        Node second = new Node(1);
        Node third = new Node(1);
        // Node fourth = new Node(1);
        // Node fifth = new Node(10);
        s1.head.next = second;
        second.next = third;
        // third.next = fourth;
        // fourth.next = fifth;
        // fourth.next = second;
        // System.out.println(s1.hasCycle(s1.head));
        // System.out.println(ispalindrome(s1.head));
        // s1.display();

        System.out.println(deleteDuplicates(s1.head));
    }
}
