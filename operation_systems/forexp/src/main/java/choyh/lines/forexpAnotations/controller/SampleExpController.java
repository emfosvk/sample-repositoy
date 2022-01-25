package choyh.lines.forexpAnotations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleExpController {
    @GetMapping("/forexp/a")
    public String getA(){
        return "EXP - A";
    }
}

