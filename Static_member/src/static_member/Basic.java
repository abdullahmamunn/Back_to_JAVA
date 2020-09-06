/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_member;

/*Write a java program that has a class named staticexample(Basic) which has a static member , a static
method which will calculate the square root from 1 to the member’s value, a static block which
will print out “static block initialized”. Call the static method inside the main class
 */
public class Basic {
    static double a;
    static void squareroot()
    {
        double s;
        for(double i= 1;i<=10;i++)
        {
             s = Math.sqrt(i);
             System.out.println(s);
        }
    }
    static{
        System.out.println("It is a static block!");
    }
}
