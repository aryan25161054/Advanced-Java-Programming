//import java.util.Scanner;
//
//public class LinkedList {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int tests = sc.nextInt();
//
//        for(int i = 1; i<=tests ; i++){
//            DoublyLL ll = new DoublyLL();
//            int size = sc.nextInt();
//             ll.setSize(size);
//
//
//            for(int j = 1; j<=size; j++){
//                int item = sc.nextInt();
//              ll.insertLast(item);
//            }
//
//            if(size==1){
//                System.out.println("YES");
//                continue;
//            }
//            if(ll.isPalindrom()){
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//
//        }
//
//    }
//}
//class NODE{
//    int data;
//    int size;
//    NODE next, prev;
//
//    NODE(int item){
//        this.data = item;
//    }
//}
//
//class DoublyLL {
//   public NODE Head;
//   public NODE tail;
//   public int  Size;
//    public int  setSize(int size){
//        Size = size;
//        return size;
//    }
//  public void insertLast(int item) {
//        if(Head==null){
//          NODE newNode = new NODE(item);
//          newNode.next = null;
//          newNode.prev= Head;
//          Head = newNode;
//          tail = newNode;
//          return;
//        }
//        NODE newNode = new NODE(item);
//        newNode.next = null;
//        tail.next = newNode;
//        newNode.prev =tail;
//        tail = newNode;
//  }
//  public boolean isPalindrom(){
//      NODE temp = Head;
//      int count = 0;
//      NODE last = tail;
//      while(count<=Size/2){
//          if(temp.data !=last.data){
//              return false;
//          }
//          temp = temp.next;
//          last = last.prev;
//          count++;
//      }
//      return true;
//  }
//
//}
//
