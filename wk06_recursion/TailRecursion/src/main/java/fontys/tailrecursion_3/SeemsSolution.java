package fontys.tailrecursion_3;

/**
 * Tail recursive solution.
 * Be aware that this solution in Java still causes a growing call stack with
 * a number of elements equal to the recursion depth.
 * 
 * When optimized for tail recursion, there would be no real need to put tail 
 * recursive calls on the method call stack, since on the deepest recursion 
 * level (the method call in which the stop condition is true) the final result
 * is already known.
 * 
 * @author hvd
 */
public class SeemsSolution {

    public static void main( String[] args ) {
        int result = factorial( 1, 6 );
        System.out.println( "Result is " + result );
    }

    static int factorial( int intermediateResult, int n ) {
        if ( n == 0 ) {
            return intermediateResult;
        }
        return factorial( n * intermediateResult, n - 1 );
    }
}
