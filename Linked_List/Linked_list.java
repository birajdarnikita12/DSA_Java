class Node{
    public int value;
    public Node next;
}

class Linked_list {
public static void main(String[] args) {
    Node A = new Node();
    Node B = new Node();
    Node C = new Node();
    Node D = new Node();

    A.value = 10;
    B.value = 20;
    C.value = 30;
    D.value = 40;

    A.next = B;
    B.next = C;
    C.next = D;
    D.next = null;

    Node head = new Node();
    head = A;

    // while(head != null){
    //     System.out.println(head.value);
    //     head = head.next;
    // }
    System.out.println(A.next.next.next.next);
    
    
}
}