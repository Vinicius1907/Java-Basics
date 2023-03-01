package EstruturasRepeticao;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de entradas a ser digitadas: ");
        int valorEntradas = scanner.nextInt();
        int numeros;
        int maiorNumero = Integer.MIN_VALUE;
        int nRepeticoes = 0;

        for (int i = 1; i <= valorEntradas; i++){
            System.out.println("Entrada " + i);
            numeros = scanner.nextInt();
            if (numeros > maiorNumero){
                maiorNumero = numeros;
            }else if(numeros == maiorNumero){
                nRepeticoes++;
            }
        }

        System.out.println("O maior numero digitado foi: " + maiorNumero + " | " + "Este numero apareceu " + nRepeticoes + " vezes.");
    }
}
