package LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
//        //Traverse a LinkedList
        SingleLLOperations sllOp = new SingleLLOperations();
//        sllOp.Traverse(node1);
//        //Searching in SLL
//        sllOp.Searching(node1,50);

        //InsertAt beginning
//        sllOp.InsertAtBeginning(node1,5);
        //InsertAtEnd
        sllOp.InsertAtEnd(node1,60);
    }
}
