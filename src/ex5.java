//import xerial.sqlite.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex5 {
    public static void main(String[] args) throws SQLException {
        int a = 16;
        int b = 12;
        int c = 7;
        System.out.println((a+b) / c);
        String sqlite_file = "/home/sergio.marchiori/repos/pde/pde_2022.db";
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + sqlite_file);

        Statement statement = connection.createStatement();
        statement.setQueryTimeout(30);  // set timeout to 30 sec.

        ResultSet rs = statement.executeQuery("select * from temas order by id");
        while(rs.next())
        {
            // read the result set
            System.out.println("tema = " + rs.getString("tema"));
            System.out.println("id = " + rs.getInt("id"));
        }

    }
}

