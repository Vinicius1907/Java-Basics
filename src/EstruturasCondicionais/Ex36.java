package EstruturasCondicionais;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor da venda?");
        double valorVenda = scanner.nextDouble();

        if (valorVenda < 20000) {
            double comissao = 400 + ((valorVenda * 14) / 100);
            System.out.println("A venda foi de " + valorVenda + " e por isso a comissão é de" + comissao);
        } else if (valorVenda >= 20000 && valorVenda < 40000) {
            double comissao = 500 + ((valorVenda * 14) / 100);
            System.out.println("A venda foi de " + valorVenda + " e por isso a comissão é de" + comissao);
        } else if (valorVenda >= 40000 && valorVenda < 60000) {
            double comissao = 550 + ((valorVenda * 14) / 100);
            System.out.println("A venda foi de " + valorVenda + " e por isso a comissão é de" + comissao);
        } else if (valorVenda >= 60000 && valorVenda < 80000) {
            double comissao = 600 + ((valorVenda * 14) / 100);
            System.out.println("A venda foi de " + valorVenda + " e por isso a comissão é de" + comissao);
        } else if (valorVenda >= 80000 && valorVenda < 100000) {
            double comissao = 650 + ((valorVenda * 14) / 100);
            System.out.println("A venda foi de " + valorVenda + " e por isso a comissão é de" + comissao);
        } else {
            double comissao = 700 + ((valorVenda * 16) / 100);
            System.out.println("A venda foi de " + valorVenda + " e por isso a comissão é de" + comissao);
        }
    }
}
