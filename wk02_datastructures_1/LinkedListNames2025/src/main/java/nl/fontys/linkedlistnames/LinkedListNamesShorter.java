package nl.fontys.linkedlistnames;

/**
 * @author Richard van den Ham <r.vandenham@fontys.nl>
 */
public class LinkedListNamesShorter {

    Node<String> head;
     
    public static void main(String[] args) {
        LinkedListNamesShorter list = new LinkedListNamesShorter();
        list.printNames();
        list.addName("Ibrahim");
        list.addName("Martijn");
        list.printNames();
    }
    
    static class Node<E>{
        
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }
    
    void addName(String name){
        head = new Node(name, head);        
    }
    
    void printNames(){
        
        for (Node<String> node = head;  node != null; node = node.next) {
            System.out.println(node.item);
        }
    }
    
}
