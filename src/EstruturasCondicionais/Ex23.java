package EstruturasCondicionais;

import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int ano = scanner.nextInt();

        if(ano % 4 == 0 & ano % 100 != 0){
            System.out.println("O ano " + ano + " é bissexto.");
        } else{
            System.out.println("O ano " + ano + " não bissexto.");
        }
    }
}
