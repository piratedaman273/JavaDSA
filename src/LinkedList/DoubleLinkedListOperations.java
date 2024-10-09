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
    public static void AddAtBeginning(Node head,int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        TraverseDLL(head);
    }
    public static void InsertInBetween(Node head,int data,int index){
        Node newNode = new Node(data);
        Node current = head;

        if(index == 0){
            //Meaning we have to add in beginning
            AddAtBeginning(head,data);
        }else {
            int counter = 0;
            while (current != null){
                if(counter == index){
                    newNode.prev = current;
                    newNode.next = current.next;
                    current.next = newNode;
                    current.next.prev = newNode;
                    TraverseDLL(head);
                    break;
                }else {
                    counter++;
                    current = current.next;
                }
            }
        }
    }
}
