class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class DeleteAtStart {
    private static Node convertToLL(int [] arr){
        if (arr == null || arr.length == 0) return null;  //edge case
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static Node Delete(Node head) {
        if (head == null) return null; // Safety check
        return head.next;              // Return the new starting node
    }
   private static void Print(Node head) {
        while (head != null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        Node y=convertToLL(arr);
        System.out.print("original list is ");
        Print(y);
        System.out.println();
     y=Delete(y);

        System.out.print("after deletion ");
      Print(y);
    }
}
