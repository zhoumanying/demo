package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@Slf4j
public class IndexController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(HttpServletRequest request)
    {
        HttpSession session = request.getSession();
        session.setAttribute("name","hello");
        return "index12312";
    }
    @RequestMapping("/gg")
    @ResponseBody
    public String gg()
    {
        return "qqqqas12";
    }
}
