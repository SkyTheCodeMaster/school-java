// Handles management of wallets.
import java.io.IOException;
import java.util.ArrayList;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class WalletList {
  // The ArrayList where each wallet is stored; grows dynamically.
  public ArrayList<Wallet> wallets = new ArrayList<Wallet>();
  // The path where the wallet.json is stored.
  String path;
  // gson, the json interpreter in use.
  Gson gson = new Gson();
  
  public WalletList(String path) {
    // Set the class path variable to the set path argument.
    this.path = path;
    String contents = FileUtils.read(path);
    if (contents.equals("")) {
      System.out.println("Error encountered during loading wallets!\nWallets will not be available!");
      contents = "[]";
    }
    Type walletListType = new TypeToken<ArrayList<Wallet>>(){}.getType();
    this.wallets = gson.fromJson(contents,walletListType);
    // debug print wheeeee
    for (Wallet wallet : this.wallets) {
      System.out.println(wallet);
    }
  }
  
  private String toJson() {
    String data = gson.toJson(this.wallets);
    return data;
  }
  
  public void addWallet(Wallet wallet) {
    this.wallets.add(wallet);
    boolean success = FileUtils.write(this.path, toJson());
    if (!success) {
      System.out.println("Failed writing wallets!");
    }
  }
  
  public ArrayList<Wallet> findWallet(String walletID) {
    System.out.printf("Looking for wallet %s\n",walletID);
    ArrayList<Wallet> found = new ArrayList<Wallet>();
    for (Wallet wallet : this.wallets) {
      System.out.printf("Checking wallet %s against %s\n", wallet,walletID);
      if (wallet.equals(walletID)) {
        found.add(wallet);
      }
    }
    return found;
  }
}
