package EstruturasRepeticao;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int divisivel = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i < divisivel; i++){
            if(divisivel % i == 0){
                soma += i;
                System.out.println(i + " | " + soma);
            }
        }
    }
}
