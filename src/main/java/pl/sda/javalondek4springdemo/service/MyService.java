package pl.sda.javalondek4springdemo.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.sda.javalondek4springdemo.repository.MyRepository;

@Service
public class MyService {
    private  static  final Logger logger = LoggerFactory.getLogger(MyService.class);


    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
}
