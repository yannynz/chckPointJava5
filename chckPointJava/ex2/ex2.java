package chckPointJava.ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int numUsr = 0 ;
        System.out.print("Informe um número interio e positivo: ");
        numUsr = key.nextInt();
        for (int i = 0; i < 1; i++) {
            if (numUsr < 0) {
                System.out.print("Número invalido, favor reiniciar o programa e inserir um número válido ");
                break; 
            }
        }
        
        while (numUsr>0) {
            numUsr=numUsr/2;
            System.out.print("O número informado, em binário fica: "+numUsr%2);
        }
              
        

    }
}
