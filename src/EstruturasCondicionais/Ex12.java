package EstruturasCondicionais;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double numero = scanner.nextInt();

        if(numero < 0){
            System.out.println("Numero Invalido");
        } else {
            double nCalculado = Math.log(numero);
            System.out.println(nCalculado);
        }
    }
}
