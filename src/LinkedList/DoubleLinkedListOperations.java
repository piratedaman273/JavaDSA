package LinkedList;

public class DoubleLinkedListOperations {
    public static void TraverseDLL(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static boolean SearchDLL(Node head, int data){
        Node current = head;
        //If LL is empty
        if (current == null){
            return false;
        }
        while (current!=null){
            if (current.data == data){
                return true;
            }else {
                current = current.next;
            }
        }
        return false;
    }
}
