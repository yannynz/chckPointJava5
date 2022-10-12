package chckPointJava.ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int numUsr, aux;
        String finalNum = "";
        System.out.print("Informe um número interio e positivo para transforma-lo em binário: ");
        numUsr = key.nextInt();
        if (numUsr < 0) {
            System.out.print("Número invalido, favor reiniciar o programa e inserir um número válido ");
        } else {
            aux=numUsr;
            while (aux > 0) {
            finalNum = aux%2+finalNum;
            aux/=2;
            }
            System.out.print(finalNum);
        }
    }
}
