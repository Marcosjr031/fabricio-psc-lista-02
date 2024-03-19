import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, den1, num2, den2, numeradorFinal, denominadorFinal;

        System.out.println("Insira o numerador da primeira fração:");
        num1 = scanner.nextInt();
        System.out.println("Insira o denominador da primeira fração:");
        den1 = scanner.nextInt();

        System.out.println("Insira o numerador da segunda fração:");
        num2 = scanner.nextInt();
        System.out.println("Insira o denominador da segunda fração:");
        den2 = scanner.nextInt();

        denominadorFinal = den1 * den2;
        numeradorFinal = (num1 * den2) + (num2 * den1);

        System.out.println("A soma das frações é:");
        System.out.println(numeradorFinal + "/" + denominadorFinal);

        scanner.close();
    }
}