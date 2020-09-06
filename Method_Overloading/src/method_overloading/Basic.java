/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_overloading;

/**
 *
 * @author Abdullah
 */
public class Basic {
    
    int a,b;
    Basic(int x, int y)
    {
        this.a = x;
        this.b = y;
        System.out.println("a = "+a+" b = "+b);
    }
    void overload()
    {
        System.out.println("a method that has empty parameter");
    }
    void overload(int a)
    {
        System.out.println("A method have a one parameter a = "+a);
    }
    void overlaod(int a, int b)
    {
        System.out.println("A overlaod method have two parameter a = "+a+" b = "+b);
    }
    double overload(double x)
    {
        return x*x;
    }
    
}
