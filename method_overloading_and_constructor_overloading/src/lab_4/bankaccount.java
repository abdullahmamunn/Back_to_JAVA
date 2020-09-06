/*
 Name of the Problem: Create a java class bankaccount which will have the following members , 
name(string type) , accountid(int type), accounttype(string type) , and balance (double type). 
It will have a constructor to initialize the values. The class will have boolean method named compare which 
will have an object as a parameter and it will check if the names, account ids, account types, and balances are same 
in three bank accounts. It will print true if same names, ids, types and balances exist in the bank accounts, 
otherwise it will print false.
 */
package lab_4;

/**
 *
 * @author Abdullah
 */
public class bankaccount {
    String name;
    int accountid;
    String accounttype;
    double balance;
    bankaccount(String name, int accountid, String accounttype, double balance) {
        this.name = name;
        this.accountid = accountid;
        this.accounttype = accounttype;
        this.balance = balance;
    }
    boolean compare(bankaccount b) {
        if (b.name == name && b.accountid == accountid && b.accounttype == accounttype && b.balance == balance) {
            return true;
        } else {
            return false;
        }
    }

}
