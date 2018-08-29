package com.qaconsulting.qacinemas;

import jdk.nashorn.api.tree.IfTree;

import java.util.Scanner;
//possibly use switch for day of week discount
import java.time.DayOfWeek;

public class Main{

    public static void main(String[] args) {


        System.out.println("Welcome to QA Cinemas");
        System.out.println();
        System.out.println("Please select your tickets below.");
        System.out.println();

        Scanner myScan = new Scanner(System.in);
         {
             Standard st = new Standard("st", 8);
             System.out.println("Select Standard ticket quantity ");
             int ticketquantity = myScan.nextInt();

             System.out.println("Ticket price £" + st.price * ticketquantity);


             Oap oa = new Oap("ol", 6);


             System.out.println("Select OAP ticket quantity ");
             int ticketquantity2 = myScan.nextInt();

             System.out.println("Ticket price £" + oa.price * ticketquantity2);


             Student stu = new Student("stu", 6);

             System.out.println("Select Student ticket quantity ");
             int ticketquantity3 = myScan.nextInt();

             System.out.println("Ticket price £" + stu.price * ticketquantity3);


             Child ch = new Child("ch", 4);

             System.out.println("Select Child ticket quantity ");
             int ticketquantity4 = myScan.nextInt();

             System.out.println("Ticket price £" + ch.price * ticketquantity4);

             int sum = 0, Ticket, n, i = 0;
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter quantity of tickets:");
             n = sc.nextInt();
             do {
                 System.out.print("Standard " + ":");
                 Ticket = sc.nextInt();
                 sum += Ticket *st.price ;
                 i += 1;

                 System.out.print("Oap " + ":");
                 Ticket = sc.nextInt();
                 sum += Ticket * oa.price;
                 i += 1;

                 System.out.print("Student " + ":");
                 Ticket = sc.nextInt();
                 sum += Ticket * stu.price;
                 i += 1;

                 System.out.print("Child " + ":");
                 Ticket = sc.nextInt();
                 sum += Ticket * ch.price;
                 i += 1;
             } while (i < n);
             System.out.println("The total cost of tickets for this movies comes to: £" + sum);
             System.out.println();
             System.out.println("Thank you for visiting QA Cinemas.");
         }}}






