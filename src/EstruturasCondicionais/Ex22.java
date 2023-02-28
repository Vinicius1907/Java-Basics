package EstruturasCondicionais;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        int tempoServico = scanner.nextInt();

        if(idade >= 65 || tempoServico >= 30){
            System.out.println("Pode se aposentar");
        }else if(idade >= 60 && tempoServico > 25){
            System.out.println("Pode se aposentar");
        } else {
            System.out.println("Não pode se aposentar ainda");
        }

    }
}
