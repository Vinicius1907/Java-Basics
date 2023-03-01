package EstruturasRepeticao;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        if(valor >= 0 && valor % 2 == 0){
            for (int i = valor; i >= 0; i--){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        } else{
            System.out.println("Digite um numero par e positivo!");
        }
    }
}
