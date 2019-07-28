package com.sda.learnjava.learnjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class QuizController {

    @RequestMapping(method = RequestMethod.GET, value = "/quiz")
    public String quiz(){
        return "quiz";
    }

}
