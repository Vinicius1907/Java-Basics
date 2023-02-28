package EstruturasCondicionais;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double kmRodado = scanner.nextDouble();
        double qtLitros = scanner.nextDouble();
        double consumo = kmRodado / qtLitros;


        if(consumo < 8){
            System.out.println("O consumo foi de: " + consumo + "KM/l. " + "Venda o carro!");
        } else if(consumo >= 8 && consumo <= 14){
            System.out.println("O consumo foi de: " + consumo + "KM/l. " + "Economico!");
        } else {
            System.out.println("O consumo foi de: " + consumo + "KM/l. " + "Super Economico!");
        }
    }
}
