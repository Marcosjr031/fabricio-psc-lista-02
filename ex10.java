import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso, litros;

        System.out.println("Insira seu peso em KG:");
        peso = scanner.nextDouble();

        litros = peso * 35 / 1000; 

        System.out.println("A quanidade de água recomendada para você é de " + litros + " litros por dia.");

        scanner.close();
    }
}