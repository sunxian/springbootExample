package sun.library.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import sun.library.Entity.Book;

import java.util.stream.Stream;

/**
 * @auther: SUNXIAN
 * @date: 2018-12-14
 */


public interface BookRepository extends JpaRepository<Book,Long>{

    long countByAuthor(String author);

    Stream<Book> findByName(String name);
 }
