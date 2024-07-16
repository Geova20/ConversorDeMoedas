package br.com.geova.conversordemoedas.service;

import br.com.geova.conversordemoedas.model.Conversor;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateApi {
    public Conversor converte(String base_code, String target_code) {
        String apiKey = "SUA-CHAVE-API";
        String endereco = "https://v6.exchangerate-api.com/v6/" + apiKey + "pair/" + base_code + "/" + target_code;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (IOException | InterruptedException | JsonSyntaxException e) {
            throw new RuntimeException("Moeda inválida! Não foi possível realizar a conversão.");
        }
    }
}
