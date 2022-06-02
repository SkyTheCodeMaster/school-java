import com.google.gson.Gson;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FileUtils {
  static void ensureFile(String path){
    try {
      File file = new File(path);
      file.createNewFile();
    } catch (IOException e) {}
  }
  
  public static String read(String path) {
    try {
      ensureFile(path);
      File file = new File(path);
      Scanner scanner = new Scanner(file);
      String data = scanner.next();
      scanner.close();
      return data;
    } catch (IOException e) {
      return "";
    }
  }
  
  public static boolean write(String path, String data){
    try {
      ensureFile(path);
      FileWriter writer = new FileWriter(path);
      writer.write(data);
      writer.close();
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}
