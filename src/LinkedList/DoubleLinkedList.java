package LinkedList;

public class DoubleLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;
        node4.next = node5;
        node5.prev = node4;

        DoubleLinkedListOperations dll = new DoubleLinkedListOperations();

        dll.TraverseDLL(node1);

        if (dll.SearchDLL(node1,90)){
            System.out.println("Element found!!");
        }else{
            System.out.println("Element Not Found!!");
        }
        dll.AddAtBeginning(node1,60);
        dll.InsertInBetween(node1,70,3);
    }

}
