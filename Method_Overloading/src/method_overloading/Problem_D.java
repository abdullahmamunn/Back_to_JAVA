
package method_overloading;

/*Write a java program that has a class named emp13(Problem_D) which has four members, firstname and
lastname as private members, and rate and hours as public members. The constructor will
assign value to the rate and hour member. The class also has a method named wagecalulate
which will calculate the wage of an employee by using the following hours*rate. If the employee
works more than 40 hours then the method will calculate the overtime. The overtime wage will
be 1.5 times more than the regular rate. Call the wagecalculate method in the main class.
Employee = 45 hours
Overtime= Total hours-40;
Overtime wage should be 1.5 times more than regular wage
Overtime =5 *1.5* rate
Overtime= regular time wage + Overtime wage = hours*rate+ Overtime*1.5*rate
 */
public class Problem_D {
    private String firstname;
    private String lastname;
    
    double rate,hours;
    Problem_D(double rate, double hours)
    {
        this.rate = rate;
        this.hours = hours;
    }
    
    void setName(String firstname)
    {
        this.firstname = firstname;
    }
    String getName()
    {
        return firstname;
    }
    
    void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
    String getLastname()
    {
        return lastname;
    }
    
    double wagecalulate()
    {
        double overtime,regular_hrs;
        overtime = hours - 40;
        regular_hrs = hours - overtime;
        
        if(hours>40)
        {
            return (regular_hrs*rate) + (overtime*1.5*rate);
        }
        else
        {
            return hours*rate;
        }
    }
}
