/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

/**
 *
 * @author danecek
 */
public class Book {

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    
    private int id;
    private String title;
    private String author;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + author + '}';
    }
    
}
