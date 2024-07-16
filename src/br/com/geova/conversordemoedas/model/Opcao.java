package br.com.geova.conversordemoedas.model;

import br.com.geova.conversordemoedas.service.ExchangeRateApi;

import java.io.IOException;
import java.util.Scanner;

public class Opcao {
    private int opcaoEscolhida;
    private double valorParaConversao;

    Scanner leitor = new Scanner(System.in);
    ExchangeRateApi exchangeRateApi = new ExchangeRateApi();

    public int getOpcaoEscolhida() {
        return opcaoEscolhida;
    }

    public void setOpcaoEscolhida(int opcaoEscolhida) {
        this.opcaoEscolhida = opcaoEscolhida;
    }

    public void escolha(int opcaoEscolhida) throws IOException {
        switch (opcaoEscolhida){
            case 1:
                System.out.println("\nOpção escolhida: REAL BRASILEIRO >>> DÓLAR AMERICANO");
                System.out.println("\nDigite o valor para realizar a conversão");
                var valorParaConversao = leitor.nextDouble();
                var conversao = exchangeRateApi.converte("BRL", "000");
                double valorConvertido = Double.parseDouble(conversao.conversion_rate());

                System.out.println("\nO valor $" + valorParaConversao + " [BRL] é equivalente" +
                        " ao valor de $ " + (valorParaConversao * valorConvertido) + " [USD]");
                System.out.println("\n***********************************************************");
                HistoricoDeConversoes historico = new HistoricoDeConversoes();
                historico.geraJson(conversao);
                break;
            case 2:
                System.out.println("\nOpção escolhida: DÓLAR AMERICANO >>> REAL BRASILEIRO");
                System.out.println("\nDigite o valor para realizar a conversão");
                valorParaConversao = leitor.nextDouble();
                conversao = exchangeRateApi.converte("USD", "BRL");
                valorConvertido = Double.parseDouble(conversao.conversion_rate());

                System.out.println("\nO valor $" + valorParaConversao + " [USD] é equivalente" +
                        " ao valor de $ " + (valorParaConversao * valorConvertido) + " [BRL]");
                System.out.println("\n***********************************************************");
                historico = new HistoricoDeConversoes();
                historico.geraJson(conversao);
                break;
            case 3:
                System.out.println("\nOpção escolhida: REAL BRASILEIRO >>> EURO");
                System.out.println("\nDigite o valor para realizar a conversão");
                valorParaConversao = leitor.nextDouble();
                conversao = exchangeRateApi.converte("BRL", "EUR");
                valorConvertido = Double.parseDouble(conversao.conversion_rate());

                System.out.println("\nO valor $" + valorParaConversao + " [BRL] é equivalente" +
                        " ao valor de $ " + (valorParaConversao * valorConvertido) + " [EUR]");
                System.out.println("\n***********************************************************");
                historico = new HistoricoDeConversoes();
                historico.geraJson(conversao);
                break;
            case 4:
                System.out.println("\nOpção escolhida: EURO >>> REAL BRASILEIRO");
                System.out.println("\nDigite o valor para realizar a conversão");
                valorParaConversao = leitor.nextDouble();
                conversao = exchangeRateApi.converte("EUR", "BRL");
                valorConvertido = Double.parseDouble(conversao.conversion_rate());

                System.out.println("\nO valor $" + valorParaConversao + " [EUR] é equivalente" +
                        " ao valor de $ " + (valorParaConversao * valorConvertido) + " [BRL]");
                System.out.println("\n***********************************************************");
                historico = new HistoricoDeConversoes();
                historico.geraJson(conversao);
                break;
            case 5:
                System.out.println("\nOpção escolhida: EURO >>> DÓLAR AMERICANO");
                System.out.println("\nDigite o valor para realizar a conversão");
                valorParaConversao = leitor.nextDouble();
                conversao = exchangeRateApi.converte("EUR", "USD");
                valorConvertido = Double.parseDouble(conversao.conversion_rate());

                System.out.println("\nO valor $" + valorParaConversao + " [EUR] é equivalente" +
                        " ao valor de $ " + (valorParaConversao * valorConvertido) + " [USD]");
                System.out.println("\n***********************************************************");
                historico = new HistoricoDeConversoes();
                historico.geraJson(conversao);
                break;
            case 6:
                System.out.println("\nOpção escolhida: DÓLAR AMERICANO >>> EURO");
                System.out.println("\nDigite o valor para realizar a conversão");
                valorParaConversao = leitor.nextDouble();
                conversao = exchangeRateApi.converte("USD", "EUR");
                valorConvertido = Double.parseDouble(conversao.conversion_rate());

                System.out.println("\nO valor R$" + valorParaConversao + " [USD] é equivalente" +
                        " ao valor de $ " + (valorParaConversao * valorConvertido) + " [EUR]");
                System.out.println("\n***********************************************************");
                historico = new HistoricoDeConversoes();
                historico.geraJson(conversao);
                break;
            case 7:
                System.out.println("\nAplicação encerrada!");
            default:
                System.out.println("\nOpção inválida inserida! A opção escolhida deve estar presente no menu!" +
                        "\n\n***********************************************************");

        }
    }

}
