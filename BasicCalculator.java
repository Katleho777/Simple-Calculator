/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.basiccalculator;

/**
 *
 * @author OEM
 */
public class BasicCalculator {
  public static void main(String[] args) {
      double num1 = 2;
      double num2 = 4;
      String operation = "+"; //Change operation to one of these "+", "-", "*" or "/"
    
      double result = 0;
      
     switch (operation) {
   //Performs addition calculations between numbers
   case '+':
      result = add(num1, num2);
      break;
   
   //Performs subtraction calculations between numbers
   case '-':
     result = subtract(num1,num2);
     break;
   
   //Performs multiplication calculations between numbers
   case '*':
     result = multiply(num1,num2);
     break;
   
   //Performs division calculations between numbers
   case '/':
     if (num2 == 0){
     result = divide(num1,num2);
    } else {
     System.out.println("Error cannot divide by 0");
     return;
    }
    break;
   default:
     System.out.println("Error: Invalid operator!");
     return;
     }
    System.out.println("Result: " + result);
}
  public static double add(double a, double b) {
      return a + b;
  }
  public static double subtract(double a, double b) {
      return a - b;
  }
  public static double multiply(double a, double b) {
      return a * b;
  }
  public static divide(double a, double b) {
      return a / b;
  }
}
