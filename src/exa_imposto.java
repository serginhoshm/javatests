import java.math.BigDecimal;
import java.util.Scanner;

public class exa_imposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        double imposto=0;

        if (valor >= 0.00 && valor <= 2000.00) {
            System.out.println("Isento");
        }
        else {
            if (valor > 2000.00 && valor <= 3000.00) {
                imposto = ((0.08 * (valor - 2000.00)));
            } else if (valor > 3000.00 && valor <= 4500.00) {
                imposto = 80 + ((valor - 3000.00) * 0.18);
            } else {
                imposto = ((valor - 4500.00) * 0.28) + 350;
            }
            System.out.printf("R$ %.2f", imposto);
        }

    }
}

