import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pesoAtual, alturaCm, alturaM, imc, pesoAtualKg, pesoIdeal, pesoIdealAjustado; 

        System.out.println("Digite seu peso em KG:");
        pesoAtual = scanner.nextDouble();

        System.out.println("Digite sua altura em cm:");
        alturaCm = scanner.nextDouble();

        alturaM = alturaCm / 100; 
        pesoAtualKg = pesoAtual; 
        imc = pesoAtualKg / (alturaM * alturaM);
        pesoIdeal = 22 * (alturaM * alturaM);
        pesoIdealAjustado = 24.9 * (alturaM * alturaM);

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");
        System.out.println("Seu peso ideal ajustado é: " + pesoIdealAjustado + " kg");

        scanner.close();
    }
}