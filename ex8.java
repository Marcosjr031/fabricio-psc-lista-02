import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tamanhoMB, velocidadeMbps,tamanhoBits, segundos, minutos;

        System.out.println("Digite o tamanho do arquivo em MB:");
        tamanhoMB = scanner.nextDouble();

        System.out.println("Digite a velocidade do link em Mbps:");
        velocidadeMbps = scanner.nextDouble();

        tamanhoBits = tamanhoMB * 8 * 1024 * 1024; 
        segundos = tamanhoBits / (velocidadeMbps * 1024 * 1024); 
        minutos = segundos / 60; 

        System.out.println("Seu donwload deve finalizar em aproximadamente " + minutos + " minutos.");

        scanner.close();
    }
}