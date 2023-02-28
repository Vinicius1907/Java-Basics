package EstruturasCondicionais;

import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Equação do 2o grau: ax² + bx + cx = 0");

        System.out.print("Entre com o valor de a: ");
        float a = scanner.nextFloat();

        System.out.print("Entre com o valor de b: ");
        float b = scanner.nextFloat();

        System.out.print("Entre com o valor de c: ");
        float c = scanner.nextFloat();

        float delta = (b * b) - (4 * a * c);
        float sqrtDelta = (float)Math.sqrt(delta);

        if(a != 0){
            if(delta >= 0){
                float raiz1 = ((-1)*b + sqrtDelta)/(2*a);
                float raiz2 = ((-1)*b - sqrtDelta)/(2*a);
                System.out.printf("Raízes: %.2f e %.2f", raiz1, raiz2);
            } else{
                delta = -delta;
                sqrtDelta = (float)Math.sqrt(delta);
                System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b)/(2*a), (sqrtDelta)/(2*a));
                System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b)/(2*a), (sqrtDelta)/(2*a));
            }
        }else{
            System.out.println("Coeficiente 'a' inválido. Não é uma equação do 2o grau");
        }
    }
}
