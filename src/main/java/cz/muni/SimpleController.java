package cz.muni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @Autowired
    private EsperService esperService;

    @RequestMapping(value = "/")
    String home() {
        return String.valueOf(new Response(esperService.returnTime()));
    }
}
