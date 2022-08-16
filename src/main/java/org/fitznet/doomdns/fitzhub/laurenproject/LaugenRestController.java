package org.fitznet.doomdns.fitzhub.laurenproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
public class LaugenRestController {

    @GetMapping("/laugen")
    public String laugenEndpoint() {

        return "Laugen v 1.0";
    }

    @GetMapping("/laugen/{num}")
    public String param() {
        return "Laugen";
    }

    @GetMapping("/laugen/daily")
    public String dayLaugen() {
        PhraseGenerator pg = new PhraseGenerator();

        return pg.getCompletedPhrase();
    }

        @GetMapping("/laugen/test")
        public void test() {
            File testFile = new File("petNames.json");
            try {
                testFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
