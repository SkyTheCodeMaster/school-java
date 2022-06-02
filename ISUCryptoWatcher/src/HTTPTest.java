import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.google.gson.Gson;

public class HTTPTest {
  public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
    Gson gson = new Gson();
    CompletableFuture<HttpResponse<String>> response = HTTPUtils.aget("https://crypto.skystuff.games/2miner/https://eth.2miners.com/account/0x9f7093042437238394b69285dA89092a2e9a4877");
    System.out.println("We are waiting for the response to finish");
    Thread.sleep(250);
    String skystuffgames = response.get().body();
    
    APIResponse resp = gson.fromJson(skystuffgames,APIResponse.class);
    System.out.println(resp.wallet);
  }
}
