package com.techolution.bootcamp.springbootwebmvc;

/**
 * Created by Avinash on 06-11-2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}