package com.ikarabulut;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PrimeFactorsTest {
  @Test
  void testThatJunitWorks() {
    assertEquals(true, true);
  }
  
  @Test
  void testThat2Returns2() {
    ArrayList<Integer> prime = PrimeFactors.getPrime(2);
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(2);
    assertEquals(expected, prime);
  }

  @Test
  void testThat3returns_3() {
    ArrayList<Integer> prime = PrimeFactors.getPrime(3);
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(3);
    assertEquals(expected, prime);
  }
  
  @Test
  void testgetPrime_4Is2_2() {
    ArrayList<Integer> prime = PrimeFactors.getPrime(4);
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(2);
    expected.add(2);
    assertEquals(expected, prime);
  }

  @Test
  void testGetPrime_6Is_2_3() {
    ArrayList<Integer> prime = PrimeFactors.getPrime(6);
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(2);
    expected.add(3);
    assertEquals(expected, prime);
  }
  
  @Test
  void testGetPrime8Is2_2_2() {
    ArrayList<Integer> prime = PrimeFactors.getPrime(8);
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(2);
    expected.add(2);
    expected.add(2);
    assertEquals(expected, prime);
  }

  @Test
  void testGetPrime9Is3_3() {
    ArrayList<Integer> prime = PrimeFactors.getPrime(9);
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(3);
    expected.add(3);
    assertEquals(expected, prime);
  }
  
  @Test
  void testGetPrimeAcceptanceTest() {
    ArrayList<Integer> prime = PrimeFactors.getPrime(2*3*4*4);
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(2);
    expected.add(3);
    expected.add(4);
    expected.add(4);
    assertEquals(expected, prime);
  }

}
