package org.fitznet.doomdns.fitzhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class FitzHubApplication {

    public static void main(String[] args) {
        SpringApplication fitzHubInstance = new SpringApplication(FitzHubApplication.class);
        fitzHubInstance.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
        fitzHubInstance.run(args);
    }

}
