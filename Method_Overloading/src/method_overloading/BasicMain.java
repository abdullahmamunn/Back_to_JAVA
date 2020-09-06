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
public class BasicMain {
    public static void main(String[] args) {
        Basic obj = new Basic(5,10);
        obj.overload();
        obj.overload(10);
        obj.overlaod(5, 10);
        System.out.println("Square is "+obj.overload(3.33));
    }
}
