

public class InsertAtK {
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
    private static Node insertK(Node head,int el,int k ){
        if(head==null){
            if(k==1){
                return new Node(el);
            }
            else return null;
        }
        if(k==1){
            Node temp=new Node(el,head);
return temp;
        }
        Node temp=head; int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==k-1){
                Node x=new Node(el,temp.next);

                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int [] arr={4,5,8,7,2};
        Node ans=convertToLL(arr);
        System.out.println("original list");
        Print(ans);
ans=insertK(ans,10,3);
        System.out.println("after inserting");
        Print(ans);
    }
}
