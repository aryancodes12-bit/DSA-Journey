public class DeleteAtK {
    static class Node {
        int data;
        Node next;

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
    }private static Node removeKthNode(Node head, int k) {
        if (head == null || k <= 0) return head;

        // Deleting the 1st node (head)
        if (k == 1) {
            return head.next;
        }

        int cnt = 1;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (cnt == k) {
                prev.next = prev.next.next; // Bypass the k-th node
                break;
            }
            prev = temp;
            temp = temp.next;
            cnt++; // Increment counter
        }

        return head;
    }private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        Node y = convertToLL(arr);

        System.out.print("Original list: ");
        printList(y);

        // Delete node at k = 3 (value 4)
        int k = 3;
        y = removeKthNode(y, k);

        System.out.print("After deleting node at position " + k + ": ");
        printList(y);
    }
}
