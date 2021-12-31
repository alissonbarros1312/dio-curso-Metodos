package exercicios;

public class sobrecarga {
    public static void main(String[] args) {
        area(3);
        area(5d, 5d);
        area(7, 8, 9);
        area(5f, 5f);

    }
    public static void area(double lado){
        System.out.println("Lado : " + lado);
        System.out.println("A área do quadrado é: " + (lado * lado));
        System.out.println("-----------------");
    }
    public static void area(double lado1, double lado2){
        System.out.println("Lado 1 : " + lado1 + "\nlado 2 : " + lado2);
        System.out.println("A área do retangulo é: " + (lado1 * lado2));
        System.out.println("-----------------");
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Base Maior: " + baseMaior + "\nBase Menor: " + baseMenor + "\nAltura: " + altura);
        System.out.println("A área do trapézio é: " + (((baseMaior + baseMenor) * altura) / 2));
        System.out.println("-----------------");
    }
    public static void area(float d1, float d2){
        System.out.println("Diagonal 1: " + d1 + "\nDiagonal 2: " + d2);
        System.out.println("A área do losango é: " + d1 * d2 /2);
        System.out.println("-----------------");
    }

}
