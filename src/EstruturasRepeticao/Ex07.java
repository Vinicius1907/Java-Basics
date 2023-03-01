package EstruturasRepeticao;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int indexFora = 0;
        double media;

        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o valor: " + i);
            double valor = scanner.nextInt();
                if(valor > 0){
                    soma += valor;
                    indexFora++;
                }
        }

        media = soma / indexFora;
        System.out.println("A media dos valores positivos digitados é: " + media + "   " + indexFora);



    }
}
