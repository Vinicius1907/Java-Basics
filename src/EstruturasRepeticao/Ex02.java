package EstruturasRepeticao;

public class Ex02{
    public static void main(String[] args){

        for(int i = 1; i <= 100; i++){
            System.out.println("for: " + i);
        }

        int i = 1;

        while (i <= 100){
            System.out.println("while: " + i);
            i++;
        }

        int a = 1;

        do{
            System.out.println("do while: " + a);
            a++;
        } while (a <= 100);
    }
}
