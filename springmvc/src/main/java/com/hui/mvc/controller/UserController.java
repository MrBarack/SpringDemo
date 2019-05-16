package com.hui.mvc.controller;

import com.hui.mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView user(){
        return new ModelAndView("input", "command", new User());
    }

    @RequestMapping(value = "/inputUser", method = RequestMethod.POST)
    public String submitUser(final User user, final ModelMap model) {
        model.addAttribute("lname", user.getLname());
        model.addAttribute("fname", user.getFname());
        model.addAttribute("gender", user.getGender());

        return "output";
    }
}
