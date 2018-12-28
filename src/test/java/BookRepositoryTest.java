import org.junit.Test;
import org.junit.runner.RunWith;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import sun.library.Entity.Book;
import sun.library.repository.BookRepository;
import sun.server;

/**
 * @auther: SUNXIAN
 * @date: 2018-12-21
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = server.class)
@WebAppConfiguration
public class BookRepositoryTest {
    Logger logger=LoggerFactory.getLogger(BookRepositoryTest.class);

    @Autowired
    BookRepository bookRepository;

    @Test
    public  void findAll(){
     Page<Book> l=bookRepository.findAll(new PageRequest(10,1));

     logger.info("size:{}",bookRepository.count());


    }



}
