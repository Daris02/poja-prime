package com.poja.prime.endpoint.rest.controller;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poja.prime.PojaGenerated;

@PojaGenerated
@RestController
public class GeneratePrimeNumberController {

    @GetMapping("/new-prime")
    public BigInteger generatePrime() {
        SecureRandom random = new SecureRandom();

        return new BigInteger(2_500, 99, random);
    }
}
