package EstruturasCondicionais;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if( ( a > b && a > c ) && ( b > c ) ) { //  x > y > z
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        else if( ( a > b && a > c ) && ( c > b ) ) { // x > z > y
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
        else if( ( b > a && b > c ) && ( a > c ) ) {//b > a > c
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        else if( ( b > a && b > c ) && ( c > a ) ) { // y > z > x
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }
        else if( ( c > a && c > b ) && ( a > b ) ) { // z > x > y
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        else if( ( c > a && c > b ) && ( b > a ) ) { // z > y > x
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }
}
