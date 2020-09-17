
package java_project;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class horror_movie extends manager {
    int price1 = 0;
    char ch;
    Scanner input = new Scanner(System.in);
    void movie1()
    {
        ticket();
        customerinfo();
    }
    void showinfo()
    {
        try{
            try (Formatter obj = new Formatter("manager.txt")) {
                switch (tn) {
                    case 1:
                        System.out.print("                     ____Horror movies____                                         ");
                        obj.format("\r\n                       ____Horror movies____                                        ");
                        System.out.print("\n");
                        System.out.print("Customer Name: Mr. ");
                        obj.format("\nCustomer name Mr. ");
                        obj.format("%s\n",name);
                        System.out.print(name);
                        System.out.print("\nDate: ");
                        obj.format("\nDate: ");
                        System.out.print(d);
                        obj.format("%s:%s:%s",d,m,y);
                        System.out.print(":");
                        
                        System.out.print(m);
                        
                        System.out.print(":");
                        
                        System.out.print(y);
                        
                        System.out.print("\n");
                        obj.format("\n");
                        System.out.print("Address: ");
                        obj.format("Address: ");
                        System.out.print(address);
                        obj.format("%s",address);
                        System.out.print("\n");
                        System.out.print("Previous Experience: ");
                        obj.format("\nPrevious Experience: ");
                        System.out.print(experience);
                        obj.format("%s",experience);
                        System.out.print("\n");
                        System.out.print("Serial no: "+ticket);
                        obj.format("\nSerial no: ");
                        obj.format("%s",ticket);
                        System.out.print("\n");
                        System.out.println("Total ticket: "+tn);
                        obj.format("\nTotal ticket: ");
                        obj.format("%s",tn);
                        
                        price1+=7000;
                        System.out.println("Total Price "+price1+" Tk.");
                        obj.format("\nTotal Price ");
                        obj.format("%s",price1);
                        obj.format(" Tk");
                        price1=0;
                        break;
                    case 2:
                        System.out.print("                     ____Horror movies____                                         ");
                        obj.format("\r\n                       ____Horror movies____                                         ");
                        System.out.print("\n");
                        System.out.print("Customer Name: Mr. ");
                        obj.format("\nCustomer name Mr. ");
                        obj.format("%s\n",name);
                        System.out.print(name);
                        System.out.print("\nDate: ");
                        obj.format("\nDate: ");
                        System.out.print(d);
                        obj.format("%s:%s:%s",d,m,y);
                        System.out.print(":");
                        
                        System.out.print(m);
                        
                        System.out.print(":");
                        
                        System.out.print(y);
                        
                        System.out.print("\n");
                        obj.format("\n");
                        System.out.print("Address: ");
                        obj.format("Address: ");
                        System.out.print(address);
                        obj.format("%s",address);
                        System.out.print("\n");
                        System.out.print("Previous Experience: ");
                        obj.format("\nPrevious Experience: ");
                        System.out.print(experience);
                        obj.format("%s",experience);
                        System.out.print("\n");
                        System.out.print("Serial no: "+ticket);
                        obj.format("\nSerial no: ");
                        obj.format("%s",ticket);
                        System.out.print("\n");
                        System.out.println("Total ticket: "+tn);
                        obj.format("\nTotal ticket: ");
                        obj.format("%s",tn);
                        price1=2*(price1+7000);
                        System.out.println("Total Price "+price1+" Tk.");
                        obj.format("\nTotal Price ");
                        obj.format("%s",price1);
                        obj.format(" Tk");
                        price1=0;
                        break;
                    case 3:
                        System.out.print("                     ____Horror movies____                                         ");
                        obj.format("\r\n                       ____Horror movies____                                        ");
                        System.out.print("\n");
                        System.out.print("Customer Name: Mr. ");
                        obj.format("\nCustomer name Mr. ");
                        obj.format("%s\n",name);
                        System.out.print(name);
                        System.out.print("\nDate: ");
                        obj.format("\nDate: ");
                        System.out.print(d);
                        obj.format("%s:%s:%s",d,m,y);
                        System.out.print(":");
                        
                        System.out.print(m);
                        
                        System.out.print(":");
                        
                        System.out.print(y);
                        
                        System.out.print("\n");
                        obj.format("\n");
                        System.out.print("Address: ");
                        obj.format("Address: ");
                        System.out.print(address);
                        obj.format("%s",address);
                        System.out.print("\n");
                        System.out.print("Previous Experience: ");
                        obj.format("\nPrevious Experience: ");
                        System.out.print(experience);
                        obj.format("%s",experience);
                        System.out.print("\n");
                        System.out.print("Serial no: "+ticket);
                        obj.format("\nSerial no: ");
                        obj.format("%s",ticket);
                        System.out.print("\n");
                        System.out.println("Total ticket: "+tn);
                        obj.format("\nTotal ticket: ");
                        obj.format("%s",tn);
                        price1=7000;
                        System.out.println("Congratulation!! you get 15% off And you get 1 ticket free.");
                        obj.format("\nCongratulation!! you get 15 percent off And you get 1 ticket free.");
                        System.out.println("Price after discount");
                        obj.format("\nAfter Discount");
                        double c =((price1*3)*15)/100;
                        System.out.println("Total Price "+c+" Tk.");
                        obj.format("\nTotal Price ");
                        obj.format("%s",c);
                        obj.format(" Tk");
                        c=0;
                        break;
                    default:
                        System.out.println("\nError!!you can not buy more than 3 tickets");
                        break;
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
       
        

    }
}
