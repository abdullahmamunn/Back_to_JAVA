/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Abdullah
 */
public class FormulaMain {
    public static void main(String[] args) {
        Formula obj = new Formula(new int[]{1,2,3,4,5});
        obj.analyze();
        obj.set_num(13);
        System.out.println("Value of private member is "+obj.get_num());
        
    }
}
