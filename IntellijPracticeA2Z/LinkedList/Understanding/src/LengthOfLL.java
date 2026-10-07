class Node2{
    int data;
    Node next;
    Node2(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node2(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class LengthOfLL {
    private static Node convertToLL(int[] arr) {
        if (arr == null || arr.length == 0) return null;  //edge case
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int Length(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int []arr ={2,3,5,7};
Node head=convertToLL(arr);
        System.out.println(Length(head));
    }
}
