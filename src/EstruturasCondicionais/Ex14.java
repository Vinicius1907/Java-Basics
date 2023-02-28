package EstruturasCondicionais;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double TL = scanner.nextInt();
        double AS = scanner.nextInt();
        double EF = scanner.nextInt();

        if(TL > 0 && TL <= 10 && AS > 0 && AS <= 10 && EF > 0 && EF <= 10){
            double mediaPonderada = (((TL * 1) + (AS * 2) + (EF * 3)) / (1 + 2 + 3));

            if(mediaPonderada <= 2.9){
                System.out.println("A media ponderada foi de: " + mediaPonderada + ". Reprovado.");
            } else if (mediaPonderada <= 4.9) {
                System.out.println("A media ponderada foi de: " + mediaPonderada + ". Recuperação.");
            } else {
                System.out.println("A media ponderada foi de: " + mediaPonderada + ". Aprovado.");
            }

        } else {
            System.out.println("Uma ou todas as notas são invalida");
        }
    }
}
