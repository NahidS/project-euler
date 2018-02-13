package com.nahidseidi.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class EulerProblem7 implements IEulerProblem {

   public long solve() {
      List<Long> primes = new ArrayList<Long>();
      long number = 2;
      while (primes.size() < 10001) {
         long index = 2;
         while (index < number/2) {
            while (number % index == 0) {
               index = 2;
               number ++;
               if (number % 2 == 0)
                  number++;
            }
            index++;
         }
         primes.add(number);
         number++;
         if (number % 2 == 0)
            number++;
      }
      return primes.get(10000);
   }
   
}
