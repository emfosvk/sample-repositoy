package choyh.lines.custmannotations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/sample/a")
    public String getA(){
        return "A";
    }
}
