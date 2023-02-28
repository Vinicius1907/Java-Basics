package EstruturasCondicionais;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double altura = scanner.nextDouble();
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Saudavel");
        } else if (imc <= 29.9) {
            System.out.println("Peso em excesso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }
    }
}
