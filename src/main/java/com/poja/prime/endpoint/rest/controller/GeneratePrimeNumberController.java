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

        BigInteger primeNumber = new BigInteger(10_000, 99, random);

        primeNumber = primeNumber.setBit(10_000);

        // while (!primeNumber.isProbablePrime(99)) {
        //    primeNumber = primeNumber.add(BigInteger.TWO);
        // }
        if (primeNumber.isProbablePrime(99)) {
            return primeNumber;
        } else {
            return generatePrime();
        }
    }
}
