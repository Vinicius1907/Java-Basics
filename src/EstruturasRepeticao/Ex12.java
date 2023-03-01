package EstruturasRepeticao;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        if(valor >= 0){
            for (int i = valor; i >= 0; i--){
                System.out.println(i);
            }
        }
    }
}
