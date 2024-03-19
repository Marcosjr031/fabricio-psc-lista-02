import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double watts, horas, valorKWh, consumoKWhDiario, consumoKWhMensal, valorTotalMensal, diasMes;
        
        diasMes = 30.4; 

        System.out.println("Insira a potência do equipamento em Watts:");
        watts = scanner.nextDouble();

        System.out.println("Insira quantas horas o equipamento fica ligado por dia:");
        horas = scanner.nextDouble();

        System.out.println("Insira o valor do KW/h:");
        valorKWh = scanner.nextDouble();

        consumoKWhDiario = (watts * horas) / 1000;
        consumoKWhMensal = consumoKWhDiario * diasMes;
        valorTotalMensal = consumoKWhMensal * valorKWh;

        System.out.println("O equipamento consome " + consumoKWhDiario + " KWh por dia.");
        System.out.println("O valor mensal é de R$" + valorTotalMensal);

        scanner.close();
    }
}