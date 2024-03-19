import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double larguraArea, comprimentoArea, larguraCeramica, comprimentoCeramica, areaTotal, areaCeramica, qtdCeramica, valorTotal, valorMetroQuadrado;

        int quantidadeCeramicaAproximada;

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
            quantidadeCeramicaAproximada = (int) qtdCeramica;
        } else {
            quantidadeCeramicaAproximada = (int) qtdCeramica + 1;
        }

        System.out.println("Digite o valor do metro quadrado da cerâmica:");
        valorMetroQuadrado = scanner.nextDouble();

        valorTotal = quantidadeCeramicaAproximada * valorMetroQuadrado * areaCeramica;

        System.out.println("Para revestir uma área de " + areaTotal + " metros quadrados:");
        System.out.println("Você precisará de " + quantidadeCeramicaAproximada + " cerâmicas."); 
        System.out.println("O valor total é de R$" + valorTotal);

        scanner.close();
    }
}