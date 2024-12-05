import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConsultaMoneda {

    public double consultaMoneda(String monedaBase,String monedaDestino, double cantidad) throws IOException, InterruptedException {

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/0859da5de4ba7de37c36d1cb/pair/" + monedaBase + "/" + monedaDestino);


    try{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Map<?, ?> json2 = gson.fromJson(response.body(), Map.class);

        Double valorConvertido = (Double) json2.get("conversion_rate");

        return valorConvertido * cantidad;
    } catch (Exception e) {
        throw new RuntimeException("No encontré esa moneda");
    }
    }
}
