package EstruturasRepeticao;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o valor: " + i);
            int valor = scanner.nextInt();

            if(valor < menorValor){
                menorValor = valor;
            }

            if(valor > maiorValor){
               maiorValor = valor;
            }
        }

        System.out.println("O menor valor digitado foi: " + menorValor + "| O maior valor foi: " + maiorValor);
    }
}
