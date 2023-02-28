package EstruturasCondicionais;

import java.util.Scanner;

public class Ex35 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int ano = scanner.nextInt();
        boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0);

        if(mes >= 1 && mes <=12){
            if (mes == 2 && anoBissexto && dia <= 29){
                System.out.println("Data valida");
            } else if (mes == 2 && !anoBissexto && dia <= 28){
                System.out.println("Data valida");
            } else if (mes != 2 && dia <= 30) {
                System.out.println("Data valida");
            } else {
                System.out.println("Data invalida");
            }
        }
    }
}
