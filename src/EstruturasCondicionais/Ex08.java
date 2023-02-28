package EstruturasCondicionais;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextInt();
        double nota2 = scanner.nextInt();

        if(nota1 > 0 && nota1 <= 10 && nota2 > 0 && nota2 <= 10){
            System.out.println("A nota 1 foi: " + nota1 + " e a nota 2 foi de: " + nota2 + ". A média das notas foi de: " + ((nota1 + nota2)/2));
        } else{
            System.out.println("Alguma das notas foi inválida.");
        }
    }
}
