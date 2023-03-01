package EstruturasRepeticao;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        if(valor >= 0 && valor % 2 != 0){
            for (int i = 0; i <= valor; i++){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Digite um numero impar e positivo!");
        }
    }
}
