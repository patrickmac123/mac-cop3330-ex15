package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 15 Solution
 *  Copyright 2021 Patrick Mac
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Username: ucf \t Password: abc$123");
        System.out.print( "Username: ");
        String username = scan.nextLine();
        System.out.print( "Password: ");
        String password = scan.nextLine();

        if(username.equals("ucf") && password.equals("abc$123"))
        {
            System.out.println( "Welcome!");

        }
        else
        {
            System.out.println( "I don't know you.");
        }




    }
}