import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1, y1, x2, y2, distancia;

        System.out.println("Insira as coordenadas do primeiro ponto (x1, y1):");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        System.out.println("Insira as coordenadas do segundo ponto (x2, y2):");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        System.out.println("A distância entre os pontos é: " + distancia);

        scanner.close();
    }
}