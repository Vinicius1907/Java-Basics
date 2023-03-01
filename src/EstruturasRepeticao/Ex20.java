package EstruturasRepeticao;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int nDigitados = 1;
        int par = 0;
        int valor = 0;

        while(valor != 1000) {
            System.out.println("Digite o valor " + nDigitados);
            valor = scanner.nextInt();
            if (valor % 2 == 0 && valor != 1000) {
                par++;
            }
            nDigitados++;
        }

        System.out.println("O numero de entradas foi de: " + nDigitados + " | O numero de entradas com valores pares foi de: " + par);
    }
}
