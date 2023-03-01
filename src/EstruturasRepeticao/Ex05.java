package EstruturasRepeticao;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o valor " + i);
            int valor = scanner.nextInt();
            soma += valor;
        }

        System.out.println("A soma final foi: " + soma);
    }
}
