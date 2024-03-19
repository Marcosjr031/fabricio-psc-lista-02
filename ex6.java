import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double larguraArea, comprimentoArea, larguraCeramica, comprimentoCeramica, areaTotal, areaCeramica, qtdCeramica, qtdCeramicaAproximada;

        System.out.println("Digite a largura da área:");
        larguraArea = scanner.nextDouble();

        System.out.println("Digite o comprimento da área:");
        comprimentoArea = scanner.nextDouble();

        System.out.println("Digite a largura da cerâmica:");
        larguraCeramica = scanner.nextDouble();

        System.out.println("Digite o comprimento da cerâmica:");
        comprimentoCeramica = scanner.nextDouble();

        areaTotal = larguraArea * comprimentoArea;
        areaCeramica = larguraCeramica * comprimentoCeramica;

        qtdCeramica = (areaTotal / areaCeramica) * 1.1;
  
        
        if (qtdCeramica % 1 == 0) {
            qtdCeramicaAproximada = (int) qtdCeramica;
        } else {
            qtdCeramicaAproximada = (int) qtdCeramica + 1;
        }

        System.out.println("Para revestir uma área de " + areaTotal + " metros quadrados:");
        System.out.println("Você precisará de " + qtdCeramicaAproximada + " cerâmicas.");

        scanner.close();
    }
}