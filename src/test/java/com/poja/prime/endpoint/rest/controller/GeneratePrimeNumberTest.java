package com.poja.prime.endpoint.rest.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Test;


public class GeneratePrimeNumberTest {
    
    @Test
    public void testGeneratePrime() {
        GeneratePrimeNumberController controller = new GeneratePrimeNumberController();
        BigInteger prime = controller.generatePrime();

        assertTrue("The number is not probable prime", prime.isProbablePrime(99));

        assertEquals("The number length is not 10000 bits", 5_000, prime.bitLength());
    }
}
