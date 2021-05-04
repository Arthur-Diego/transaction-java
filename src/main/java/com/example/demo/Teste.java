package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class Teste implements TesteInteface {

    private final Classefora classefora;

    public void doStuff() {
        doTransactionStuff();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void doTransactionStuff() {
        classefora.doTransactionStuffFora();
       // System.out.println("Transaciont");
    }
}
