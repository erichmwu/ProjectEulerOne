/**
 * Solution to ProjectEuler Problem 1.
 *
 * @author Eric
 */
public class ProjectEulerOne {
  /**
   * Computes the sum of multiples of 3 and 5 up to 1000 and prints out the number.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    int sum = computeSumOfMultiples(1000);
    System.out.println(sum);
  }

  /**
   * Computes and returns the sum of multiples of 3 and 5 below the given upper limit.
   * @param upperLimit the upper limit for the summation.
   * @return the sum of the multiples of 3 and 5 below the upper limit.
   */
  public static int computeSumOfMultiples(int upperLimit) {
    int sum = 0;
    for (int i = 0; i < upperLimit; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
