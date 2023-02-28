package EstruturasCondicionais;

import java.util.Scanner;

public class Ex34 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double nota = scanner.nextDouble();
        int numeroFaltas = scanner.nextInt();

        if(nota <= 3.9){
            if(numeroFaltas <= 20){
                System.out.println("Conceito E");
            } else{
                System.out.println("Conceito E");
            }
        } else if (nota <= 4.9) {
            if(numeroFaltas <= 20){
                System.out.println("Conceito D");
            } else{
                System.out.println("Conceito E");
            }
        } else if (nota <= 7.4) {
            if(numeroFaltas <= 20){
                System.out.println("Conceito C");
            } else {
                System.out.println("Conceito D");
            }
        } else if (nota <= 8.9) {
            if(numeroFaltas <= 20){
                System.out.println("Conceito B");
            } else{
                System.out.println("Conceito C");
            }
        } else if (nota <= 10) {
            if(numeroFaltas <= 20){
                System.out.println("Conceito A");
            } else{
                System.out.println("Conceito B");
            }
        } else{
            System.out.println("Nota inválida");
        }
    }
}
