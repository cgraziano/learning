package fibonacci;

import org.junit.Test;
import stopwatch.Stopwatch;

public class FibonacciTime {
  private int maxFibonacciNumber = 200000;
  private int numberOfTimesToRepeat = 2;

  @Test
  public void timeExponentialFibonacci() {
    Stopwatch stopwatch = new Stopwatch();
    float averageTime = 0.0f;
    for (int n = 0; n <= maxFibonacciNumber; ++n) {
      stopwatch.resetTime();
      stopwatch.startTime();
      for (int i = 0; i < numberOfTimesToRepeat; ++i) {
        Fibonacci.exponentialAlgorithm(n);
      }
      stopwatch.stopTime();
      averageTime = ((float) stopwatch.getTime())/numberOfTimesToRepeat;

      System.out.println("Average time for " + numberOfTimesToRepeat + " times of calculating Fibonacci number of " + n + " is " + averageTime/1000.00f);

    }


  }

  @Test
  public void timePolynomialFibonacci() {
    Stopwatch stopwatch = new Stopwatch();
    float averageTime = 0.0f;
    for (int n = 0; n <= maxFibonacciNumber; ++n) {
      stopwatch.resetTime();
      stopwatch.startTime();
      for (int i = 0; i < numberOfTimesToRepeat; ++i) {
        Fibonacci.polynomialAlgorithm(n);
      }
      stopwatch.stopTime();
      averageTime = ((float) stopwatch.getTime())/numberOfTimesToRepeat;

      System.out.println("Average time for " + numberOfTimesToRepeat + " times of calculating Fibonacci number of " + n + " is " + averageTime/1000.00f);

    }


  }

}
