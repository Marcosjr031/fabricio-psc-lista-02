import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor1, valor2, valor3, resultado, valorDesconhecido;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextDouble();

        System.out.print("Digite o valor desconhecido: ");
        valorDesconhecido = scanner.nextDouble();

        if (valor1 == 0) {
            resultado = (valorDesconhecido * valor2) / valor3;
            System.out.println("O valor desconhecido é: " + resultado);
        } else if (valor2 == 0) {
            resultado = (valorDesconhecido * valor3) / valor1;
            System.out.println("O valor desconhecido é: " + resultado);
        } else if (valor3 == 0) {
            resultado = (valorDesconhecido * valor1) / valor2;
            System.out.println("O valor desconhecido é: " + resultado);
        } else {
            System.out.println("Um dos valores conhecidos deve ser zero.");
        }

        scanner.close();
    }
}