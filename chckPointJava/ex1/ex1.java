package chckPointJava.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int mkt, product;
        double finalPrice, priceQtd;
        System.out.print("Informe a quantidade de supermercados a serem pesquisados: ");
        mkt = key.nextInt();
        System.out.print("Informe a quantidade de produtos a serem pesquisados nos supermercados: ");
        product = key.nextInt();
        int qtdProduct[] = new int[product];
        double mktTable[][] = new double[product][mkt];
        for (int i = 0; i < mktTable.length; i++) {
            System.out.println("Informe a quantidade do produto " + (i + 1)
            + "( a quantidade deve ser infomada sem qualquer unidade de medida antes ou após o número)");
            qtdProduct[i] = key.nextInt();
        }for (int i = 0; i < mktTable.length; i++) {
            System.out.print("Supermercado " + (i + 1));
            finalPrice = 0;
            for (int j = 0; j < mktTable.length; j++) {
                System.out.println(" | Informe o preço R$ unitário do produto " + (j + 1));
                mktTable[i][j] = key.nextDouble();
                priceQtd = mktTable[i][j] * qtdProduct[i];
                System.out.println("O preço total do produto " + (j + 1) + " em reais R$ é de:" + priceQtd);
                finalPrice += priceQtd;
                priceQtd = 0;
            }
            System.out.println("O total a ser pago no Supermercado " + (i + 1) + " é de: R$ " + finalPrice);
        }

    }
}