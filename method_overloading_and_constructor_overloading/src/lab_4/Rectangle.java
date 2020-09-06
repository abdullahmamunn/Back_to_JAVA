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
public class Rectangle {
        double length, breadth;
    Rectangle() {
        length = 0;
        breadth = 0;
    }
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double area() {
        return length * breadth;
    }
    double perimeter() {
        return 2 * (length + breadth);
    }
    Rectangle(double len) {
        length = breadth = len;
    }
    double diagonl() {
        return Math.sqrt(length * length + breadth * breadth);
    }

}
