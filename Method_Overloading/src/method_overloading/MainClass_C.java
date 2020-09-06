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
public class MainClass_C {
    public static void main(String[] args) {
        Problem_C obj = new Problem_C(10);
        Problem_C obj1;
        obj1 = obj.incrbyten();
        Problem_C obj2 = new Problem_C(20);
        Problem_C obj3;
        obj3 = obj2.incrbyten();
        
        System.out.println(obj1.a);
        System.out.println(obj3.a);
    }
}
