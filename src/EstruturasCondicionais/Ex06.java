package EstruturasCondicionais;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if(n1 > n2){
            System.out.println("n1 é o maior e a diferença entre eles é de: " + (n1 - n2));
        } else {
            System.out.println("n2 é o maior e a diferença entre eles é de: " + (n2 - n1));
        }
    }
}
