//import xerial.sqlite.jdbc;
import java.util.Scanner;

public class ext1049 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palavra1 =  entrada.nextLine();

        System.out.printf(palavra1);

        if (palavra1 == "cachorro") {
            System.out.println("É um cachorro");
        }
        else {
            System.out.println("Não é um cachorro");
        }



    }
}

