package com.example.demo;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(HttpServletRequest request)
    {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        return name;
    }
}
