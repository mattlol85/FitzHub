package org.fitznet.doomdns.fitzhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class FitzHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitzHubApplication.class, args);
    }

}
