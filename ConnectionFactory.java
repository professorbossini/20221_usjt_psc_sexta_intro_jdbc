import java.sql.*;
public class ConnectionFactory {
    public static Connection getConnection () throws Exception {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/20221_usjt_psc_sexta_pessoas",
            "root",
            "1234"
        );
    }
}
