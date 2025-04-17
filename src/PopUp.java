// Importando a classe 'JOptionPane' da biblioteca 'java.swing'
// Caixas de dialogo que permitem interação com o usuario

import javax.swing.JOptionPane;

public class PopUp {
     public static void main(String[] args) {

        // Caixa de dialogo 'Olá mundo';
        JOptionPane.showMessageDialog(null, "Olá Mundo! ");

        // Exibe um popUp, pedindo que digite o nome;
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome ");
        // Exibe um popUp, exibindo o nome digitado;
        JOptionPane.showMessageDialog(null, "O nome digitado foi: " + nome);

        // Exibe um popUp, pedindo que digite sua idade;.
        // Para converter a string pedida no popup em int(number), deve-se utilizar o comando 'Integer.parseInt';
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade: "));
        // Exibe um popUp exibindo a idade digitada.
        JOptionPane.showMessageDialog(null, "A idade é: " + idade);

        // Exibe um popUp com nome e idade requeridos anteriormente.
        // '\n' usado para quebra de linha.
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade);
    }
}

