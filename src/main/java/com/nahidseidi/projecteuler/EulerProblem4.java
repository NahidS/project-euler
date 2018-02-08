package com.nahidseidi.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class EulerProblem4 implements IEulerProblem {
   public long solve() {
      String originalNumber;
      String reversedNumber;
      List<Long> palindromeNumbers = new ArrayList<Long>();
      for (int i = 999; i >= 100 ; i--) {
         for (int j = 999; j >= 100; j--) {
            originalNumber = Integer.toString(i*j);
            reversedNumber = new StringBuilder(originalNumber).reverse().toString();
            if (originalNumber.equals(reversedNumber)) {
               palindromeNumbers.add(Long.valueOf(i*j));
            }
         }
      }
      long max = 0;
      for (int count = 0; count < palindromeNumbers.size(); count++) {
         if (palindromeNumbers.get(count) > max) {
            max = palindromeNumbers.get(count);
         }
      }
      return max;
   }
}
