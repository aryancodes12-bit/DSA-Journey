//in this we are checking that head is not lost during traversal
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
public class Array2LinkedList {
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
    public static void main(String[] args) {
    int[] arr={2,3,4,5,6};
    Node y=convertToLL(arr);
  Node temp=y;
  while(temp !=null){
      System.out.printf(temp.data+"->");
      temp=temp.next;
  }
      //  System.out.println(y.data);
    }
}
