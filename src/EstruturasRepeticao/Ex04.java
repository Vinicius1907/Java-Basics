package EstruturasRepeticao;

public class Ex04 {
    public static void main(String[] args){

        int contagem = 0;

        for(int i = 0; contagem < 100000; i++){
            contagem += 1000;
            System.out.println(contagem);
        }
    }
}
