package com.poja.prime.endpoint.rest.controller;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poja.prime.PojaGenerated;

@PojaGenerated
@RestController
public class GeneratePrimeNumber {

    @GetMapping("/new-prime")
    public static BigInteger generatePrime() {
        SecureRandom random = new SecureRandom();

        BigInteger primeNumber = new BigInteger(10_000, 100, random);

        primeNumber = primeNumber.setBit(0);

        while (!primeNumber.isProbablePrime(100)) {
            primeNumber = primeNumber.add(BigInteger.TWO);
        }
        return primeNumber;
    }
}
