package com.nahidseidi.projecteuler;

public class EulerProblem5 implements IEulerProblem {

   public Object solve() {
      long number = 2520;
      for (int index = 1; index <= 20; index++) {
         if (number % index != 0) {
            number += 2;
            index = 1;
         }
      }
      return number;
   }

}
