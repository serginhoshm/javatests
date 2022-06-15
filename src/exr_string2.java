import java.util.Scanner;

//Trângulo de letras
//Criar um programa que receba uma entrada string do usuário, e seja capaz de reescrever a palavra, letra por letra, uma linha de cada vez
//Se a string tiver espaços, substitua os mesmos por asterísco (*)
//Exemplo de entrada: la casa de papel
//Exemplo de saída:
//l
//la
//la*
//la*c
//la*ca
//la*cas
//la*casa
//la*casa*
//la*casa*d
//la*casa*de
//la*casa*de*
//la*casa*de*p
//la*casa*de*pa
//la*casa*de*pap
//la*casa*de*pape
//la*casa*de*papel


public class exr_string2 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {

            //String roma = entrada.nextLine();
            String roma = "la casa de papel";
            roma = roma.replace(" ", "*");
            for (int i=1; i<=roma.length(); i++) {
                System.out.println(roma.substring(0, i));
            }

        }
    }
}

