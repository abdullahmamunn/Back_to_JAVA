/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/*
 Write a java program which has a class named Fibonacci. The class has A member named “A” and a
constructor which will assign the value to the “A” member and print the value. The class also has a
method named f which will use recursive method to find Fibonacci series. Call the f method inside the
main class
 */
public class Recursive {
    int a;
    Recursive(int a)
    {
        this.a=a;
        System.out.println("A = "+a);
    }
    int fact(int a)
    {
        if(a<1)
            return 1;
        else
        {
            return fact(a-1)*a;
        }
        
    }
    int fecbonacci(int a)
    {
        if(a==0)
            return 0;
        else if(a==1)
            return 1;
        else
            return (fecbonacci(a-1)+fecbonacci(a-2));
    }
    
}
