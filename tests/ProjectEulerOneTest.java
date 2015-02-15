import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the ProjectEulerOne class with the numbers 10 and 15.
 *
 * @author Eric
 */
public class ProjectEulerOneTest {

  /**
   * Tests computeSumOfMultiples method with 10 and 15.
   * @throws Exception if a problem occurs while computing the sum.
   */
  @Test
  public void testComputeSumOfMultiples() throws Exception {
    assertEquals("Testing sum of multiples of 3 and 5 below 10", 23, ProjectEulerOne.computeSumOfMultiples(10));
    assertEquals("Testing sum of multiples of 3 and 5 below 15", 45, ProjectEulerOne.computeSumOfMultiples(15));
  }
}