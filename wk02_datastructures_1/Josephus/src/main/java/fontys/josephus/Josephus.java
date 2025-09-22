package fontys.josephus;

/**
 * Solving Josephus problem.
 * Based on book Algorithms, Sedgewick & Wayne, 4th edition 
 * @author Richard van den Ham {@code r.vandenham@fontys.nl}
 */
public class Josephus {
    
    private static class Node{
        int value;
        Node next;
        
        Node(int v){
            value = v;
        }
    }
    
    public int selectNext(int n, int m){
        
        Node head = new Node(1);
        Node current = head;
        for ( int i = 2; i <= n; i++ ) {
            current.next = new Node(i);
            current = current.next;
        }
        current.next = head;   // Close the circle!
        
        while( current != current.next ){
            
            for ( int i = 1; i < m; i++ ) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        
        return current.value;
    }
    
    public static void main( String[] args ) {
        Josephus j = new Josephus();
        System.out.println( "SELECTED: " + j.selectNext( 9, 5) );
    }
}
