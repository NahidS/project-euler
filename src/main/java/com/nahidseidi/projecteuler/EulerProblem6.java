package com.nahidseidi.projecteuler;

public class EulerProblem6 implements IEulerProblem {
   
   public Object solve() {
      long squareOfSum = 0, sumOfSquare = 0;
      for (int number = 1; number <= 100; number++) {
         squareOfSum += number;
         sumOfSquare += (number * number);
      }
      return (squareOfSum * squareOfSum) - sumOfSquare;
   }
}
