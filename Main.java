package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // This is for entering variables for the given choices
        Scanner scan = new Scanner(System.in);
        // The begging of the code which prints out the following instructions
        System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
        System.out.println(("First step: reboot your computer"));
        System.out.println("Are you able to connect with the internet? (yes or no)");
        //calling a choice 1 and letting the user enter their answer
        String choice1 = scan.nextLine();
        System.out.println(choice1);
        if (choice1.equals("no")) { //first if statement to check if the the given answer is a no
            System.out.println("Reboot the router and try to connect.");//condition for choice one
            System.out.println("Now are you able to connect with the internet? (yes or no)");//condition for choice one
        } else {
            System.out.println("Done");
            System.out.println("Programmers name: Arya Roshanaei");
        }
        String choice2 = scan.nextLine(); //Calls out a second choice
        System.out.println(choice2); // asks to wirte down a second choice
        if (choice2.equals("no")) {//nested if statement for the second condition
            System.out.println("make sure the cables to your router are plugged in firmly and your router is getting power");
            System.out.println("Now are you able to connect with the internet? (yes or no)");
        } else {
            System.out.println("Done");
            System.out.println("Programmers name: Arya Roshanaei");
        }
        String choice3 = scan.nextLine();
        System.out.println(choice3);
        if (choice3.equals("no")) {//Another condition if the anwer is no
            System.out.println("Move the computer closer to the router and try to connect");//Comment for condtion 3
            System.out.println("Now are you able to connect with the internet? (yes or no)");//Ask for the last condtion
        } else {
            System.out.println("Done");
            System.out.println("Programmers name: Arya Roshanaei");
        }
        String choice4 = scan.nextLine();//Collect the condtion
        System.out.println(choice4);
        if (choice4.equals("no")) {//last condition
            System.out.println("Contact your ISP\nDone");
        } else {// all the if statments are connected so if the user writes yes to anything it will print out the following
            System.out.println("Done");
            System.out.println("Programmers name: Arya Roshanaei");
        }

    }
}

