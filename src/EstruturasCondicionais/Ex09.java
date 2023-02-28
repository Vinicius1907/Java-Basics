package EstruturasCondicionais;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double valorPrestacao = scanner.nextDouble();

        if(valorPrestacao <= (salario * 20) / 100){
            System.out.println("Empréstimo concedido");
        } else{
            System.out.println("Empréstimo não concedido");
        }
    }
}
