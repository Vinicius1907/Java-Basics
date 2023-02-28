package EstruturasCondicionais;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();
        int nota3 = scanner.nextInt();

        if(nota1 > 0 && nota1 <= 10 && nota2 > 0 && nota2 <= 10 && nota3 > 0 && nota3 <= 10){
            int mediaPonderada = (((nota1 * 1) + (nota2 * 1) + (nota3 * 2))/ (1 + 1 + 2));

            System.out.println("A media ponderada foi de: " + mediaPonderada);
        }
    }
}
