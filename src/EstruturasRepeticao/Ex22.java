package EstruturasRepeticao;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int incremento = 1;
        int soma = 0;
        double media;
        int valor;

        do {
            System.out.println("Digite o valor " + incremento);
            valor = scanner.nextInt();
                soma += valor;
                incremento++;
                media = soma/incremento;
        } while (valor >= 10 && valor <= 20);


        System.out.println("A média dos " + (incremento - 1) + " valores digitados foi de: " + media);

        System.out.println("Fim do programa!");
    }
}
