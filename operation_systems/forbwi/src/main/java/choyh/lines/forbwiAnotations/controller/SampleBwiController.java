package choyh.lines.forbwiAnotations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleBwiController {
    @GetMapping("/forbwi/a")
    public String getA(){
        return "BWI - A";
    }
}
