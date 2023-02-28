package EstruturasCondicionais;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(n % 2 == 0){
            System.out.println("O numero " + n + " é par");
        } else {
            System.out.println("O numero " + n + " é impar");
        }
    }
}
