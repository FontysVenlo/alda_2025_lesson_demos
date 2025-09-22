package fontys.sieveoferatosthenes;

/**
 * Sieve of Eratosthenes.
 * Algorithm to find prime numbers.
 * Based on book Algorithms, Sedgewick & Wayne, 4th edition 
 * @author Sedgewick
 */
public class Sieve {

    private final boolean[] primeNumbers;

    public Sieve(int maxNumber) {
        primeNumbers = new boolean[maxNumber];
        
        for (int i = 2; i < primeNumbers.length; i++) {
            primeNumbers[i] = true;
        }

        for (int i = 2; i < primeNumbers.length; i++) {

            if (primeNumbers[i] == true) {
                
                for (int j = i; j * i < primeNumbers.length; j++) {
                 
                    primeNumbers[ j * i ] = false;
                }
            }     
        }
    }

    public void printNumbers() {
        
        for (int i = 0; i < primeNumbers.length; i++) {
            if (primeNumbers[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Sieve sieve = new Sieve(12);
        sieve.printNumbers();
    }

}
