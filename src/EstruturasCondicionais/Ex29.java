package EstruturasCondicionais;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int acertos = 0;
        int comando;
        int perguntas = 0;

        if(perguntas == 0){
            int a =  (int)Math.floor(Math.random() * 100);
            int b =  (int)Math.floor(Math.random() * 100);
            int resultado = a + b;

            System.out.println("Qual a soma de " + a + " + " + b + " ?");
            comando = scanner.nextInt();

            if(comando == resultado){
                perguntas++;
                acertos++;
            } else{
                perguntas++;
            }
        }

        if(perguntas == 1){
            int a =  (int)Math.floor(Math.random() * 100);
            int b =  (int)Math.floor(Math.random() * 100);
            int resultado = a + b;

            System.out.println("Qual a soma de " + a + " + " + b + " ?");
            comando = scanner.nextInt();

            if(comando == resultado){
                perguntas++;
                acertos++;
            } else{
                perguntas++;
            }
        }

        if(perguntas == 2){
            int a =  (int)Math.floor(Math.random() * 100);
            int b =  (int)Math.floor(Math.random() * 100);
            int resultado = a + b;

            System.out.println("Qual a soma de " + a + " + " + b + " ?");
            comando = scanner.nextInt();

            if(comando == resultado){
                perguntas++;
                acertos++;
            } else{
                perguntas++;
            }
        }

        if(perguntas == 3){
            int a =  (int)Math.floor(Math.random() * 100);
            int b =  (int)Math.floor(Math.random() * 100);
            int resultado = a + b;

            System.out.println("Qual a soma de " + a + " + " + b + " ?");
            comando = scanner.nextInt();

            if(comando == resultado){
                perguntas++;
                acertos++;
            } else{
                perguntas++;
            }
        }

        if(perguntas == 4){
            int a =  (int)Math.floor(Math.random() * 100);
            int b =  (int)Math.floor(Math.random() * 100);
            int resultado = a + b;

            System.out.println("Qual a soma de " + a + " + " + b + " ?");
            comando = scanner.nextInt();

            if(comando == resultado){
                perguntas++;
                acertos++;
            } else{
                perguntas++;
            }
        }

        System.out.println("De " + perguntas + " perguntas, você acertou " + acertos);

    }
}
