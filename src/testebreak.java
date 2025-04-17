
public class testebreak {
    public static void main(String[] args) {
        for (int cont = 1; cont <= 500; cont++) {
            System.out.println("Número: " + cont);
            if (cont == 200) {
                break;
            }
        }
    }
}
