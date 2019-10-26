package com.nahidseidi.projecteuler;

public class EulerProblem1 implements IEulerProblem {
   
   public Object solve() {
      long sum = 0;
      for (long i = 0; i < 1000; i++) {
         if(i % 3 == 0 || i % 5 == 0) 
            sum += i; 
      }
      return sum;
   }
}
