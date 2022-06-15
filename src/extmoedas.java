import java.math.BigDecimal;
import java.util.Scanner;

public class extmoedas {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double valor = entrada.nextDouble();

            BigDecimal vtotal = new BigDecimal(valor);
            BigDecimal nota100 = new BigDecimal(0);
            BigDecimal nota50 = new BigDecimal(0);
            BigDecimal nota20 = new BigDecimal(0);
            BigDecimal nota10 = new BigDecimal(0);
            BigDecimal nota5 = new BigDecimal(0);
            BigDecimal nota2 = new BigDecimal(0);
            BigDecimal moe100 = new BigDecimal(0);
            BigDecimal moe050 = new BigDecimal(0);
            BigDecimal moe025 = new BigDecimal(0);
            BigDecimal moe010 = new BigDecimal(0);
            BigDecimal moe005 = new BigDecimal(0);
            BigDecimal moe001 = new BigDecimal(0);


            BigDecimal vnota100 = new BigDecimal(100);
            BigDecimal vnota50 = new BigDecimal(50);
            BigDecimal vnota20 = new BigDecimal(20);
            BigDecimal vnota10 = new BigDecimal(10);
            BigDecimal vnota5 = new BigDecimal(5);
            BigDecimal vnota2 = new BigDecimal(2);
            BigDecimal vmoe100 = new BigDecimal(1);
            BigDecimal vmoe050 = new BigDecimal(0.5);
            BigDecimal vmoe025 = new BigDecimal(0.25);
            BigDecimal vmoe010 = new BigDecimal(0.10);
            BigDecimal vmoe005 = new BigDecimal(0.05);
            BigDecimal vmoe001 = new BigDecimal(0.01);

            //Notas
            nota100 = vtotal.divideToIntegralValue(vnota100);
            vtotal = vtotal.subtract(nota100.multiply(vnota100));

            nota50 = vtotal.divideToIntegralValue(vnota50);
            vtotal = vtotal.subtract(nota50.multiply(vnota50));

            nota20 = vtotal.divideToIntegralValue(vnota20);
            vtotal = vtotal.subtract(nota20.multiply(vnota20));

            nota10 = vtotal.divideToIntegralValue(vnota10);
            vtotal = vtotal.subtract(nota10.multiply(vnota10));

            nota5 = vtotal.divideToIntegralValue(vnota5);
            vtotal = vtotal.subtract(nota5.multiply(vnota5));

            nota2 = vtotal.divideToIntegralValue(vnota2);
            vtotal = vtotal.subtract(nota2.multiply(vnota2));

            //Moedas
            moe100 = vtotal.divideToIntegralValue(vmoe100);
            vtotal = vtotal.subtract(moe100.multiply(vmoe100));

            moe050 = vtotal.divideToIntegralValue(vmoe050);
            vtotal = vtotal.subtract(moe050.multiply(vmoe050));

            moe025 = vtotal.divideToIntegralValue(vmoe025);
            vtotal = vtotal.subtract(moe025.multiply(vmoe025));

            moe010 = vtotal.divideToIntegralValue(vmoe010);
            vtotal = vtotal.subtract(moe010.multiply(vmoe010));

            moe005 = vtotal.divideToIntegralValue(vmoe005);
            vtotal = vtotal.subtract(moe005.multiply(vmoe005));

            moe001 = vtotal.multiply(vnota100);

            System.out.printf("NOTAS:\n");
            System.out.printf("%.0f nota(s) de R$ 100.00\n", nota100);
            System.out.printf("%.0f nota(s) de R$ 50.00\n", nota50);
            System.out.printf("%.0f nota(s) de R$ 20.00\n", nota20);
            System.out.printf("%.0f nota(s) de R$ 10.00\n", nota10);
            System.out.printf("%.0f nota(s) de R$ 5.00\n", nota5);
            System.out.printf("%.0f nota(s) de R$ 2.00\n", nota2);

            System.out.printf("MOEDAS:\n");
            System.out.printf("%.0f moeda(s) de R$ 1.00\n", moe100);
            System.out.printf("%.0f moeda(s) de R$ 0.50\n", moe050);
            System.out.printf("%.0f moeda(s) de R$ 0.25\n", moe025);
            System.out.printf("%.0f moeda(s) de R$ 0.10\n", moe010);
            System.out.printf("%.0f moeda(s) de R$ 0.05\n", moe005);
            System.out.printf("%.0f moeda(s) de R$ 0.01\n", moe001);

        }


    }
}

