/******************************************************************************
 *  Compilation:  javac Sqrt.java
 *  Execution:    java Sqrt c
 *  
 *  Computes the square root of a nonnegative number c using
 *  Newton's method:
 *     - initialize t = c
 *     - replace t with the average of c/t and t
 *     - repeat until desired accuracy reached
 * 
 *  % java Sqrt 2
 *  1.414213562373095
 *
 *  % java Sqrt 1000000
 *  1000.0
 *
 *  % java Sqrt 0.4
 *  0.6324555320336759
 *
 *  % java Sqrt 1048575
 *  1023.9995117186336
 * 
 *  % java Sqrt 16664444
 *  4082.2106756021303
 *
 *  % java Sqrt 0
 *  0.0
 * 
 *  % java Sqrt 1e-50
 *  9.999999999999999E-26
 *
 *
 *  Remarks
 *  ----------
 *   - using Math.abs() is required if c < 1
 *
 *
 *  Known bugs
 *  ----------
 *   - goes into an infinite loop if the input is negative
 *
 ******************************************************************************/

public class Sqrt {
    public static void main(String[] args) {
        
        double c = Double.parseDouble(args[0]); 
        double epsilon = 1e-15;
        double t = c;
        
        if (c < 0) {
            System.out.println("not support negative sqrt");
            return;
        }
        
        while(Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
  
        System.out.println(t);
    }
}