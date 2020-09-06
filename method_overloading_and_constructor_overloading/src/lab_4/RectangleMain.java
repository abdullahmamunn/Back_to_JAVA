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
public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(45.55);
        Rectangle r2 = new Rectangle(12.12, 20.20);
        System.out.println(" Area of the rectangle: " + r.area());
        System.out.println(" perimeter of the rectangle: " + r.perimeter());
        System.out.println(" diagonal of the rectangle:" + r.diagonl());
        System.out.println(" Area of the rectangle1: " + r1.area());
        System.out.println(" perimeter of the rectangle1: " + r1.perimeter());
        System.out.println(" diagonal of the rectangle1:" + r1.diagonl());
        System.out.println(" Area of the rectangle2: " + r2.area());
        System.out.println(" perimeter of the rectangle2: " + r2.perimeter());
        System.out.println(" diagonal of the rectangle2:" + r2.diagonl());

    }
}
