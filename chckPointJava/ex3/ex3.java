package chckPointJava.ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int qtdTri;
        int ladoTri, ladoTri1, ladoTri2;
        System.out.print("Informe a quantidade de triângulos: ");
        qtdTri = key.nextInt();
        for (int i = 0; i < qtdTri; i++) {
            System.out.println("Triângulo " + (i + 1));
            System.out.print("Informe o valor do lado 1: ");
            ladoTri = key.nextInt();
            System.out.print("Informe o valor do lado 2: ");
            ladoTri1 = key.nextInt();
            System.out.print("Informe o valor do lado 3: ");
            ladoTri2 = key.nextInt();
            if (ladoTri < ladoTri1 + ladoTri && ladoTri1 < ladoTri + ladoTri2 && ladoTri2 < ladoTri1 + ladoTri) {
                if (ladoTri == ladoTri1 && ladoTri1 == ladoTri2) {
                    System.out.println("Triângulo equilátero \n");
                }else if (ladoTri == ladoTri1 || ladoTri1 == ladoTri2 || ladoTri2 == ladoTri1) {
                    System.out.println("Triângulo isóceles \n");
                }else {
                    System.out.println("Triângulo escaleno \n");
                }
                } else {
                System.out.println(
                        "Valores informados são invalidos, reinicie a aplicação e insira os valores corretamente");
                        break;
            }
        }

    }
}
