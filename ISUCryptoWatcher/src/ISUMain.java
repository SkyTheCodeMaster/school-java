import java.io.IOException;

public class ISUMain {
  public WalletList wallets = new WalletList("wallets.json");
  public static void main(String[] args) throws IOException {
    FileUtils.write("wallets.json", "[]");
    new MainWindow();
  }
}
