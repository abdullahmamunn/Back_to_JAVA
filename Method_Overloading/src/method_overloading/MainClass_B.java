
package method_overloading;

/**
 *
 * @author Abdullah
 */
public class MainClass_B {
    public static void main(String[] args) {
        Problem_B obj = new Problem_B(10,12);
        Problem_B obj1 = new Problem_B(10,112);
        
        System.out.println(obj.equal(obj1));
        
    }
}
