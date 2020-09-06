/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_overloading;

/*
Object as a parameter and method return type:

Write a java program which has a class named objectequal(Problem_B) that has 
two members a and b, a constructor which will assign the values to the members. 
The objectequal(Problem_B) class has a boolean method named equal
which will take object as a parameter and it will determine if two objects have the same value.
Call the methods inside the main class 
 */
public class Problem_B {
    int a,b;
    Problem_B(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    boolean equal(Problem_B ob)
    {
        if(ob.a==a && ob.b ==b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
