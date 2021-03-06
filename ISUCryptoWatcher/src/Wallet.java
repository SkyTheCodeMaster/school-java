import com.google.gson.Gson;

public class Wallet {
  public String wallet;
  public String coin;
  public String pool;
  public String url; // Web dashboard URL passed in to the settings panel
  public String icon; // Path to icon
  public Wallet(
    String wallet,
    String coin,
    String pool,
    String url,
    String icon
  ) {
    this.wallet = wallet;
    this.coin = coin;
    this.pool = pool;
    this.url = url;
    this.icon = icon;
  }
  
  public APIResponse get() {
    Gson gson = new Gson();
    String URL_TEMPLATE = "https://crypto.skystuff.games/%s/%s";
    System.out.println(String.format(URL_TEMPLATE,this.pool,this.url));
    String response = HTTPUtils.get(String.format(URL_TEMPLATE,this.pool,this.url));
    System.out.println(response);
    APIResponse resp = gson.fromJson(response, APIResponse.class);
    return resp;
  }
  
  public String toString() {
    return String.format("Wallet [wallet=%s coin=%s pool=%s url=%s icon=%s]", this.wallet,this.coin,this.pool,this.url,this.icon);
  }
  
  public boolean equals(String walletID) {
    return this.wallet.equals(walletID);
  }
  
  public boolean equals(Wallet otherWallet) {
    return this.wallet.equals(otherWallet.wallet);
  }
  
  
}
