package EstruturasCondicionais;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if(n1 > n2){
            System.out.println("n1 é maior que n2");
        } else if(n1 < n2){
            System.out.println("n2 é maior que n1");
        } else {
            System.out.println("numeros iguais");
        }

    }
}
