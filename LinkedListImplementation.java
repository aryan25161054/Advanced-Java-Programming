public class LinkedListImplementation {
    public static void main(String[] args) {
  DoublyLinkedList ll = new DoublyLinkedList();
  ll.insertFirst(5);
  ll.insertFirst(4);
  ll.insertFirst(3);
  ll.insertFirst(2);
  ll.insertFirst(1);
  System.out.println("Before reversal");
  ll.display();
        System.out.println("After reversal");
        ll.reverse();
        ll.display();

    }
}
class Node {
    int data;
    Node next, prev;
    Node(int item){
        this.data = item;
    }
}
class DoublyLinkedList {
     Node head;
     public void insertFirst(int item){
         if(head==null){
             Node newNode = new Node(item);
             newNode.prev = null;
             head = newNode;
             return;
         }
         Node newNode = new Node(item);
         newNode.prev = null;
         newNode.next = head;
         head.prev = newNode;
         head = newNode;

     }
     public void reverse(){
         if(head==null){
             System.out.println("Nothing to reverse");
             return;
         }
         Node current = head;
         Node next = null;
         Node prev = null;
         while(current != null){
             next = current.next;
             current.next = current.prev;
             current.prev = next;

             prev = current;
             current = next;

         }
         head = prev;

     }
     public void display(){
         Node temp = head;
         while(temp != null){
             System.out.print(temp.data+"<-->");
             temp = temp.next;
         }
         System.out.print("null");

         System.out.println();
     }

}