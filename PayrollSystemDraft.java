import java.sql.*;

public class Main {
    public static void main(String[] args) {

        // grants the access of java on MySQL database
        String url = "jdbc:mysql://localhost:3306/motorph_empdata";
        String username = "root";
        String password = "prettyjass";

        Connection connection = null;

        // try catch exception
        // code block that connects MySQL and Java Compiler to display the table in console
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from motorph_empdata.employee_records");

            // display table
            while (rs.next()) {
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%s | %s | %s | %s | %s | %s | %s | %x | %s | %x | %s | %s | %s | %s | %s | %s | %s | %s | %f |\n", rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getLong(8),rs.getString(9),rs.getLong(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getString(18),rs.getFloat(19));
            }

            rs.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
