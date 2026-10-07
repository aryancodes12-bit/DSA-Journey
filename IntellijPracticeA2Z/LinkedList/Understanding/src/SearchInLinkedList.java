
    class Node3{
        int data;
        Node next;
        Node3(int data1, Node next1){
            this.data=data1;
            this.next=next1;
        }
        Node3(int data1){
            this.data=data1;
            this.next=null;
        }
    };

    public class SearchInLinkedList {
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
        private static int Length(Node head) {
            int cnt = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                cnt++;
            }
            return cnt;
        }
        private static int checkifPresent(Node head,int value) { // method should be static cause the main method cannot call nonstatic method to do so it need to create instance of class
    Node temp = head;
    while (temp != null) {
        if(temp.data==value){
            return 1;
        }
        temp = temp.next;

    }
    return 0;
}
        public static void main(String[] args) {
int [] arr={4,7,9,0,5};
Node head=convertToLL(arr);
            System.out.println("Is 5 present: " + checkifPresent(head, 5)); // Prints: 1
            System.out.println("Is 8 present: " + checkifPresent(head, 8)); // Prints: 0
        }
}
