package com.thescientist.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/character")
public class CharacterController {

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}