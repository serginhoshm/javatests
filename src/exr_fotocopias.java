import java.math.BigDecimal;
import java.util.Scanner;

//5. Um guichê de fotocópias realiza descontos progressivos conforme a quantidade de cópias.
// O valor de uma fotocópia é R$ 0,15 para até 20 cópias.
// Para mais de 20 cópias o valor passa a ser 0,10.
// Para mais de 50 cópias o valor passa a ser R$ 0,08.
// Para mais de 100 cópias o valor é R$ 0,07. Quantidades acima de 200 cópias custam R$ 0,07.
// Faça um programa que possua as seguintes opções
// 1) Imprimir na tela a tabela de preços
// 2) Permita que a pessoa digite uma quantidade de cópias e exiba o valor final
// 3) Sair do programa

public class exr_fotocopias {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {

            int opcao = 0;
            int copias = 0;
            double valor = 0;
            do {
                System.out.println("Opções");
                System.out.println("1 - Imprimir tabela de preços");
                System.out.println("2 - Calcular valor final");
                System.out.println("3 - Sair");
                do {
                    System.out.println("Digite um valor");
                    opcao = entrada.nextInt();
                    if (opcao < 0 || opcao > 3) {
                        System.out.println("Opção inválida");
                        opcao = 0;
                    }
                } while(opcao < 0 || opcao > 3);

                switch (opcao) {
                    case 1:{
                        System.out.println("Tabela de preços");
                        break;
                    }
                    case 2:{
                        System.out.println("Digite a quantidade de fotocópias");
                        copias = entrada.nextInt();
                        if (copias <=20) {
                            System.out.println("Valor total: R$ " + copias * 0.15);
                        } else if (copias > 20 && copias < 50) {
                            System.out.println("Valor total: R$ " + copias * 0.15);
                        } else if (copias > 50 && copias < 100) {
                            System.out.println("Valor total: R$ " + copias * 0.15);
                        } else if (copias > 100) {
                            System.out.println("Valor total: R$ " + copias * 0.15);
                        }
                        break;
                    }
                }
            }while(opcao != 3);
        }
    }
}

