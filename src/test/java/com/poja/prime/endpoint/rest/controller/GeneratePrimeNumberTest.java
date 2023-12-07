package com.poja.prime.endpoint.rest.controller;

import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Test;


public class GeneratePrimeNumberTest {
    
    @Test
    public void testGeneratePrime() {
        BigInteger prime = GeneratePrimeNumber.generatePrime();

        assertTrue("The number is not probable prime", prime.isProbablePrime(100));

        assertTrue("The number lenght is not 10000 bits", prime.bitLength() == 10_000);
    }
}
