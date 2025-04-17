// Importando a classe 'Scanner' da biblioteca 'java.util'
// Usada p/ entrada e saida de dados.

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {

        System.out.println("Digite sua idade:");
        Scanner ler = new Scanner(System.in);
        int idade = ler.nextInt();
        System.out.println("A idade é: " + idade);
        ler.close();

    }
}
