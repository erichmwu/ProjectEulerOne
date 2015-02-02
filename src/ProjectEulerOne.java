/**
 * Created by Eric on 2/1/2015.
 */
public class ProjectEulerOne {
  public static void main(String[] args) {
    double sum = 0;
    for (int i = 0; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
