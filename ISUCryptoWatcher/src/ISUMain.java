import java.io.IOException;

public class ISUMain {
  public static WalletList wallets = new WalletList("wallets.json");
  public static void main(String[] args) throws IOException {
    new MainWindow();
  }
}
