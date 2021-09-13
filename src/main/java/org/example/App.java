package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");

        System.out.println("Hello, " + scanner.nextLine() + ", nice to meet you!");
        scanner.close();
    }
}
