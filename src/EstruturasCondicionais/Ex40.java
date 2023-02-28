package EstruturasCondicionais;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double custoFabrica = scanner.nextDouble();
        double custoFinal;

        if(custoFabrica <= 12000){
            custoFinal = custoFabrica + ((custoFabrica * 5)/100);
            System.out.println("O custo de fabrica pra este carro é de: " + custoFabrica +"R$ e o custo final de: " + custoFinal + "R$");
        } else if (custoFabrica <= 25000) {
            double comissao = ((custoFabrica * 10)/100);
            double imposto = ((custoFabrica * 15)/100);
            custoFinal = custoFabrica + comissao + imposto;
            System.out.println("O custo de fabrica pra este carro é de: " + custoFabrica +"R$ e o custo final de: " + custoFinal + "R$");
        } else{
            double comissao = custoFabrica + ((custoFabrica * 15)/100);
            double imposto = custoFabrica + ((custoFabrica * 20)/100);
            custoFinal = custoFabrica + comissao + imposto;
            System.out.println("O custo de fabrica pra este carro é de: " + custoFabrica +"R$ e o custo final de: " + custoFinal + "R$");
        }
    }
}
