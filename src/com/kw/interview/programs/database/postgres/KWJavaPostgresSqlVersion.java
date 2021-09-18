package com.kw.interview.programs.database.postgres;

import java.sql.*;

/**
 * This class helps to connect, read the information
 * from PostgreSQL database.
 */
public class KWJavaPostgresSqlVersion {

    /**
     * This method helps to execute the program.
     * @param args
     */
    public static void main(String[] args) {
        String url = "jdbc:postgresql://172.21.64.1/postgres";
        String user = "postgres";
        String password = "sample";

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select version()");
            if (rs.next()) {
                System.out.println(rs.getString(1));
            }
            // Retrieve the authors records
            displayAuthors(con);

            // Retrieve the books records
            displayBooks(con);

            // Retrieve the books and authors records
            displayBookAuthors(con);

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method helps to retrieve authors information.
     * @param con
     * @throws SQLException
     */
    private static void displayAuthors(Connection con) throws SQLException {
        PreparedStatement pst = con.prepareStatement(
                "select * from userservice.authors");
        ResultSet rs = pst.executeQuery();
        System.out.println("*** Displaying Authors Information ***");
        while (rs.next()) {
            System.out.print(rs.getInt(1));
            System.out.print("::");
            System.out.println(rs.getString(2));
        }
    }
    /**
     * This method helps to retrieve books information.
     * @param con
     * @throws SQLException
     */
    private static void displayBooks(Connection con) throws SQLException {
        PreparedStatement pst = con.prepareStatement(
                "select * from userservice.books");
        ResultSet rs = pst.executeQuery();
        System.out.println("*** Displaying Books Information ***");
        while (rs.next()) {
            System.out.print(rs.getInt(1));
            System.out.print("::");
            System.out.print(rs.getInt(2));
            System.out.print("::");
            System.out.println(rs.getString(3));
        }
    }
    /**
     * This method helps to retrieve books and authors information.
     * @param con
     * @throws SQLException
     */
    private static void displayBookAuthors(Connection con) throws SQLException {
        PreparedStatement pst = con.prepareStatement(
                "select b.id, a.id, a.name, b.title from userservice.books b\n" +
                        "inner join userservice.authors a on b.author_id = a.id");
        ResultSet rs = pst.executeQuery();
        System.out.println("*** Displaying Books & Authors Information ***");
        while (rs.next()) {
            System.out.print(rs.getInt(1));
            System.out.print("::");
            System.out.print(rs.getInt(2));
            System.out.print("::");
            System.out.print(rs.getString(3));
            System.out.print("::");
            System.out.println(rs.getString(4));
        }
    }
}
