import java.util.Scanner;

//Dados da frase
//Criar um programa que forneça ao usuário as seguintes opções:
//1-Digitar uma nova palavra ou frase
//2-Procurar letra
//3-Busca
//4-Informações
//5-Sair
//O programa irá operar com uma palavra/frase por vez
//O usuário poderá trocar a palavra/frase usando a opção 1
//Ao procurar uma letra, permita que a pessoa digite uma letra (considere a primeira letra do que ela digitar). Você deve responder se a letra foi encontrada ou não
//Ao realizar uma busca, permita que a pessoa digite e responda se encontrou ou não o que ela digitou
//Em informações, Exiba "A palavra/frase atual é: <palavra> e possui X caracteres".

public class exr_string4 {
    public static void main(String[] args) {
        int opcao = 0;
        String frase = "";
        String letra = "";
        String busca = "";

        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("1-Digitar uma nova palavra ou frase");
            System.out.println("2-Procurar letra");
            System.out.println("3-Busca");
            System.out.println("4-Informações");
            System.out.println("5-Sair");
            opcao = entrada.nextInt();
            entrada.nextLine(); //limpar buffer

            switch (opcao) {
                case 1: {
                    //frase automática para testes
                    //frase = "Abacaxi é bom";
                    frase = entrada.nextLine();
                    System.out.println(frase);
                    break;
                }
                case 2: {
                    letra = entrada.nextLine();
                    letra = letra.substring(0,1).toLowerCase();
                    System.out.println("Procurar letra: " + letra);
                    if (frase.toLowerCase().indexOf(letra) > -1) {
                        System.out.println("Encontrei");
                    }
                    else {
                        System.out.println("Não encontrei");
                    }
                    break;
                }
                case 3: {
                    busca = entrada.nextLine();
                    System.out.println("Buscar: " + busca);

                    if (frase.toLowerCase().indexOf(busca) > -1) {
                        System.out.println("Encontrei");
                    }
                    else {
                        System.out.println("Não encontrei");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Sua palavra/frase é -> '" + frase + "' e possui " + frase.length() + " caracteres");
                    break;
                }
            }
        } while (opcao !=5);
    }
}

