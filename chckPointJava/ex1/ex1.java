import java.util.Scanner;

public class ex1 {
    public static void ex1(String[] args) {

        Scanner key = new Scanner(System.in);

        int qtdmkt, qtdproduto=0;
        System.out.print("Informe a quantidade de mercados a serem pesquisados: ");
        qtdmkt = key.nextInt();
        
        for (int i = 0; i < qtdmkt; i++) {
            System.out.println("Informe a quantidade de produtos a serem consultados em cada merdado: ");
            qtdproduto = key.nextInt();
        }
    
    }
}