package com.techolution.bootcamp.springbootwebmvc;

/**
 * Created by Avinash on 06-11-2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {

    @GetMapping("/message")
    public ModelAndView message() {

        ModelAndView model = new ModelAndView("message");
        model.addObject("message", "This is a Spring Boot app");

        return model;
    }
}