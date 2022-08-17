package org.fitznet.doomdns.fitzhub;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@RestController
public class FitzHubController {
    public static String VERSION = "1.0";

    @GetMapping("/fitzhub/version")
    public static String getVERSION(){
        return VERSION;
    }


}
