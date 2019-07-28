package com.sda.learnjava.learnjava.controller;

import com.sda.learnjava.learnjava.dto.RegisterUserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
@RequestMapping("/")
public class RegisterController {

    @RequestMapping(method = RequestMethod.GET, value = "/register")
    public String register(Model model){
        model.addAttribute("registerUser", new RegisterUserDTO());
        return  "register";
    }



    @PostMapping(value = "/register")
    public String registerEffect(@ModelAttribute(name = "registerUser")
                                @Valid RegisterUserDTO registerUserDTO, Model model){
        return  "login";
    }


}
