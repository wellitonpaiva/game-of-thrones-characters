package com.thescientist.controller;

import com.thescientist.service.CharacterService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Produces;

@Controller("/character")
public class CharacterController {

    private CharacterService service;

    public CharacterController() {
        this.service = new CharacterService();
    }

    @Get("/")
    public HttpStatus index() {
        return HttpStatus.OK;
    }

    @Get("/phrase/{character}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getCharacterPhrase(String character) {
        return service.getPhrase(character);
    }
}