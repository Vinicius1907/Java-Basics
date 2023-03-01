package EstruturasRepeticao;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o valor: " + i);
            double valor = scanner.nextInt();
            soma += valor;
        }

        double media = soma / 10;
        System.out.println("A media dos valores é: " + media);
    }
}
