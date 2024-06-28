package monedas;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class datosMonedas {
    public valoresMoneda datosmonedass(String monedaBase,  String monedaConvertida)  {
        //comunicacion entre clinete servidor
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/d0eb1777402e04c3fb484679/pair/"+monedaBase+"/"+monedaConvertida))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), valoresMoneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré valor a converitr");
        }


    }



}
