import com.google.gson.Gson;

import java.io.IOException;
public class GSONTest {
  public static void main(String[] args) throws IOException, InterruptedException {
    Gson gson = new Gson();
    String[] arr = gson.fromJson("['my string lol','two string lol']", String[].class);
    //ArrayUtils.printArray(arr);
    int[] arr2 = gson.fromJson("[1,2,3,4]", int[].class);
    //ArrayUtils.printArray(arr2);
  }
}