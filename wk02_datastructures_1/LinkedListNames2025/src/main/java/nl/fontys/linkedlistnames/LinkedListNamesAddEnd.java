package nl.fontys.linkedlistnames;

/**
 * @author Richard van den Ham <r.vandenham@fontys.nl>
 */
public class LinkedListNamesAddEnd {

    Node<String> head;
    Node<String> tail = head;
    
    public static void main(String[] args) {
        LinkedListNamesAddEnd list = new LinkedListNamesAddEnd();
        list.addName("Ibrahim");
        list.addName("Martijn");
        list.printNames();
    }
    
    static class Node<E>{
        
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }
    
    void addName(String name){
        Node<String> toAdd = new Node(name);
        
        if (head == null) {
            head = toAdd;
            tail = toAdd;
        } else {
            tail.next = toAdd;
            tail = toAdd;  // or tail = tail.next;
        }   
    }
    
    void printNames(){
        
        for (Node<String> node = head;  node != null; node = node.next) {
            System.out.println(node.item);
        }
    }
}
