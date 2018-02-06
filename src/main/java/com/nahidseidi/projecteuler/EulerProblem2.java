package com.nahidseidi.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class EulerProblem2 implements IEulerProblem {
   public int solve() {
      List<Integer> fibonacci = new ArrayList<Integer>();
      fibonacci.add(1);
      fibonacci.add(2);
      int index = 0;
      int sum = 0;
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
