package com.wufan.hellospringbootthymeleaf.controller;

import com.wufan.hellospringbootthymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = {"","index"},method = RequestMethod.GET)
    public String index(Model model){
        User user = new User();
        user.setUsername("Kirsh");
        model.addAttribute("user",user);

        return "index";
    }
}
