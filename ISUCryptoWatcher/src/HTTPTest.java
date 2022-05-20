import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HTTPTest {
  public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
    CompletableFuture<HttpResponse<String>> response = HTTPUtils.aget("https://crypto.skystuff.games/2miner/https://eth.2miners.com/account/0x9f7093042437238394b69285dA89092a2e9a4877");
    System.out.println("We are waiting for the response to finish");
    Thread.sleep(250);
    String skystuffgames = response.get().body();
    System.out.println(skystuffgames);
  }
}
