package choyh.lines.forwithAnotations.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleWithController {
    @GetMapping("/forwith/a")
    public String getA(){
        return "WITH - A";
    }
}
