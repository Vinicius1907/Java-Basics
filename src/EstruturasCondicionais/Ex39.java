package EstruturasCondicionais;

import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double salarioAtual = scanner.nextDouble();
        int tempoServico = scanner.nextInt();
        double salarioNovo;
        double salarioFinal;
        double bonus;

        if(salarioAtual <= 500){
            salarioNovo = salarioAtual + ((salarioAtual * 25) / 100);
        } else if(salarioAtual <= 1000){
            salarioNovo = salarioAtual + ((salarioAtual * 20) / 100);
        } else if (salarioAtual <= 1500){
            salarioNovo = salarioAtual + ((salarioAtual * 15) / 100);
        } else if (salarioAtual <= 2000){
            salarioNovo = salarioAtual + ((salarioAtual * 10) / 100);
        }else{
            salarioNovo = salarioAtual;
        }

        if(tempoServico <= 1){
            bonus = 0;
        } else if(tempoServico <= 3){
            bonus = 100;
        } else if(tempoServico <= 6){
            bonus = 200;
        } else if(tempoServico <= 10){
            bonus = 300;
        } else{
            bonus = 500;
        }

        salarioFinal = salarioNovo + bonus;
        System.out.println("O salario reajustado foi de: " + salarioAtual + "R$ para " + salarioFinal + "R$");
    }


}
