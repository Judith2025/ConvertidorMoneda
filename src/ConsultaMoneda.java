import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaMoneda {

  public static double ValorMoneda(String MonedaBase, String MonedaDestino) throws IOException, InterruptedException {

      String URL =("https://v6.exchangerate-api.com/v6/a9010adfdb00e795ff67a7bc/pair/"+ MonedaBase+"/"+ MonedaDestino);


      System.out.println("Introduce monto a convertir: ");
      Scanner scanner = new Scanner(System.in);
      double monto =scanner.nextInt();
      scanner.nextLine();


      HttpClient client = HttpClient.newHttpClient();
      HttpRequest request = HttpRequest.newBuilder(URI.create(URL)).build();

      HttpResponse<String> respuesta = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(respuesta.body());

      JsonElement elemento = JsonParser.parseString(respuesta.body());
      JsonObject objeto = elemento.getAsJsonObject();

      double tasaConversion = objeto.get("conversion_rate").getAsDouble();
      double resultado =  monto * tasaConversion;
      return resultado;

  }



}
