package sun.library.Entity;


import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String author;
  private String description;
  private String pic;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getPic() {
    return pic;
  }

  public void setPic(String pic) {
    this.pic = pic;
  }

}
