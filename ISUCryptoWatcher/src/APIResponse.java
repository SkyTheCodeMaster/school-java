import java.util.HashMap;

public class APIResponse {
  public String coin;
  public String wallet;
  public String pool;
  public double paid;
  public double unpaid;
  public String hashrate;
  public HashMap<String,Double> last;
  public HashMap<String,Double> price;
  
  public APIResponse(String coin, HashMap<String,Double> price, String wallet, String pool, double paid, double unpaid, String hashrate, HashMap<String,Double> last) {
    this.coin = coin;
    this.price = price;
    this.wallet = wallet;
    this.pool = pool;
    this.paid = paid;
    this.hashrate = hashrate;
    this.unpaid = unpaid;
    this.last = last;
  }
}