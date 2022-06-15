import java.util.Scanner;

//Foi feita uma pesquisa entre os 1000 habitantes de uma região para coletar os seguintes dados: sexo (0-feminino, 1-masculino), idade e altura.
// Faça um algoritmo que leia as informações coletadas e mostre as seguintes informações: (use o comando repita-até)
//a) média da idade do grupo;
//b) média da altura das mulheres;
//c) média da idade dos homens;
//d) percentual de pessoas com idade entre 18 e 35 anos (inclusive).

public class exr_string1 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {

            String primeiro = entrada.nextLine();
            String segundo = entrada.nextLine();
            String terceiro = entrada.nextLine();

            System.out.println(primeiro+segundo+terceiro);
            System.out.println(segundo+terceiro+primeiro);
            System.out.println(terceiro+primeiro+segundo);

            if(primeiro.length()>1){
                primeiro = primeiro.substring(0,2);
            }
            if(segundo.length()>1){
                segundo = segundo.substring(0,2);
            }
            if(terceiro.length()>1){
                terceiro = terceiro.substring(0,2);
            }
            System.out.println(primeiro+segundo+terceiro);

        }
    }
}

