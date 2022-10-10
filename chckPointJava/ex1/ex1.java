import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int qtdmkt, qtdproduto = 0;
        int produtos[][]=new int [2][4];

        System.out.print("Informe a quantidade de supermercados a serem pesquisados: ");
        qtdmkt = key.nextInt();

        System.out.println("Informe a quantidade de produtos a serem consultados em cada supermercado: ");
        qtdproduto = key.nextInt();

        for (int i = 0; i < qtdproduto; i++) {
        }

    }
}