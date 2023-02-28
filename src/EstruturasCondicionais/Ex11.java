package EstruturasCondicionais;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if(numero > 0) {
            int centena = numero / 100;
            int dezena = (numero % 100) / 10;
            int unidade = (numero % 100) % 10;

            int soma = centena + dezena + unidade;

            System.out.println("A soma dos algarismos do numero: " + numero + " é de: "  + soma);
        } else{
            System.out.println("Numero Inválido");
        }
    }
}
