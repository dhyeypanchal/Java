class MyLinkedList {
    int size;
    Node dummy;
    Node head;
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            next = null;
        }
    }

    public MyLinkedList() {
        // dummy = new Node(-1);
        size = 0;
    }

    public int get(int index) {
        // System.out.println(index);
        // System.out.println(size);
        if (index>=size) {
            return -1;
        }
        Node curr = head;
        int i =0;
        while (i<index) {
            i++;
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        Node curr=new Node(val);
        curr.next = head;
        head = curr;
        size++;
    }

    public void addAtTail(int val) {
        Node curr=new Node(val);
        if (head.next==null) {
            head.next = curr;
            curr.next=null;
        }
        Node currNode = head;
        while (currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next= curr;
        curr.next=null;
    }

    public void addAtIndex(int index, int val) {
        // System.out.println(head);
        if (index>size) {
            return;
        }
        else if (head==null || index==0) {
            // System.out.println("hello");
            Node newnode = new Node(val);
            newnode.next=head;
            head=newnode; 
        }
        else if (head.next==null && index==1) {
            Node newnode = new Node(val);
            head.next = newnode;
            newnode.next=null;
        }
        else if (head.next.next == null && (index == 1 || index == 2)) {
            Node newnode = new Node(val);
            if (index == 1) {
                head.next=newnode;
                newnode.next=null;
            } else {
                head.next.next = newnode;
                newnode.next=null;
            }
            return;
        }
        else{
            Node curr = head.next;
            Node prev = head;
            Node newnode = new Node(val);
            while (prev.next != newnode) {
                curr=curr.next;
                prev=prev.next;
            }
            prev.next=newnode;
            newnode.next=curr;
        }
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index > size) {
            return;
        }
        if (head== null) {
            System.out.println("there is no element");
            return;
        }
        if (head.next==null && index==0) {
            head=null;
            return;
        }
        if (head.next.next==null&&(index==1 || index==0)) {
            if (index==0) {
               head=null; 
            }
            else{
                head.next=null;
            }
            return;
        }
        Node curr = head.next;
        System.out.println("hello");
        Node prev = head;
        int count = 0;
        while (count != index) {
            curr = curr.next;
            prev = prev.next;
        }
        prev.next = curr.next;
        size--;
    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        // myLinkedList.addAtHead(5);
        // myLinkedList.addAtHead(6);
        // myLinkedList.addAtHead(2);
        myLinkedList.addAtIndex(0,5);
        myLinkedList.addAtIndex(1,4);
        myLinkedList.addAtIndex(2,5);
        // there is problem in add and delete at index method
        // myLinkedList.deleteAtIndex(1);
        System.out.println(myLinkedList.get(0));
    }
}
