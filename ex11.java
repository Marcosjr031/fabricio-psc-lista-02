import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double watts, horas, valorKWh, consumoKWh, valorTotal;

        System.out.println("Insira a potência equipamento em Watts:");
        watts = scanner.nextDouble();

        System.out.println("Insira quantas horas o equipamento fica ligado por dia:");
        horas = scanner.nextDouble();

        System.out.println("Insira o valor do KW/h:");
        valorKWh = scanner.nextDouble();

        consumoKWh = (watts * horas) / 1000;

        valorTotal = consumoKWh * valorKWh;

        System.out.println("O equipamento consome " + consumoKWh + " KWh por dia.");
        System.out.println("O valor total a ser pago é de R$" + valorTotal + " por dia.");

        scanner.close();
    }
}