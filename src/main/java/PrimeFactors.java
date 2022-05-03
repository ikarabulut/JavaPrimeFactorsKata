package com.ikarabulut;
import java.util.*;

public class PrimeFactors {
  
  public static ArrayList<Integer> getPrime(Integer num) {
    ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
    int divisor = 2;
    while (num > 1) {
      while (num % divisor == 0) {
        primeNumbers.add(divisor);
        num /= divisor;
      }
      divisor++;
    }
    return primeNumbers;
  }
}

