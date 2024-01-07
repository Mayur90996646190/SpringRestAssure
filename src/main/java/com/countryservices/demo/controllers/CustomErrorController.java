package com.countryservices.demo.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Custom logic or return a specific error page
        return "errorPage"; // Replace with the name of your error page
    }

    public String getErrorPath() {
        return "/error";
    }
}
