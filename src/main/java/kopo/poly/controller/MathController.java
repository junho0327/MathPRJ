package kopo.poly.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MathController {

    @GetMapping("/")
    public String main(){

        return "index";
    }
}
