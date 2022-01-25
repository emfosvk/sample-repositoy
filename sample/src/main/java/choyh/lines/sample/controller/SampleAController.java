package choyh.lines.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleAController {

    @GetMapping("/helloWorld")
    public Object helloWorld(){
        return "Hello World !!";
    }


}
