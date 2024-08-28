package LL1;

public class LinkedFirst1 {

    public static class Node {
        int data;
        Node next; // Reference variable that points to the next node

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // We have only one head and tail in a linked list, that's why we declare them as properties inside the class
    public static Node head;
    public static Node tail;
    //define static variable for size
    public static int size;   //java bydefault initialize it to 0

    // Adding an element to the start of the Linked list
    public void addFirst(int data) {
        // Step 1: Create the new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: newNode.next = head
        newNode.next = head; // Link the new node to the head

        // Step 3: head = newNode
        head = newNode;
    }

    //Method to add the element at the end of the LinkedList
    public void addLast(int data){
        //step1: create the new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    //Method to add element into the middle of the linkedList
    public void addMiddle(int index,int data){
        //if i want to add the node at the first
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);   //crate a new node
        size++;
        Node temp=head;
        int i=0;  //to track temp ,rightnow where excatly the temp is
        //loop to find the previous
        while(i < index-1){
            temp=temp.next;
            i++;
        }

        //i=index-1 ; temp -> prev
        newNode.next = temp.next;
        temp.next= newNode;
    }
    //Method to remove the element from the start
    public int removeFirst(){
        //case if the linked list empty
        if (size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head= tail =null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    //Method to remove the node from the last
    public int removeLast(){
        if(size==0){
            System.out.println("Linked List is empty");
        } else if (size==1) {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        //prev :i=size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }

        int val=prev.next.data;  //we can also write tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    //Method for to search an perticular key present or not
    public int itrSearch(int key){   //timecomplexity= O(n)
        Node temp=head;
        int i=0;

        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        //Key not found
        return -1;
    }
    //Method for Reverse the linked list
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedFirst1 ll = new LinkedFirst1();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(44);
        ll.addLast(55);
        ll.addMiddle(2,9);
        ll.printList();
       //  System.out.println(ll.size);
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        ll.printList();
        System.out.println(ll.itrSearch(9));
        ll.reverse();
        ll.printList();
    }
}
