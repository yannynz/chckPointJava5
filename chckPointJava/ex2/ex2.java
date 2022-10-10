package chckPointJava.ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int numUsr =0;

        System.out.print("Informe um número interio e positivo");
        numUsr = key.nextInt();

        if (numUsr <= -1) {
            System.out.print("Número invalido, favor reiniciar o programa e inserir um número válido ");
            
        }

    }
}
