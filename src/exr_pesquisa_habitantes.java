import java.util.Scanner;

//Foi feita uma pesquisa entre os 1000 habitantes de uma região para coletar os seguintes dados: sexo (0-feminino, 1-masculino), idade e altura.
// Faça um algoritmo que leia as informações coletadas e mostre as seguintes informações: (use o comando repita-até)
//a) média da idade do grupo;
//b) média da altura das mulheres;
//c) média da idade dos homens;
//d) percentual de pessoas com idade entre 18 e 35 anos (inclusive).

public class exr_pesquisa_habitantes {
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

