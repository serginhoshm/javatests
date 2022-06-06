//import xerial.sqlite.jdbc;

public class ex7 {
    public static void main(String[] args) {
        int a = 12;
        int b = 12;
        int c = 7;
        if (a==b) {
            System.out.println("A é igual a B");
        }
        else {
            System.out.println("A não é igual a B");
        }

        if (a==c) {
            System.out.println("A é igual a C");
        }
        else {
            System.out.println("A não é igual a C");
        }

        if (b==c) {
            System.out.println("B é igual a C");
        }
        else {
            System.out.println("B não é igual a C");
        }

        //Sou um usuário que comitou este fonte pela primeira vez



        //System.out.println((a+b) / c);
        //String sqlite_file = "/home/sergio.marchiori/repos/pde/pde_2022.db";
        //Connection connection = DriverManager.getConnection("jdbc:sqlite:" + sqlite_file);

        //Statement statement = connection.createStatement();
        //statement.setQueryTimeout(30);  // set timeout to 30 sec...

        //ResultSet rs = statement.executeQuery("select * from temas order by id");
        /*while(rs.next())
        {
            // read the result set
            System.out.println("tema = " + rs.getString("tema"));
            System.out.println("id = " + rs.getInt("id"));
            // só um comentário de novo

        @olist colocou uma linha aqui - olist editou de novo
        

        }*/


    }
}

