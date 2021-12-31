package exercicios;

import java.util.Scanner;

public class emprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorEmpres;
        int parcelas;

        System.out.println("--- PROGRAMA DE CALCULO DE JUROS ---");
        System.out.println("----- TABELA DE JUROS -----");
        System.out.printf("%s%5s%s%s%4s%s%s%3s%s","2 a 8 parcelas",":", "1.5% ao mês\n", "9 a 18 parcelas",":","2.0% ao mês\n", "18 a 36 parcelas", ":", "2.5% ao mês \n");
        System.out.print("\nDigite o valor do empréstimo: ");
        valorEmpres = sc.nextDouble();
        System.out.print("Digite a quantidade de parcelas: ");
        parcelas = sc.nextInt();
        System.out.println("------------------");
        juros(valorEmpres, parcelas);

    }
    public static double juros (double v, int p){
        double valorPar;
        if (p > 18 && p <= 36){
            System.out.printf("%-10s%6s%.2f\n%.22s%8s%d", "VALOR EMPRESTADO",":", v, "N° DE PARCELAS",":", p);
            v = ((v * 2.5d / 100) * p) + v;
            valorPar = v / p;
            System.out.printf("%s%4s%.2f", "\nVALOR DAS PARCELAS", ":", valorPar);
            System.out.printf("%s%11s%.2f", "\nVALOR FINAL", ":", v);
        } else if (p > 8){
            System.out.printf("%-10s%6s%.2f\n%.22s%8s%d", "VALOR EMPRESTADO",":", v, "N° DE PARCELAS",":", p);
            v = ((v * 2.0d / 100) * p) + v;
            valorPar = v / p;
            System.out.printf("%s%4s%.2f", "\nVALOR DAS PARCELAS", ":", valorPar);
            System.out.printf("%s%11s%.2f", "\nVALOR FINAL", ":", v);
        } else if (p >= 2){
            System.out.printf("%-10s%6s%.2f\n%.22s%8s%d", "VALOR EMPRESTADO",":", v, "N° DE PARCELAS",":", p);
            v = ((v * 1.5d / 100) * p) + v;
            valorPar = v / p;
            System.out.printf("%s%4s%.2f", "\nVALOR DAS PARCELAS", ":", valorPar);
            System.out.printf("%s%11s%.2f", "\nVALOR FINAL", ":", v);
        } else {
            System.out.println("Valor inválido!");
        }
        return v;
    }
}
