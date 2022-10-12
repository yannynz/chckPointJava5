package chckPointJava.ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int qtdTri;

        System.out.print("Informe a quantidade de triângulos: ");
        qtdTri = key.nextInt();

        int ladoTri[][] = new int[qtdTri][3];

        for (int i = 0; i < qtdTri; i++) {
            for (int j = 0; j < ladoTri.length; j++) {
                System.out.print("Informe o valor de cada lado do triangulo " + (j + 1) + ": ");
                ladoTri[i][j] = key.nextInt();
                if (ladoTri[i][j] < ladoTri[i][j+1] + ladoTri[i][j+2] && ladoTri[i][j+1] < ladoTri[i][j] + ladoTri[i][j+2] && ladoTri[i][j+2] < ladoTri[i][j] + ladoTri[i][j+1]) {
                    if (ladoTri[i][j] == ladoTri[i][j + 1] && ladoTri[i][j+1] == ladoTri[i][j + 2]) {
                        System.out.println("O triangulo " + (i + 1) + " é equilátero");
                    }if (ladoTri[i][j] == ladoTri[i][j+1] || ladoTri[i][j] == ladoTri[i][j+2] || ladoTri[i][j+1] == ladoTri[i][j+2]) {
                        System.out.println("O triangulo " + (i + 1) + "  é isósceles");
                    }else{ System.out.println("O triangulo " + (i + 1) + " é escaleno");}
                    
                }
            }
        }
        
    //   for (int i = 0; i < qtdTri; i++) {
    //         for (int j = 0; j < ladoTri.length; j++) {
    //             }
    //         }
        }
    }

