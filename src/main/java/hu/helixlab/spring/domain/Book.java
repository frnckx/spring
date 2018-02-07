package hu.helixlab.spring.domain;
import javax.annotation.Generated;
import javax.persistence.*;
import com.sun.javafx.beans.IDProperty;

@Entity
public class Book {
@Id
@GeneratedValue
    private Integer id;
    private String name;
    private String isbn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
