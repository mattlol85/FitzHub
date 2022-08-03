package org.fitznet.doomdns.fitzhub;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Getter
@RestController
public class EggsController {
    public static String EGGS_STRING = "Eggs";

    @GetMapping("/eggs")
    public static String eggEndpoint(){
        return EGGS_STRING;
    }

    @GetMapping("/eggs/{num}")
    public static String mayEggs() {
        return EGGS_STRING;
    }
}
