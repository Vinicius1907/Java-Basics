package EstruturasCondicionais;

import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a operação desejada. 1 - Geometrica | 2 - Ponderada | 3 - Harmonica | 4 - Aritmetica");
        int operacao = scanner.nextInt();

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        if(operacao == 1){
            double resultado = Math.cbrt(a * b * c);
            System.out.println("A media geometrica dos valores é de: " + resultado);
        } else if (operacao == 2) {
            double resultado =  (((a * 1) + (b * 2) + (c * 3)) / (1 + 2 + 3));;
            System.out.println("A media ponderada dos valores é de: " + resultado);
        } else if (operacao == 3){
            double resultado = 3 / (1/a + 1/b + 1/c);
            System.out.println("A media harmonica dos valores é de: " + resultado);
        } else if (operacao == 4) {
            double resultado = ((a + b + c)/3);
            System.out.println("A media aritmetica dos valores é de: " + resultado);
        }
    }
}
