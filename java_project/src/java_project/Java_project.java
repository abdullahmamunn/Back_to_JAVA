/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah
 */
public class Java_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
   
		manager m = new manager();
		bangla_movie b = new bangla_movie();
		horror_movie h = new horror_movie();
		hindi_movie hi = new hindi_movie();
		int a;
		int a1;
                int hcnt=0;
                int bcnt=0;
                int hicnt=0;
                int total_sell = 0;
		System.out.print("-----------------------------------------------------------------------------");
		System.out.print("\n");
		System.out.print("                  ********** Welcome to Basundhara cineplex **********       ");
		System.out.print("\n");
		System.out.print("-----------------------------------------------------------------------------");
		System.out.print("\n");
		while (true)
		{
			System.out.print("                              1.Manager Info.                                ");
			System.out.print("\n");
			System.out.print("                              2.Select Movie Type.                           ");
			System.out.print("\n");
			System.out.print("                              3.Show Immediate Ticket.                                          ");
			System.out.print("\n");
                        System.out.print("                              4.Total Sell.                                          ");
			System.out.print("\n");
			System.out.print("                              5.Exit Cineplex                                               ");
			System.out.print("\n");
			System.out.print("                              $$$Select option$$$                             ");
			System.out.print("\n");
			Scanner sc= new Scanner(System.in);
			Scanner sc1= new Scanner(System.in);
                        a = sc.nextInt();
			if (a == 1)
			{
				System.out.print("                            //Manager information\\                                         ");
				System.out.print("\n");
				m.managerinfo();
			}
			else if (a == 2)
			{
				System.out.print("                           1.Horror movies.                   Prize:7000 ");
				System.out.print("\n");
				System.out.print("                           2.Hindi movies.                    Prize:6000 ");
				System.out.print("\n");
				System.out.print("                           3.Bengali movies.                  Prize:5000 ");
				System.out.print("\n");
				System.out.print("                           ##Select option##                                              ");
				System.out.print("\n");
				a1 = sc1.nextInt();
				if (a1 == 1)
				{

					System.out.print("                       (-)Horror movies(-)                                         ");
					System.out.print("\n");
					h.movie1();
					h.showinfo();
                                        hcnt++;
				}
				else if (a1 == 2)
				{

					System.out.print("                       (-)Hindi movies(-)                                         ");
					System.out.print("\n");
					hi.movie2();
					hi.showinfo();
                                        hicnt++;
				}
				else if (a1 == 3)
				{

					System.out.print("                       (-)Bangla movies(-)                                         ");
					System.out.print("\n");
					b.movie1();
					b.showinfo();
                                        bcnt++;
				}
				else
				{
					System.out.print("                            Wrong input!!!!!!                                          ");
					System.out.print("\n");
				}
                                 total_sell = bcnt + hcnt + hicnt;
			}

			else if (a == 3)
			{
                            try {
                                File file = new File("manager.txt");
                                BufferedReader br = new BufferedReader(new FileReader(file));
                                
                                String st;
                                while ((st = br.readLine()) != null)
                                    System.out.println(st); 
                            } catch (IOException ex) {
                                Logger.getLogger(Java_project.class.getName()).log(Level.SEVERE, null, ex);
                            }


			}
                        else if(a == 4)
                        {
                            System.out.println("Total sell: "+total_sell);
                        }
			else if (a == 5)
			{
				break;
			}
			else
			{
				System.out.print("                            Wrong Input!!!!!!!!!!!!                                    ");
				System.out.print("\n");
			}


		}
	}
}
