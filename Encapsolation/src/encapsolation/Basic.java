/*
 Write a java program which has a class that has two private members a and b. The class has setter and
 getter method to access the private members. Call the methods inside the main class and print the
 values of a and b.
*/
package encapsolation;

/**
 *
 * @author Abdullah
 */
public class Basic {
    private int a;
    private int b;
    
    void set_a(int a)
    {
        this.a = a;
    }
    int get_a()
    {
        return a;
    }
    void set_b(int b)
    {
        this.b=b;
    }
    int get_b()
    {
        return b;
    }
}
