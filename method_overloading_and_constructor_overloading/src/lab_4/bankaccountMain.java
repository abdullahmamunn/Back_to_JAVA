/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_4;

/**
 *
 * @author Abdullah
 */
public class bankaccountMain {
    public static void main(String[] args) {
        bankaccount b = new bankaccount("Atul",123456789,"regular",5000.500);
        bankaccount b1= new bankaccount("Atul",123456789,"regular",5000.500);
        bankaccount b2= new bankaccount("Atul",123456789,"regular",5000.505);
        System.out.println(b.compare(b1));
        System.out.println(b.compare(b2));
        System.out.println(b1.compare(b2));

    }
}
