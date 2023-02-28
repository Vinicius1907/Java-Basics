package EstruturasCondicionais;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int baseMaior = scanner.nextInt();
        int baseMenor = scanner.nextInt();
        int altura = scanner.nextInt();

        int areaTriangulo = (((baseMaior + baseMenor) * altura) / 2);

        if(baseMaior > 0 && baseMenor > 0){
            System.out.println("A area do triangulo é de: " + areaTriangulo);
        } else{
            System.out.println("Todas as bases devem ser maiores do que zero");
        }
    }
}
