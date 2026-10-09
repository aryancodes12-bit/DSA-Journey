public class InsertAtStart {
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
    }
    private static void Print(Node head) {
        while (head != null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
    }
    private static Node insertAtstart(Node head, int val) {
        Node temp=new Node(val,head);
        return temp;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        Node h=convertToLL(arr);
        System.out.print("original list is ");
        Print(h);
        System.out.println();
        h = insertAtstart(h, 7);

        System.out.print("after deletion ");
        Print(h);
    }
}
