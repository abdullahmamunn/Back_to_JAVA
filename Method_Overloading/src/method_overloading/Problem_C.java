
package method_overloading;

/*
Write a java program which will have a class named increment(Problem_C), a member named a and a constructor
which will assign the value to the member a. It will also have a method named incrbyten which will
return object and it will increment the value of the object by 10. Call the methods inside the main class
 */
public class Problem_C {
    int a;
    Problem_C(int a)
    {
        this.a = a;
    }
    Problem_C incrbyten() 
    {
        int b = a+10;
        Problem_C inc = new Problem_C(b);
        return inc;
    }
}
