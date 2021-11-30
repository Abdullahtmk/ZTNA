package jdbc;

import java.sql.*;

public class PostgreSQL {
    private Connection connection;

    private void connect(String url, String userName, String password) {
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            this.connection = connection;

            if (connection != null)
                System.out.println("Connection to database successful");
            else
                System.out.println("Failed to connect to database");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void executeSQL(String sql) throws SQLException {
        try {
            Statement statement = connection.createStatement();
            Boolean executed = statement.execute(sql);
            System.out.println("Statement: "+sql+" executed successfully.");

        } catch (SQLException throwables) {
            System.out.println("Statement: "+sql+" not executed.");
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/demo_db_one";
        String userName = "postgres";
        String password = "admin";

        PostgreSQL postgreSQL = new PostgreSQL();
        postgreSQL.connect(url, userName, password);

        String sqlStatement = "INSERT INTO contacts (first_name, last_name, email) VALUES ('here', 'there', 'ht@gmail.com');";

        postgreSQL.executeSQL(sqlStatement);
    }
}
