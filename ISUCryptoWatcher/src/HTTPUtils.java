// This file adds easy ways to use GET for http reuqests.

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class HTTPUtils {
  // Construct new HTTP Client
  static HttpClient client = HttpClient.newHttpClient();
  // Take a URL and return a string of the contents.
  public static String get(String url) throws IOException, InterruptedException {
    // Build a new GET request for the provided URL.
    HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();
    // Execute the request and retrieve the reply.
    HttpResponse<String> response = client.send(request,BodyHandlers.ofString());
    // Return the String response of the the request.
    return response.body();
  }
  
  // Take a URL and return a future of the contents.
  public static CompletableFuture<HttpResponse<String>> aget(String url) throws IOException, InterruptedException, ExecutionException {
    // Build a new GET request for the provided URL.
    HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();
    // Execute the request and collect a future for the response.
    CompletableFuture<HttpResponse<String>> responseFuture = client.sendAsync(request,BodyHandlers.ofString());
    // Return the future
    return responseFuture;
  }
}
