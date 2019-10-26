package com.nahidseidi.projecteuler;

import java.util.HashSet;
import java.util.Set;

public class EulerProblem3 implements IEulerProblem {
   
   public Object solve() {
      long max = 0;
      Set<Long> factors = getPrimeFactors(600851475143L);
      for (long factor : factors) {
         if (factor > max) 
            max = factor;
      }
      return max;
   }
   
   public Set<Long> getPrimeFactors(long number) {
      Set<Long> factors = new HashSet<Long>();
      long savedNumber = number;
      long index = 2;
      while (index < savedNumber/2) {
         while (number % index == 0) {
            factors.add(index);
            number /= index;
         }
         index++;
         if (index > number)
            break;
      }
      return factors;
   }
}
