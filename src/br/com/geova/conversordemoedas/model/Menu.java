package br.com.geova.conversordemoedas.model;

public class Menu {
    public void mostrarMenuBoasVindas() {
        String menuBoasVindas = """
                ******************************************
                BEM-VINDO(A) AO CONVERSOR DE MOEDAS! 
                
                Escolha uma das opções de conversão abaixo:
                
                1 - REAL BRASILEIRO >>> DÓLAR AMERICANO
                2 - DÓLAR AMERICANO >>> REAL BRASILEIRO
                3 - REAL BRASILEIRO >>> EURO
                4 - EURO >>> REAL BRASILEIRO
                5 - EURO >>> DÓLAR AMERICANO
                6 - DÓLAR AMERICANO >>> EURO
                7 - SAIR
                
                ******************************************
                """;
        System.out.println(menuBoasVindas);
    }

    public void mostrarOpcoes() {
        String opcoes = """
                
                Escolha uma das opções de conversão abaixo:
                
                1 - REAL BRASILEIRO >>> DÓLAR AMERICANO
                2 - DÓLAR AMERICANO >>> REAL BRASILEIRO
                3 - REAL BRASILEIRO >>> EURO
                4 - EURO >>> REAL BRASILEIRO
                5 - EURO >>> DÓLAR AMERICANO
                6 - DÓLAR AMERICANO >>> EURO
                7 - SAIR
                """;
        System.out.println(opcoes);
    }
}
