package com.validator;


import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("")
    public String index(){
        return "index";
    }

    @RequestMapping("/form")
    public String form(Model model){
        model.addAttribute("customer", new Customer());
        return "spring-form";
    }

    @RequestMapping("/processForm")
    public String formConfirm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "spring-form";
        }
        else{
            return "confirm";
        }
    }
}
