package EstruturasCondicionais;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        double preco;
        String produto;
        int quantidade = scanner.nextInt();
        double precoFinal;

        switch (codigo){
            case 100:
                produto = "cachorro quente";
                preco = 1.20;
                precoFinal = preco * quantidade;
                System.out.println("O produto escolhido foi " + produto + " , a quantidade foi " + quantidade + " e o preço final foi de: " + precoFinal);
                break;
            case 101:
                produto = "bauru simples";
                preco = 1.30;
                precoFinal = preco * quantidade;
                System.out.println("O produto escolhido foi " + produto + " , a quantidade foi " + quantidade + " e o preço final foi de: " + precoFinal);
                break;
            case 102:
                produto = "bauru com ovo";
                preco = 1.50;
                precoFinal = preco * quantidade;
                System.out.println("O produto escolhido foi " + produto + " , a quantidade foi " + quantidade + " e o preço final foi de: " + precoFinal);
                break;
            case 103:
                produto = "hamburguer";
                preco = 1.20;
                precoFinal = preco * quantidade;
                System.out.println("O produto escolhido foi " + produto + " , a quantidade foi " + quantidade + " e o preço final foi de: " + precoFinal);
                break;
            case 104:
                produto = "cheeseburguer";
                preco = 1.70;
                precoFinal = preco * quantidade;
                System.out.println("O produto escolhido foi " + produto + " , a quantidade foi " + quantidade + " e o preço final foi de: " + precoFinal);
                break;
            case 105:
                produto = "suco";
                preco = 2.20;
                precoFinal = preco * quantidade;
                System.out.println("O produto escolhido foi " + produto + " , a quantidade foi " + quantidade + " e o preço final foi de: " + precoFinal);
                break;
            case 106:
                produto = "refrigerante";
                preco = 1.00;
                precoFinal = preco * quantidade;
                System.out.println("O produto escolhido foi " + produto + " , a quantidade foi " + quantidade + " e o preço final foi de: " + precoFinal);
                break;
            default:
                System.out.println("Escolha um produto válido");
        }
    }
}
