package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectr4t0 {

        Projectr4t0Delegate projectr4t0Delegate = new Projectr4t0Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectr4t0Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}