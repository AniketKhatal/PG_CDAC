class FirstQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor to initialize the queue
    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Utility function to add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Overflow: Queue is full.");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    // Utility function to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow: Queue is empty.");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        count--;
        return item;
    }

    // Utility function to return the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return arr[front];
    }

    // Utility function to check if the queue is empty
    public boolean isEmpty() {
        return (count == 0);
    }

    // Utility function to check if the queue is full
    public boolean isFull() {
        return (count == capacity);
    }

    // Utility function to return the size of the queue
    public int size() {
        return count;
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        System.out.println("Front element is: " + q.peek());

        q.enqueue(6);

        System.out.println("Queue size is " + q.size());

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        System.out.println("Queue is empty: " + q.isEmpty());
    }
}
