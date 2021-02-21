package pl.sda.javalondek4springdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.sda.javalondek4springdemo.model.Book;
import pl.sda.javalondek4springdemo.repository.BookRepository;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {

    private  static  final Logger logger = LoggerFactory.getLogger(BookService.class);

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {

       var resoult = bookRepository.findAllBooks();

        logger.info("number of found books : [{}]", resoult.size());
        logger.debug("result : [{}]", resoult);

        return  resoult;
    }
}
