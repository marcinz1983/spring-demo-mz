package pl.sda.javalondek4springdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.sda.javalondek4springdemo.exeption.BookNotFoundExeption;
import pl.sda.javalondek4springdemo.model.Book;
import pl.sda.javalondek4springdemo.repository.BookRepository;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

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

    public Book findBookById(Long id) {
        Objects.requireNonNull(id,"id parametr mustn't be null");

       var result =  bookRepository.findAllBooks()
                .stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundExeption(String.format("No Book with id: [%d]",id)));
        logger.info("from service findBookById with:[{}] is: [{}]",id, result);
        return  result;

    }
}
