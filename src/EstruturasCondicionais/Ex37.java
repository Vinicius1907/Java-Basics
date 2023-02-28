package EstruturasCondicionais;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a hora e minuto de entrada: ");
        double minutoEntrada = scanner.nextDouble();
        double horaEntrada = scanner.nextDouble();

        System.out.println("Informe a hora e minuto de saida: ");
        double minutoSaida = scanner.nextDouble();
        double horaSaida = scanner.nextDouble();

        double horaFinal = (horaEntrada > horaSaida) ? (horaSaida + 24) - horaEntrada : horaSaida - horaEntrada;
        double minutoFinal = (minutoEntrada > minutoSaida) ? (minutoSaida + 60) - minutoEntrada : minutoSaida - minutoEntrada;

        System.out.println("A permanencia no estacionamento foi de: " + (int) horaFinal + " horas e " + (int) minutoFinal + " minutos. ");

        double tempoMinutos = horaFinal * 60 + minutoFinal;
        double preco;

        if(tempoMinutos >= 1 && tempoMinutos <= 60){
            preco = 1.0;
            System.out.println("O valor a ser pago é de: " + preco);
        }else if(tempoMinutos <= 120){
            preco = 2.0;
            System.out.println("O valor a ser pago é de: " + preco);
        }else if(tempoMinutos <= 180){
            preco = 4.2;
            System.out.println("O valor a ser pago é de: " + preco);
        }else if(tempoMinutos <= 240){
            preco = 5.6;
            System.out.println("O valor a ser pago é de: " + preco);
        }else if(tempoMinutos > 240){
            preco = horaFinal * 2.0;
            System.out.println("O valor a ser pago é de: " + preco);
        }else{
            System.out.println("Tempo de permanencia minimo não sera necessário pagar!");
        }
    }
}