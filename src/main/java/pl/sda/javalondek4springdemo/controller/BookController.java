package pl.sda.javalondek4springdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.javalondek4springdemo.model.Book;
import pl.sda.javalondek4springdemo.service.BookService;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/books")
public class BookController {

    private  static  final Logger logger = LoggerFactory.getLogger(BookController.class);


    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        logger.info("in getAllBooks method");

        return  bookService.findAllBooks();
    };

    @GetMapping("/{id}")
    public Book getBookById (@PathVariable("id") Long id){
       logger.info("finf book by id[{}]", id);

       return  bookService.findBookById(id);

    }



}
