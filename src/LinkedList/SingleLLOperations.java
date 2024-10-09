package LinkedList;

public class SingleLLOperations {
    //Traverse a Linked list
    public static void Traverse(Node head){
        Node current = head;
        while (current !=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    //Search a LL
    public static void Searching(Node head, int data){
        boolean flag = false;
        Node current = head;
        while (current.next !=null){
            if (current.data == data){
                System.out.println("Element found!!");
                flag = true;
                break;
            }
            current = current.next;
        }
        if (!flag){
            System.out.println("Element not found!!");
        }
    }

    public static void InsertAtBeginning(Node head,int data){
        Node newNode = new Node(data);
        newNode.next = head;
        Traverse(newNode);
    }
    public static void InsertAtEnd(Node head,int data){
        Node currentNode = head;
        Node newNode = new Node(data);
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }
        if (currentNode.next == null){
            currentNode.next = newNode;
        }
        Traverse(head);
    }
}
