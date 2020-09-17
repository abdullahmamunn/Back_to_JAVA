
package java_project;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class bangla_movie extends manager {
    int price3 = 0;
    char ch;
    Scanner input = new Scanner(System.in);
    void movie1()
    {
        ticket();
        customerinfo();
	System.out.print("If you watch 2 bangla movie in the same day,you can watch another bangla movie free.Do you watch 2 movie in a day?(y,n): ");
	 ch = input.next().charAt(0);
    }
    void showinfo()
    {
        if(ch == 'y')
        {
            try{
                Formatter obj = new Formatter("manager.txt");
                 System.out.print("                       ____Bangla Movie____                                         ");
                    obj.format("\r\n                      ____Bangla MOvie____                                         ");
                    System.out.print("\n");
                    System.out.print("Customer name: ");
                    obj.format("\n\"Customer name: ");
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
                    
                    System.out.print(experience);
                   
                    System.out.print("\n");
                    System.out.print("Serial no: "+ticket);
                    obj.format("\nSerial no: ");
                    obj.format("%s",ticket);
                    System.out.print("\n");
                    System.out.println("Total ticket: "+tn);
                    obj.format("\nTotal ticket: ");
                    obj.format("%s",tn);
		  
		    System.out.print("Congratulation!! you get 1 ticket free");
                    obj.format("\nCongratulation!! you get 1 ticket free");
		    System.out.print("\n");
                    
        if(tn == 1)
        {
            price3 = price3+5000;
            System.out.println("Price "+price3+"Tk.");
            obj.format("\nPrice: ");
            obj.format("%s",price3);
            price3=0;
        }
         else if(tn==2)
         {
            price3 = tn*(price3+5000);
            System.out.println("Congratulation!! you get 100 tk discount of your total amount");
            obj.format("\nCongratulation!! you get 100 tk discount of your total amount");
           
            int new_price = price3-100;
            System.out.println("Price "+new_price+" Tk.");
            obj.format("\nPrice: ");
            obj.format("%s",new_price);
            price3=0;
            new_price = 0;
         }
         else if(tn==3)
         {
            price3 = tn*(price3+5000);
            System.out.println("Congratulation!! you get 200 tk discount of your total amount");
            obj.format("\nCongratulation!! you get 200 tk discount of your total amount");
            int new_price = price3-200;
            System.out.println("Price "+new_price+" Tk.");
            obj.format("\nPrice: ");
            obj.format("%s",new_price);
            price3=0;
            new_price = 0;
         }
         else{
             System.out.println("You can't buy more than 3 tickets!!");
         }
                    obj.close();
            }
           
            catch(FileNotFoundException e)
            {
                System.out.println(e);
            }
            
        }
        else if(ch == 'n')
        {
               
            try{
                Formatter obj = new Formatter("manager.txt");
                 System.out.print("                       ____Bangla Movie____                                         ");
                    obj.format("\r\n                      ____Bangla Movie____                                         ");
                    System.out.print("\n");
                    System.out.print("Customer Name: Mr. ");
                    obj.format("\nCustomer name: ");
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
                   
                    System.out.print(experience);
                    
                    System.out.print("\n");
                    System.out.print("Serial no: "+ticket);
                    obj.format("\nSerial no: ");
                    obj.format("%s",ticket);
                    System.out.print("\n");
                    System.out.println("Total ticket: "+tn);
                    obj.format("\nTotal ticket: ");
                    obj.format("%s",tn);
	
		    System.out.print("Sorry!!You don't get that offer");
		    System.out.print("\n");
		  
                    obj.format("\nSorry!!You don't get that offer");
		    System.out.print("\n");
        if(tn == 1)
        {
            price3 = price3+5000;
            System.out.println("Price "+price3+"Tk.");
            obj.format("\nPrice: ");
            obj.format("%s",price3);
            price3=0;
        }
         else if(tn==2)
         {
            price3 = tn*(price3+5000);
            System.out.println("Congratulation!! you get 100 tk discount of your total amount");
           
            obj.format("Congratulation!! you get 100 tk discount of your total amount");
            int new_price = price3-100;
            obj.format("\nPrice: ");
            System.out.println("Price "+new_price+" Tk.");
            obj.format("%s",price3);
            price3=0;
            new_price = 0;
         }
         else if(tn==3)
         {
            price3 = tn*(price3+5000);
            System.out.println("Congratulation!! you get 200 tk discount of your total amount");
            obj.format("Congratulation!! you get 200 tk discount of your total amount");
            int new_price = price3-200;
            obj.format("\nPrice :");
            System.out.println("Price "+new_price+" Tk.");
            obj.format("%s",new_price);
            price3=0;
            new_price = 0;
         }
         else{
             System.out.println("You can't buy more than 3 tickets!!");
         }
                    obj.close();
            }
           
            catch(FileNotFoundException e)
            {
                System.out.println(e);
            }
        }
        
       
        
    }
}
