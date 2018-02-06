package com.nahidseidi.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class EulerProblem3 implements IEulerProblem {
   public int solve() {
      int max = 0;
      List<Integer> factors = getPrimeFactors(12);
      for (int factor : factors) {
         if (factor > max) 
            max = factor;
      }
      return max;
   }

   public List<Integer> getPrimeFactors(long number) {
      List<Integer> factors = new ArrayList<Integer>();
      long savedNumber = number;
      int index = 2;
      while (index < savedNumber) {
         while (number % index == 0) {
            factors.add(index);
            number /= index;
         }
         index++;
      }
      return factors;
   }
}
