package exercicios;

import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a, b, result;

            System.out.print("Digite um numero: ");
            a = sc.nextInt();
            System.out.print("Digite um numero: ");
            b = sc.nextInt();

            result = soma(a, b);
            System.out.println("A soma é igual: " + result);
            result = subtracao(a, b);
            System.out.println("A subtração é igual: " + result);
            result = multiplicacao(a, b);
            System.out.println("A multiplicação é igual: " + result);
            result = divisao(a, b);
            System.out.println("A divisão é igual: " + result);

        }

        public static int soma (int n1, int n2){
            return n1 + n2;
        }

        public static int subtracao (int n1, int n2){
            return n1 - n2;
        }

        public static int multiplicacao (int n1, int n2){
            return n1 * n2;
        }

        public static int divisao (int n1, int n2){
            return n1 / n2;
        }
    }

