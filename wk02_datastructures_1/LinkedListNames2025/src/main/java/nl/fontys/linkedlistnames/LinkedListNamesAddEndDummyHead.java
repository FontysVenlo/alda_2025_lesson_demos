package nl.fontys.linkedlistnames;

/**
 * @author Richard van den Ham <r.vandenham@fontys.nl>
 */
public class LinkedListNamesAddEndDummyHead {

    Node<String> head = new Node(null);
    Node<String> tail = head;

    public static void main(String[] args) {
        LinkedListNamesAddEndDummyHead list = new LinkedListNamesAddEndDummyHead();
        list.addName("Ibrahim");
        list.addName("Martijn");
        list.printNames();
    }

    static class Node<E> {

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }

    void addName(String name) {
        
        Node<String> toAdd = new Node(name);

        tail.next = toAdd;
        tail = toAdd;  // or tail = tail.next;
    }

    void printNames() {

        for (Node<String> node = head.next; node != null; node = node.next) {
            System.out.println(node.item);
        }
    }
}
