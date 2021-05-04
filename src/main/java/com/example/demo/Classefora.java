package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Classefora {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void doTransactionStuffFora() {
        System.out.println("Transaciont fora");
    }
}
