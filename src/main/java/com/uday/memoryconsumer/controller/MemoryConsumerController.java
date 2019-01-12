package com.uday.memoryconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Vector;

@RestController
public class MemoryConsumerController {
    Vector v = new Vector();

    @RequestMapping(value = "/consume", method = RequestMethod.GET)
    public String consume(){
        byte b[] = new byte[104857600];
        v.add(b);
        Runtime rt = Runtime.getRuntime();
        System.out.println( "free memory: " + rt.freeMemory() );
        return "Free Memory: " +rt.freeMemory();
    }

    @RequestMapping(value = "/release", method = RequestMethod.GET)
    public String release(){
        int size = v.size();
        v.remove(size-1);
        Runtime rt = Runtime.getRuntime();
        System.out.println( "free memory: " + rt.freeMemory() );
        return "Free Memory: " +rt.freeMemory();
    }
}
