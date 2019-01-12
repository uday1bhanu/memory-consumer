package com.uday.memoryconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Vector;

@RestController
public class MemoryConsumerController {
    Vector v = new Vector();
    private static final int memorySize = 104857600;

    @RequestMapping(value = "/consume", method = RequestMethod.GET)
    public String consume(){
        byte b[] = new byte[memorySize];
        v.add(b);
        Runtime rt = Runtime.getRuntime();
        System.out.println( "free memory: " + rt.freeMemory() );
        return "Total Consumed "+ memorySize*v.size() +" | Total Free Memory: " +rt.freeMemory();
    }

    @RequestMapping(value = "/release", method = RequestMethod.GET)
    public String release(){
        int size = v.size();
        Runtime rt = Runtime.getRuntime();

        if(size>0) {
            v.remove(size - 1);
            System.out.println("free memory: " + rt.freeMemory());
            return "Total Consumed "+ memorySize*v.size() + " | Total Free Memory: " + rt.freeMemory();
        }
        else{
            return "Nothing to release!";
        }
    }
}
