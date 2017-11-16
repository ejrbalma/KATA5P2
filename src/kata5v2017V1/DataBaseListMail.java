package kata5v2017V1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBaseListMail {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet rs;
    private final static String stringConnection = "org.sqlite.JDBC";
    private final static String urlConnection = "jdbc:sqlite:/Users/ejrbalma/GIT/BBDD/KATA.sDB";

    public static ArrayList<String> readDDBB() throws ClassNotFoundException, SQLException {

        ArrayList<String> mailList = new ArrayList<>();
        connect();

        String query = "SELECT mail from mail";
        rs = queryExecute (query);
        
        while (rs.next()) {
            if (rs.getString(1).contains("@")) {
                mailList.add(rs.getString(1));
            }
        }

        closeAll();
        return mailList;
    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName(stringConnection);
        connection = DriverManager.getConnection(urlConnection);
        statement = connection.createStatement();
    }
    
    public static void closeAll() throws SQLException {
        rs.close();
        statement.close();
        connection.close();
    }
    public static ResultSet queryExecute (String query) throws SQLException {
        return rs = statement.executeQuery(query);
    }
}
