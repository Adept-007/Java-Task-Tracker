import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/tasktracker";

    private static final String USER = "root";

    private static final String PASSWORD = "Project1@";

    public static Connection getConnection() {

        try {

            Connection conn =
                    DriverManager.getConnection(
                            URL,
                            USER,
                            PASSWORD
                    );

            System.out.println("Connected to DB!");

            return conn;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
