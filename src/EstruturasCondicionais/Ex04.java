package EstruturasCondicionais;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextInt();

        if(n > 0){
            double nRaiz = Math.sqrt(n);
            System.out.println(nRaiz);

            double nQuadrado = n * n;
            System.out.println(nQuadrado);
        } else{
            System.out.println("Não é positivo");
        }


    }
}
