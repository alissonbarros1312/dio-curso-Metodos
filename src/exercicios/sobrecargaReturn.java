package exercicios;

public class sobrecargaReturn {
    public static void main(String[] args) {
        System.out.println("Area do quadrado: " + area(5));
        System.out.println("Area do retangulo: " + area(5d, 5d));
        System.out.println("Area do trapézio: " + area(7, 8, 9));
        System.out.println("Area do losango: " + area(5f, 5f));
    }
    public static double area(double lado){
        return lado * lado;
    }
    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }
    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura) / 2;
    }
     public static double area(float diagonal1, float diagonal2){
        return (diagonal1 * diagonal2) / 2;
    }


}
