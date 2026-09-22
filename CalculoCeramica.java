import java.util.Scanner;

public class CalculoCeramica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Largura da cerâmica (m): ");
        double larguraCeramica = scanner.nextDouble();

        System.out.print("Comprimento da cerâmica (m): ");
        double comprimentoCeramica = scanner.nextDouble();

        System.out.print("Largura do terreno (m): ");
        double larguraTerreno = scanner.nextDouble();

        System.out.print("Comprimento do terreno (m): ");
        double comprimentoTerreno = scanner.nextDouble();

        int colunas = (int) Math.ceil(larguraTerreno / larguraCeramica);
        int linhas = (int) Math.ceil(comprimentoTerreno / comprimentoCeramica);

        int colunasPares = colunas / 2;
        int colunasImpares = colunas - colunasPares;

        int qtdCor1 = colunasPares * linhas;
        int qtdCor2 = colunasImpares * linhas;

        System.out.println("\nTotal de colunas: " + colunas);
        System.out.println("Cor 1 (Pares): " + qtdCor1);
        System.out.println("Cor 2 (Ímpares): " + qtdCor2);
        System.out.println("Total: " + (qtdCor1 + qtdCor2));

        scanner.close();
    }
}