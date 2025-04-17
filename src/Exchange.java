
public class Exchange {

    private final double cotacaoDolar = 5.5; // cotação do dolar
    private final double iof = 0.0586; // IOF de 5,86%
    private final double taxaOperacaoEmPercentual = 1; // Taxa de operação de 1% = 0.01

    @SuppressWarnings ("unused")

    public double comprarDolar(double valorReal) {
        // Converte o valor em reais para dólares 
        double valorDolar = valorReal / cotacaoDolar; // 1000/5.5 = 181,82 reais
        System.out.println("Valor Dolar convertido: " + valorDolar);
        // Calcula o IOF e subtrai 
        double valorDolarComIof = valorDolar - (valorDolar * iof); // Subtrai o IOF = 10,65 = (5,86%): 181,82 - (181,82 * 0.0586) // valorDolarComIof fica = 171,17
        System.out.println("Valor dolar com IOF: " + valorDolarComIof);

        // Encontrando o valor da taxa de operação
        double valorTaxaOperacao = valorDolar * (taxaOperacaoEmPercentual / 100); // (1% do valor bruto): 181,82 * 0.01 = 1,82 dólares.
        // Mudou aqui linha '12'
        System.out.println("Valor taxa de operação: " + valorTaxaOperacao);

        // subtraindo a taxa de operação do valor do dolar ja com o iof descontado
        double valorfinalDolar = valorDolarComIof - valorTaxaOperacao;
        // mudou adicionado valorfinaldolar para receber o valordolarcomiof - valorTaxaOperacao
        return valorfinalDolar;
        // adicionou o return utilizando o valor da variavel valorfinaldolar
    }

    public static void main(String[] args) {
        Exchange exchance = new Exchange();
        double valorReal = 1000;
        double valorfinaldolar = exchance.comprarDolar(valorReal);
        System.out.println("Valor em Dolar: " + valorfinaldolar);
    }
}