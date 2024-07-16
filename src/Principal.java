import br.com.geova.conversordemoedas.model.Menu;
import br.com.geova.conversordemoedas.model.Opcao;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Menu novoMenu = new Menu();
        Opcao opcao = new Opcao();
        boolean primeiraIteracao = true;
        novoMenu.mostrarMenuBoasVindas();

        while(true) {
            if (!primeiraIteracao) {
                novoMenu.mostrarOpcoes();
            }
            primeiraIteracao = false;
            try {
                opcao.setOpcaoEscolhida(leitor.nextInt());
                if (opcao.getOpcaoEscolhida() == 7) {
                    break;
                }
                opcao.escolha(opcao.getOpcaoEscolhida());
            } catch (InputMismatchException | IOException e) {
                System.out.println("\nErro: " + e + "\nA opção deve ser informada como um número inteiro!" +
                        "\n\n***********************************************************");
                leitor.next();
            } catch (NullPointerException e) {
                System.out.println("\nErro: " + e + "\nInforme sua chave API na classe br.com.geova.service.ExchangeRateApi!" +
                        "\n\n***********************************************************");
            }
        }

    }
}
