import java.util.Scanner;

//3. Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem pares. Termine a leitura se o usuário digitar zero (0).

public class exr_pareslidos {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {

            int valor = 0;
            int acum = 0;

            do {
                System.out.println("Digite um valor");
                valor = entrada.nextInt();

                if (valor / 2 == 0)
                    acum += valor;

            } while(valor == 0);
            System.out.println("Soma dos números pares " + valor);

        }
    }
}

