import java.util.Scanner;

//Dados sobre o seu nome
//Criar um programa que permita ao usuário digital seu nome completo. Com esta informação produzir a seguinte saída (exemplo Pedro Álvares Cabral):
//Olá: Pedro Álvares Cabral
//Seu nome é: Pedro
//Seu sobrenome é: Cabral
//Seu nome completo possui 20 caracteres
//Seu nome completo ao contrário é: ORDEP
//Seu nome começa com a letra: P
//Seu nome termina com a letra: L
//Sua iniciais são: PAC

public class exr_string3 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {

            //String nome = entrada.nextLine();
            String nome = "Pedro Álvares Cabral";
            nome = nome.trim();




            String iniciais = "";
            for (int i=0; i<=nome.length()-1; i++) {

                System.out.println(nome.substring(i+1, i+1));
                //System.out.println(nome.charAt(i));
            }

        }
    }
}

