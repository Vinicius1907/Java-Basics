package EstruturasRepeticao;

public class Ex10 {
    public static void main(String[] args){

        int soma = 0;

        for(int i = 1; i <= 50; i++){
            if(i % 2 == 0){
                soma += i;
                System.out.println(i + " | " + soma);
            }
        }
        System.out.println("A soma dos 50 primeiros numeros pares é de: " + soma);
    }
}
