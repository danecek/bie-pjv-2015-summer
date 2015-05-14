/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.logging.Logger;

import org.apache.derby.jdbc.EmbeddedDataSource40;

/**
 *
 * @author danecek
 */
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        EmbeddedDataSource40 ds = new EmbeddedDataSource40();
        ds.setCreateDatabase("create");
        ds.setDatabaseName("/home/users/d/danecek/biepjvdb");
        Connection con = ds.getConnection();
        DatabaseMetaData md = con.getMetaData();
        ResultSet rs = md.getTables(null, null, "BOOKS", null);
        Statement s = con.createStatement();
        if (!rs.next()) {
            s.executeUpdate("CREATE TABLE BOOKS"
                    + "(ID INT NOT NULL GENERATED ALWAYS AS IDENTITY,"
                    + "TITLE   VARCHAR(50),"
                    + "AUTHOR  VARCHAR(50),"
                    + "PRIMARY KEY (ID))");
            Logger.getAnonymousLogger().info("Table BOOKS was generated");
            //    s.executeUpdate("INSERT INTO BOOKS VALUES(DEFAULT, '80 days', 'Jules Verne')");
        }
        
        BooksDAO booksDAO = new BooksDAO(con);
        booksDAO.createBook("May", "Macha");
        Collection<Book> books = booksDAO.getAll();
        System.out.println(books);
////        s.executeUpdate("INSERT INTO BOOKS VALUES(DEFAULT, '80 days', 'Jules Verne')");
//        rs = s.executeQuery("SELECT * FROM BOOKS");
//        while (rs.next()) {
//            System.out.printf("%d Title: %s, Author: %s\n", rs.getInt(1), rs.getString(2), rs.getString(3));
//        }
//        // TODO code application logic here
    }

}
