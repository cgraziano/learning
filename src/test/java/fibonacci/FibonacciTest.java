package fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
  @Test
  public void testFibonacci0() {
    int n = 0;
    int expectedValue = 0;
    assertEquals(expectedValue, Fibonacci.exponentialAlgorithm(n));
    assertEquals(expectedValue, Fibonacci.polynomialAlgorithm(n));
  }

  @Test
  public void testFibonacci1() {
    int n = 1;
    int expectedValue = 1;
    assertEquals(expectedValue, Fibonacci.exponentialAlgorithm(n));
    assertEquals(expectedValue, Fibonacci.polynomialAlgorithm(n));
  }

  @Test
  public void testFibonacci2() {
    int n = 2;
    int expectedValue = 1;
    assertEquals(expectedValue, Fibonacci.exponentialAlgorithm(n));
    assertEquals(expectedValue, Fibonacci.polynomialAlgorithm(n));
  }

  @Test
  public void testFibonacci9() {
    int n = 9;
    int expectedValue = 34;
    assertEquals(expectedValue, Fibonacci.exponentialAlgorithm(n));
    assertEquals(expectedValue, Fibonacci.polynomialAlgorithm(n));
  }
}
