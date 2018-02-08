package com.nahidseidi.projecteuler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EulerProblem1 ep1 = new EulerProblem1();
       System.out.println(ep1.solve());
       EulerProblem2 ep2 = new EulerProblem2();
       System.out.println(ep2.solve());
       EulerProblem3 ep3 = new EulerProblem3();
       System.out.println(ep3.solve());
       EulerProblem4 ep4 = new EulerProblem4();
       System.out.println(ep4.solve());
    }
}
