package com.example.algorithm;

import org.springframework.boot.SpringApplication;

public class Factorial {
  public static void main(String[] args) {
    SpringApplication.run(AlgorithmApplication.class, args);
    var result = factorial(4);
    System.out.println(result);
  }
  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    }

    return n * factorial(n-1);
  }
}


