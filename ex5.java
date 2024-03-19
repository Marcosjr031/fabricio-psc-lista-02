import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double comprimento, largura, area, perimetro, diagonal;

        System.out.println("Informe o comprimento:");
        comprimento = scanner.nextDouble();

        System.out.println("Informe a largura:");
        largura = scanner.nextDouble();

        area = comprimento * largura;

        perimetro = 2 * (comprimento + largura);

        if (comprimento > largura) {
            diagonal = comprimento * Math.sqrt(1 + (largura * largura) / (comprimento * comprimento));
        } else {
            diagonal = largura * Math.sqrt(1 + (comprimento * comprimento) / (largura * largura));
        }

        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + perimetro);
        System.out.println("A diagonal do retângulo é: " + diagonal);

        scanner.close();
     }
}