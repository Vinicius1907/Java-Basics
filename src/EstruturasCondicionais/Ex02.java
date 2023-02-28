package EstruturasCondicionais;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(n > 0){
            int nFinal = n * n;
            System.out.println("O quadrado de "+ n + " é igual a: " + nFinal);
        } else {
            System.out.println("Numero Invalido");
        }
    }

}
