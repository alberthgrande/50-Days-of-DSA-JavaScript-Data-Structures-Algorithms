class Node {
    int data;
    Node next;
}

public class Main {
    public static void main(String[] args) {
        Node head, middle, last;

        head = new Node();
        middle = new Node();
        last = new Node();

        head.data = 10;
        middle.data = 20;
        last.data = 30;

        head.next = middle;
        middle.next = last;
        last.next = null;

        // store temporary no
        Node temp = head;

        while (temp != null) {
            System.out.println("Temp data: " + temp.data);
            temp = temp.next;
        }
    }
}
