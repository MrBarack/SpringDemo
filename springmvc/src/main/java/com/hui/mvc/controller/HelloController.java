package com.hui.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/haha", method = RequestMethod.GET)
    public String printHello(final ModelMap model){
        model.addAttribute("message",
                "Welcome to Spring MVC World!");
        return "hello";
    }

    @RequestMapping(value = "/caca", method = RequestMethod.GET)
    public ResponseEntity<String> testRest(HttpServletRequest request) {
        String test = request.getParameter("test");
        return new ResponseEntity<>(test, HttpStatus.OK);
    }
}
