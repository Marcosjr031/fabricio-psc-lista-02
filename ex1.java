import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ValorHora;

        int horas, minutos, HorasPassadas;

        System.out.print("Digite as horas: ");
        ValorHora = scanner.nextLine();

        String[] partes = ValorHora.split(":");
        horas = Integer.parseInt(partes[0]);
        minutos = Integer.parseInt(partes[1]);

        HorasPassadas = horas * 60 + minutos;

        System.out.println("Passaram " + HorasPassadas + " minutos desde o início do dia.");

        scanner.close();
    }
}