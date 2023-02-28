package EstruturasCondicionais;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão");
        int operacao = scanner.nextInt();

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if(operacao == 1){
            System.out.println("A soma é: " + (n1 + n2));
        } else if (operacao == 2) {
            System.out.println("A subtração é: " + (n1 - n2));
        } else if (operacao == 3) {
            System.out.println("A multiplicação é: " + (n1 * n2));
        } else if(operacao == 4){
            System.out.println("A divisão é: " + (n1 / n2));
        } else {
            System.out.println("Escolha uma operação válida.");
        }

    }
}
