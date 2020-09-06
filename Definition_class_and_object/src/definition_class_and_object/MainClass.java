/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package definition_class_and_object;

/**
 *
 * @author Abdullah
 */
public class MainClass {
    public static void main(String[] args) {
        triangle obj = new triangle();  // we created object of triangle class
        obj.x = 4.5;
        obj.y = 5.5; //Here we set the value of x and y.
        
        System.out.println("hypotenuse of triangle is "+obj.calculate());
                               ///here we print the result
    }
}
