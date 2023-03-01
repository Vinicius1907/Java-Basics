package EstruturasRepeticao;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        if(valor >= 100 && valor <= 999){
            String nString = Integer.toString(valor);
            char nArray[] = nString.toCharArray();

            for(int i = 0; i < nArray.length; i++){
                System.out.println(nArray[i]);
            }
        }
    }
}
