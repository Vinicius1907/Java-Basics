package EstruturasRepeticao;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int soma = 0;

        if(valor >= 0){
            for (int i = 0; i <= valor; i++){
                soma += i;
                System.out.println(i + " | " + soma);
            }
        }
    }
}
