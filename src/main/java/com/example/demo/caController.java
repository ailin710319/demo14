package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class caController {
Caculator a=new Caculator();
    @RequestMapping("/centimeter")
    public double centimeter(int in)
    {
        return a.centimeter (in);
    }

}
