//import xerial.sqlite.jdbc;
import java.io.IOException;
import java.util.Scanner;

public class ext1012 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double A = entrada.nextDouble();
        Double B = entrada.nextDouble();
        Double C = entrada.nextDouble();
        Double triangulo = A * C / 2.0;
        Double circulo = 3.14159 * C * C;
        Double trapezio = (A + B) * C / 2.0;
        Double quadrado = B * B;
        Double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n" , triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZEIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);




    }
}

