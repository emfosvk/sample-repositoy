package choyh.lines.forcmsAnotations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleCmsController {
    @GetMapping("/forcms/a")
    public String getA(){
        return "CMS - A";
    }
}
