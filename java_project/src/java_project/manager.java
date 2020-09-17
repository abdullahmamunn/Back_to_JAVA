
package java_project;

import java.util.Scanner;


public class manager {
        String name = new String(new char[50]);
	String address = new String(new char[50]);
	String experience = new String(new char[50]);
	int tn;
	int id;
	int y;
	int m;
	int d;
        int ticket;
        int s;
        double time;
        Scanner integer = new Scanner(System.in);
    void managerinfo()
	{
		System.out.print("Manager name: Atul");
		System.out.print("\nManager id: 21");
		System.out.print("\nContact no: 0174......74");
		System.out.print("\n");
	}
    void customerinfo()
	{
		System.out.print("Enter customer Name: ");
		name = new Scanner(System.in).nextLine();
		System.out.print("Enter Date: ");
		System.out.print("(D:M:Y) ");
		System.out.print("\n");
		System.out.print("day: ");
		d = integer.nextInt();
		System.out.print("Month: ");
		m = integer.nextInt();
		System.out.print("Year: ");
		y = integer.nextInt();
		
		System.out.print("Enter your address: ");
		address = new Scanner(System.in).nextLine();
		System.out.print("Previous movie enjoying experience(yes/no): ");
		experience = new Scanner(System.in).nextLine();
		System.out.print("nEnter how many ticket do you want to buy?(One person can not buy more than 3 tickets at a time): ");
		tn = integer.nextInt();
                
	}
	void ticket()
	{
		ticket += 1;
		s = ticket;
	}

}
