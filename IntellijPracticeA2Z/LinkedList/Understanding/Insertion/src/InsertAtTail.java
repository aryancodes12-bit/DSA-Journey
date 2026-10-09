public class InsertAtTail {
    static class Node {
        int data;
        Node next; // Use its own Node class, not InsertAtStart.Node

        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
    }

    private static Node convertToLL(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void Print(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
        System.out.println();
    }

    private static Node insertTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        Node h = convertToLL(arr);

        System.out.print("Original list: ");
        Print(h);

        h = insertTail(h, 7);

        System.out.print("After inserting at tail: ");
        Print(h);
    }
}