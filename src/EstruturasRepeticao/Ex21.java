package EstruturasRepeticao;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int menorValor = scanner.nextInt();
        int maiorValor = scanner.nextInt();
        int soma = 0;
        int multiplicacao = 1;

        for (int i = menorValor; i <= maiorValor; i++){
            if(i % 2 == 0){
                soma += i;
                System.out.println(i + " | par " + soma);
            }

            if(i % 2 != 0){
                multiplicacao = multiplicacao * i;
                System.out.println(i + " | impar " + multiplicacao);
            }
        }
    }
}
