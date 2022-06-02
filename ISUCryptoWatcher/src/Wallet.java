
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
  
  public String toString() {
    return String.format("Wallet [wallet=%s coin=%s pool=%s url=%s icon=%s", this.wallet,this.coin,this.pool,this.url,this.icon);
  }
  
  public boolean equals(String walletID) {
    return this.wallet.equals(walletID);
  }
}
