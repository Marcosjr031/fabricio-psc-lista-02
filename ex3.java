import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite o valor de 'a': ");
        a = scanner.nextDouble();

        System.out.print("Digite o valor de 'b': ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("O valor de 'c' é: " + c);

        scanner.close();
    }
}