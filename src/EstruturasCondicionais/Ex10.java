package EstruturasCondicionais;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double altura = scanner.nextDouble();
        String sexo = scanner.next();

        if(sexo.contentEquals("m")){
            double pesoIdeal = ((72.7 * altura) - 58);
            System.out.println("Sendo homem, seu peso ideal é de: " + pesoIdeal);
        } else if(sexo.contentEquals("f")){
            double pesoIdeal = ((62.1 * altura) - 44.7);
            System.out.println("Sendo mulher, seu peso ideal é de: " + pesoIdeal);
        } else{
            System.out.println("Sexo inválido. Por favor, digite (m para masculino ou f para feminino)");
        }
    }
}
