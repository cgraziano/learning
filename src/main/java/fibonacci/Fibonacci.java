package fibonacci;

public class Fibonacci {

  /**
   * Calcuates the nth Fibonacci number given the where 0 <= n.
   * @param n
   * @return
   */
  public static int exponentialAlgorithm(int n){
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return exponentialAlgorithm(n-1) + exponentialAlgorithm(n-2);
    }
  }

  /**
   * Calcuates the nth Fibonacci number given the where 0 <= n.
   * @param n
   * @return
   */
  public static int polynomialAlgorithm(int n){
    if (n == 0) {
      return 0;
    } else {
      int lengthOfFibonacciArray = n + 1;
      int[] fibonacciNumbers = new int[lengthOfFibonacciArray];
      fibonacciNumbers[0] = 0;
      fibonacciNumbers[1] = 1;
      if (2 <= n) {
        for (int i = 2; i < lengthOfFibonacciArray; ++i) {
          fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }
      }
      return fibonacciNumbers[n];
    }
  }
}
