package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class Controller {


    private final TesteInteface teste;

    @GetMapping
    public void teste(){
        teste.doStuff();
        System.out.println(teste.getClass());
    }

}
