package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {
    Caculator exp = new Caculator();
    @Test
    void deliverTest1(){
       int a=10;
       double expRes = 25.4;
       double result=exp.centimeter(a);
        assertEquals(expRes,result);
    }

}
