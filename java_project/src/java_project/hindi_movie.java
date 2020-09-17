
package java_project;

import java.io.FileNotFoundException;
import java.util.Formatter;


public class hindi_movie extends manager {
    int price2 = 0;
    char ch;
    void movie2()
    {
        customerinfo();
        ticket();
    }
    void showinfo()
    {
        if(tn==1)
        {
            try {
                Formatter obj = new Formatter("manager.txt");
                
                    System.out.print("                      ____Hindi Movies____                                         ");
                    obj.format("\r\n                        ____Hindi Movies____                                         ");
                    System.out.print("\n");
                    System.out.print("Customer Name: Mr. ");
                    obj.format("\nCustomer name Mr. ");
                    obj.format("%s",name);
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
                    
                    price2+=6000;
                    System.out.println("Total Price "+price2+" Tk.");
                    obj.format("\nTotal Price ");
                    obj.format("%s",price2);
                    obj.format(" Tk");
                    price2=0;
                    obj.close();
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
          
        } 
           
        else if(tn==2)
        {
            try {
                
                Formatter obj = new Formatter("manager.txt");
                    System.out.print("                      ____Hindi Movies____                                         ");
                    obj.format("\r\n                        ____Hindi Movies____                                         ");
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
                    
                    price2+=(tn*6000);
                    System.out.println("Total Price "+price2+" Tk.");
                    obj.format("\nTotal Price ");
                    obj.format("%s",price2);
                    obj.format(" Tk");
                    price2=0;
                    obj.close();
            } catch (FileNotFoundException e) {
                
                System.out.println(e);
            }
        }
        else if(tn==3)
        {
            try {
                Formatter obj = new Formatter("manager.txt");
                                    System.out.print("                      ____Hindi Movies____                                         ");
                    obj.format("\r\n                        ____Hindi Movies____                                         ");
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
                    
                    System.out.println("Congratulations!! You have got discount 100 Tk. and 2 snacs");
                    price2+=(tn*6000);
                    System.out.println("Total Price "+(price2-100)+" Tk.");
                    obj.format("\nTotal Price ");
                    obj.format("%s",price2);
                    obj.format(" Tk");
                    price2=0;
                     obj.close();
            } catch (FileNotFoundException e) {
                
                System.out.println(e);
            }
        }
        else{
            System.out.println("You can't buy more than 3 tickets!!!");
        }
        
    }
}
