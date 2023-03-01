package EstruturasRepeticao;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int divisivel = scanner.nextInt();

        for (int i = 1; i < divisivel; i++){
            if (divisivel % i == 0){
                System.out.println(i);
            }
        }
    }
}
