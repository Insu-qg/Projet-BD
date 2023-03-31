package fr.uga.l3miage.photonum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
@ComponentScan({"com.seic.deliveryautomation.mapper"})
public class PhotoNumApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoNumApplication.class, args);
    }

}