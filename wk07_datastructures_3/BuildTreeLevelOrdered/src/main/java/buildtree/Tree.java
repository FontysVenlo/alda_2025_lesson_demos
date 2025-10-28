package buildtree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @param <E>
 */
public class Tree<E> {

    TNode root;

    private class TNode {

        TNode left;
        E item;
        TNode right;

        public TNode( E item ) {
            this.item = item;
        }
    }

    public Tree( E... items ) {

        Queue<TNode> itemsQ = new LinkedList<>();
        Queue<TNode> availableParentsQ = new LinkedList<>();

        for ( E element : items ) {
            itemsQ.add( new TNode( element ) );
        }

        root = itemsQ.poll();
        availableParentsQ.add( root );

        while ( !itemsQ.isEmpty() ) {
            
            TNode parent = availableParentsQ.poll();
            TNode leftChild = itemsQ.poll();
            
            parent.left = leftChild;
            availableParentsQ.add( leftChild );
            
            if ( !itemsQ.isEmpty() ) {
                TNode rightChild = itemsQ.poll();
            
                parent.right = rightChild;
                availableParentsQ.add( rightChild );
            }
        }
    }
    
    public void print(){
        print( root );
    }
    
    private void print( TNode node ){
        Queue<TNode> nodeQ = new LinkedList<>();
        nodeQ.add( node );

        while (!nodeQ.isEmpty()){
            node = nodeQ.poll();
            System.out.println( node.item );
            
            if( node.left != null ) nodeQ.add( node.left );
            if( node.right != null ) nodeQ.add( node.right );
        }
    }
    
    public static void main( String[] args ) {
        Tree tree = new Tree("A","B","C","D","E","F");
        tree.print( );
    }
}
