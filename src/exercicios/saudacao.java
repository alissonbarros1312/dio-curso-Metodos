package exercicios;

import java.util.*;

public class saudacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora atual com dois digitos: ");
        int hora = sc.nextInt();
        saudacao(hora);

        sc.close();
    }
    public static int saudacao(int a){
        if (a >= 00 ) {
            if (a >= 12){
                if (a >= 18){
                    System.out.println("Good afternoon!");
                } else {
                    System.out.println("Buenas Tarde!");
                }
            } else if (a >= 6){
                System.out.println("Bom Dia!");
            } else {
                System.out.println("Boa madrugada!");
            }
        }
        return a;
    }
}
