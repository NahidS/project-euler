package com.nahidseidi.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class EulerProblem2 implements IEulerProblem {
   public long solve() {
      List<Long> fibonacci = new ArrayList<Long>();
      fibonacci.add(1L);
      fibonacci.add(2L);
      int index = 0;
      long sum = 0;
         while (fibonacci.get(index) <= 4000000) {
            fibonacci.add(fibonacci.get(index) + fibonacci.get(index + 1));
            index++;
         }
         for (index = 0; index < fibonacci.size(); index++) {
            if (fibonacci.get(index) % 2 == 0) {
               sum += fibonacci.get(index);
            }
         }
      return sum;
   }
   
}
