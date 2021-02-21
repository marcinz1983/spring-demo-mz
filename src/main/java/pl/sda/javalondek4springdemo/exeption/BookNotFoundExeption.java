package pl.sda.javalondek4springdemo.exeption;

public class BookNotFoundExeption  extends RuntimeException{


    public BookNotFoundExeption() {
    }

    public BookNotFoundExeption(String message) {
        super(message);
    }

    public BookNotFoundExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public BookNotFoundExeption(Throwable cause) {
        super(cause);
    }

    public BookNotFoundExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
