/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Abdullah
 */
public class MainClass_Recursion {
    public static void main(String[] args) {
        Recursive obj = new Recursive(5);
        System.out.println("Factorial of "+obj.a+" is "+obj.fact(5));
        
        Recursive obj1 = new Recursive(10);
        System.out.println("Febonacci serise of "+obj1.a+" is "+obj1.fecbonacci(10));
        
    }
}
