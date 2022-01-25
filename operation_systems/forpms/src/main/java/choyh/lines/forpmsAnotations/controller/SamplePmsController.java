package choyh.lines.forpmsAnotations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SamplePmsController {
    @GetMapping("/forpms/a")
    public String getA(){
        return "PMS - A";
    }
}
