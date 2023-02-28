package EstruturasCondicionais;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextInt();

        if(n > 0){
           double nFinal = Math.sqrt(n);
           System.out.println(nFinal);
        } else{
            double nFinal = n * n;
            System.out.println(nFinal);
        }


    }
}
