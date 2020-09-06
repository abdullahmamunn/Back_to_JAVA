
package assignment;

public class Formula {
    int a[];
    private int num;
    Formula(int a[])
    {
        this.a = a;
    }
    void set_num(int num)
    {
        this.num = num;
    }
    int get_num()
    {
        return num;
    }
    static class inner1
    {
        static int a;
        static int b;
        static int gcd(int a,int b)
        {
            if(b!=0)
            {
               return gcd(b,a%b);   
            }
            else
            {
                return a;
            }
        }
    }
    class inner2
    {
        void factorial()
        {
            int fact;
            for(int i=0;i<a.length;i++)
            {
                fact = 1;
                for(int j=1;j<=a[i];j++)
                {
                    fact = fact*j;
                }
                System.out.println("Factorial of "+a[i]+"! is = "+fact);
            }
        }
    }
    void analyze()
    {
        inner1 ob = new inner1();
        System.out.println("G.C.D. is "+ob.gcd(12,36));
        inner2 ob2 = new inner2();
        ob2.factorial();
    }
}
