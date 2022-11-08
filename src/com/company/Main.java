package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (var sc = new Scanner(System.in)) {

        System.out.print("Enter a numeric value: ");
        var d1 = sc.nextDouble();

        System.out.print("Enter a numeric value: ");
        var d2 = sc.nextDouble();

        System.out.print("+ - / * ");
        String d3 = sc.next();


        switch(d3){
            case "+":
            double resultPlus = d1 + d2;
            System.out.println("The answer is " + resultPlus);
            break;
            case "-":
            double resultMinus = d1 - d2;
            System.out.println("The answer is " + resultMinus);
            break;
            case "*":
            double resultMultiple = d1 * d2;
            System.out.println("The answer is " + resultMultiple);
            break;
            case "/":
            double resultDivide = d1 / d2;
            System.out.println("The answer is " + resultDivide);
            break;

        }
    
            
        }  catch(InputMismatchException e){
            e.printStackTrace();
            System.out.println("token does not match the Float regular expression!!! " + e.getMessage());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("I dont know what happened");
        }

        
        };

       


    }



