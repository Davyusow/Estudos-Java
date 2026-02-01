package java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class ClientHttpMassa {
    public static void main(String[] args) throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://xkcd.com/info.0.json"))
                .build();

        var httpClient = HttpClient.newBuilder().build();

        var response = httpClient.send(request, BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
