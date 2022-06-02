import java.util.HashMap;

public class TwoMinerAPIResponse extends APIResponse {
  public HashMap<String,Double> pool_specific;
  
  public TwoMinerAPIResponse(
    String coin, 
    HashMap<String, Double> price, 
    String wallet, 
    String pool, 
    double paid, 
    double unpaid, 
    HashMap<String, Double> last,
    HashMap<String, Double> pool_specific
  ) {
    super(coin, price, wallet, pool, paid, unpaid, last);
    this.pool_specific = pool_specific;
  }
}