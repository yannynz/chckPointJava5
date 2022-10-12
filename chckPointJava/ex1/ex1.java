import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int mkt = 0, product = 0;
        double priceqtd=0;
        System.out.print("Informe a quantidade de supermercados a serem pesquisados: ");
        mkt = key.nextInt();
        System.out.print("Informe a quantidade de produtos a serem pesquisados nos supermercados: ");
        product = key.nextInt();
        int qtdProduct[] = new int[product];
        double mktTable[][] = new double[product][mkt];
        double finalPrice[]=new double[mkt];
        for (int i = 0; i < qtdProduct.length; i++) {
            System.out.println("Informe a quantidade do produto # "+(i+1)+"( a quantidade deve ser infomada sem qualquer unidade de medida antes ou após o número)");
            qtdProduct[i]=key.nextInt();
        }
        for (int i = 0; i < mkt; i++) {
            System.out.println("Supermercado #"+(i+1));
            
            for (int j = 0; j < mktTable.length; j++) {
                System.out.println("Informe o preço R$ unitário do produto #"+(j+1));
                mktTable[i][j]=key.nextDouble();
                priceqtd=mktTable[i][j]*qtdProduct[i];
                System.out.println("O preço total do produto #"+(j+1)+" em reais R$ é de:"+priceqtd);
                finalPrice[i]+=priceqtd;
                
            }
            System.out.println("O total a ser pago no Supermercado #"+(i+1)+" é de: R$ "+finalPrice[i]);
            System.out.println(" ");
        }
        for (int i = 0; i <= finalPrice.length; i++) {
            if (finalPrice[i]>finalPrice[i+1]) {
                System.out.println("No Supermercado mais barato, o valor a ser pago é de: R$ "+finalPrice[i+1]);
            }else System.out.println("No Supermercado mais barato, o valor a ser pago é de: R$ "+finalPrice[i]);
        }
        // da um erro, porem funciona kkkkk
        // favor ignora-lo
    }
}