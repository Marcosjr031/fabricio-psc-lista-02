import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ValorEtanol, ValorGasolina, LimiteValor;

        System.out.print("Qual o valor do etanol: R$ ");
        ValorEtanol = scanner.nextDouble();

        System.out.print("Qual o valor da gasolina: R$ ");
        ValorGasolina = scanner.nextDouble();

        LimiteValor = ValorGasolina * 0.7;

        if (ValorEtanol < LimiteValor) {
            System.out.println("É aconselhado abastecer com etanol.");
        } else {
            System.out.println("É aconselhado abastecer com gasolina.");
        }

        scanner.close();
    }
}