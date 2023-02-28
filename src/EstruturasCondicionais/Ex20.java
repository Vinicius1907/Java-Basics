package EstruturasCondicionais;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a + b > c && a + c > b && b + c > a){
            if(a == b && b == c){
                System.out.println("Isto é um triangulo equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isto é um triangulo isósceles");
            } else {
                System.out.println("Isto é um triangulo escaleno");
            }


        } else {
            System.out.println("Isto não é um triangulo");
        }   
    }
}
