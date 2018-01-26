package repository;

import java.sql.*;
import java.sql.SQLException;

public class JdbcConnexion {

  Connection conn = null;
  Statement stmt = null;

  public JdbcConnexion() {


    try

    {
      String DB_USER = "root";
      String DB_PASSWORD = "root";
      String DB_CONNECTION = "jdbc:mysql://localhost:8889/electrecityWatcher";

      Class.forName("com.mysql.jdbc.Driver").newInstance();
      conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
      stmt = conn.createStatement();
      System.out.println("Connection established");
    } catch (Exception e)

    {

      System.out.println("Cannot connect to database server");
      e.printStackTrace();

    }

  }

  public void insertRequeteSQL(String requeteSQL) {
    try {
      stmt.executeUpdate(requeteSQL);
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }

  }

  public ResultSet selectRequeteSQL(String requeteSQL) throws SQLException {
    return stmt.executeQuery(requeteSQL);
  }

}



