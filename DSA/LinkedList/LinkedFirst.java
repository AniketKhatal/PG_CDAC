package LinkedList1;

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

    // Adding an element to the start of the Linked list
    public void addFirst(int data) {
        // Step 1: Create the new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: newNode.next = head
        newNode.next = head; // Link the new node to the head

        // Step 3: head = newNode
        head = newNode;
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
        LinkedFirst ll = new LinkedFirst();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.printList(); // Output should be: 2 -> 1 -> null
    }
}
