
import javax.swing.JOptionPane;

public class Eleitor {
    public static void main(String[] args) {

        // Abre uma caixa de dialogo, pedindo que insira a idade;
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a sua idade"));

        // Faz a comparação de idades para definir se é elegivel ou não;
        if (idade < 16) {
            JOptionPane.showMessageDialog(null, "Não elegível para votar");
        } else if (idade >= 16 && idade < 18) {
            JOptionPane.showMessageDialog(null, "Voto facultativo (Não Obrigatório)");
        } else if (idade >= 70) {
            JOptionPane.showMessageDialog(null, "Voto facultativo (Não Obrigatório)");
        } else {
            JOptionPane.showMessageDialog(null, "Voto Obrigatorio");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Diogo Lindo " + i+"°");
        }
    }
}
    