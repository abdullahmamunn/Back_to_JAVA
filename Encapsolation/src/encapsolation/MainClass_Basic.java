/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsolation;

/**
 *
 * @author Abdullah
 */
public class MainClass_Basic {
    public static void main(String[] args) {
        Basic obj = new Basic();
        obj.set_a(10);
        System.out.println("a = "+ obj.get_a());
        obj.set_b(20);
        System.out.println("b = "+obj.get_b());
        
    }
}
