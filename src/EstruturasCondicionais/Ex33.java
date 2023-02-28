package EstruturasCondicionais;

import java.util.Scanner;

public class Ex33 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double precoAntigo = scanner.nextDouble();

        if(precoAntigo <= 50){
            double precoNovo = precoAntigo + (precoAntigo * 5 / 100);
            System.out.println("O preco antigo era " + precoAntigo + "R$, o reajuste foi de 5% e o novo preço é de " + precoNovo + "R$.");
        } else if (precoAntigo > 50 && precoAntigo <= 100) {
            double precoNovo = precoAntigo + (precoAntigo * 10 / 100);
            System.out.println("O preco antigo era " + precoAntigo + "R$, o reajuste foi de 10% e o novo preço é de " + precoNovo + "R$.");
        } else {
            double precoNovo = precoAntigo + (precoAntigo * 15 / 100);
            System.out.println("O preco antigo era " + precoAntigo + "R$, o reajuste foi de 15% e o novo preço é de " + precoNovo + "R$.");
        }
    }
}
