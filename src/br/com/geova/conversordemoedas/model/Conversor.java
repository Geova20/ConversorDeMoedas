package br.com.geova.conversordemoedas.model;

public record Conversor(String base_code,
                        String target_code,
                        String conversion_rate) {
}
