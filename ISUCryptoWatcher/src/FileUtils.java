import com.google.gson.Gson;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {
  private Gson gson = new Gson();
  static void ensureFile(String path){
    try {
      File file = new File(path);
      file.createNewFile();
    } catch (IOException e) {}
  }
  
  public static String read(String path) {
    try {
      ensureFile(path);
      return Files.readString(Path.of(path));
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
