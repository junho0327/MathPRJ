package kopo.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller public class MathController {
    @RequestMapping("/dashboard")
    public String dashboard() {
        return "index";
    }
}

