package chckPointJava.ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int qtdTri;

        System.out.print("Informe a quantidade de triângulos: ");
        qtdTri = key.nextInt();

        int ladoTri [][]=new int [qtdTri][3];

        for (int i = 0; i < qtdTri; i++) {
            for (int j = 0; j < ladoTri.length; j++) {
                System.out.print("Informe o valor de cada lado do triangulo"+(i+1)+": ");
                ladoTri[i][j]=key.nextInt();
                if (ladoTri[i][j]+ladoTri[i][j+1]<ladoTri[i][j]) {
                    System.out.print("Valores invalidos");
                    break;
                }
                }

            }
        }for (int i = 0; i < ladoTri.length; i++) {
                
        }
        
    }
}
