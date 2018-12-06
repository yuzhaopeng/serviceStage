package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-12-06T02:55:53.065Z")

@RestSchema(schemaId = "projectr4t0")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Projectr4t0Impl {

    @Autowired
    private Projectr4t0Delegate userProjectr4t0Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectr4t0Delegate.helloworld(name);
    }

}
