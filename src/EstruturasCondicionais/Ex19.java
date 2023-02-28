package EstruturasCondicionais;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        if(valor % 3 == 0 || valor % 5 != 0){
            System.out.println("É divisivel por 3 e não por 5");
    } else {
            System.out.println("É divisivel por 5 e não por 3");
        }
}
}
