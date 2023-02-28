package EstruturasCondicionais;

import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextInt();
        String estado = scanner.next();

        switch (estado) {
            case "MG" -> {
                double valorFinal = (valor * 7 / 100) + valor;
                System.out.println("O valor do produto em Minas Gerais é de: " + valorFinal + "R$");
            }
            case "SP" -> {
                double valorFinal = (valor * 12 / 100) + valor;
                System.out.println("O valor do produto em São Paulo é de: " + valorFinal + "R$");
            }
            case "RJ" -> {
                double valorFinal = (valor * 15 / 100) + valor;
                System.out.println("O valor do produto no Rio de Janeiro é de: " + valorFinal + "R$");
            }
            case "MS" -> {
                double valorFinal = (valor * 8 / 100) + valor;
                System.out.println("O valor do produto em Mato Grosso é de: " + valorFinal + "R$");
            }
            default -> System.out.println("Estado digitado não é válido");
        }
    }
}
