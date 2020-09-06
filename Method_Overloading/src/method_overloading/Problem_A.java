/*
 Write a java program which has a class named
Problem_A.The class has a member called test , a
constructor which will assign and print the value of
the member test, and a method named overload and it
will be used several times. First overload method
will reverse a number(suppose the number is 4562, it
will print out 2654). Second overload method will add
all the even and multiply odd digits from the member
test and print the result (suppose you have the
number 45627, here 462 are even digits, so the method
will add them (4+6+2)=12; 5 and 7 are odd digits, so
it will multiply them (5*7=45). Call the method in
the main class.
10|4652| 465 10|465| 46 % =5
4650 % = 2
reverse=0
reverse= reverse*10+digit= 0*10+2=2*10+5=
25*10+6=256*10+4=2564
 */
package method_overloading;


public class Problem_A {
    int test;
    Problem_A(int test)
    {
        this.test = test;
        System.out.println("The value of test is = "+test);
    }
    void overload(int test)
    {
        int num = test,rev=0;
        while(num!=0)
        {
            rev = rev*10 + (num%10);
            num = num/10;
        }
        System.out.println("reverse is "+rev);
    }
    void overload()
    {
        int num = test,digit=0,even_sum=0,odd_mul = 1;
        while(num!=0)
        {
            digit = num%10;
            if(digit%2==0)
            {
                even_sum = even_sum + digit;
            }
            else
            {
               odd_mul = odd_mul*digit; 
            }
            num = num/10;
        }
        System.out.println("Even digits are "+even_sum+" And odd Multiplication is "+odd_mul);
    }
}
