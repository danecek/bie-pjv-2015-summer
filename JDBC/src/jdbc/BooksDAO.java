/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class BooksDAO {

    Connection conn;

    PreparedStatement getAll;
    PreparedStatement createBook;

    public BooksDAO(Connection conn) {
        this.conn = conn;
        try {
            getAll = conn.prepareStatement("SELECT * FROM BOOKS");
            createBook = conn.prepareStatement("INSERT INTO BOOKS VALUES(DEFAULT, ?, ?)");
        } catch (SQLException ex) {
            Logger.getLogger(BooksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void createBook(String title, String author) throws SQLException {
        createBook.setString(1, title);
        createBook.setString(2, author);
        createBook.executeUpdate();
    }

    Collection<Book> getAll() throws SQLException {
        ResultSet rs = getAll.executeQuery();
        List<Book> books = new ArrayList<>();
        while (rs.next()) {
            books.add(new Book(rs.getInt(1), rs.getString(2), rs.getString(3)));
        }
        return books;
    }

}
