public class ArrayUtils {
  public static int sumInt(int[] arr) {
    int sum = 0;
    for (int i=0;i<arr.length;i++) { sum += arr[i]; }
    return sum;
  }
}
