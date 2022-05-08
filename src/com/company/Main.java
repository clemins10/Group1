package com.company;
//Clemins Njong
//cnjong1@umbc.edu
public class Main {
    public static void main(String[] args) {
        //Part 1 Method
        int number1 = 10, number2 = 5;
        System.out.println("Add : 10 + 5 = " + Add(number1,number2));
        System.out.println("Subtraction : 10 - 5 = " + Subtraction(number1,number2));
        System.out.println("Multiplication : 10 * 5 = " + Multiplication(number1,number2));
        System.out.println("Division : 10/5 = " + Division(number1,number2));
    }
    public static int Add(int number1, int number2)
    {    return number1+number2;
    }
    public static int Subtraction(int number1, int number2)
    {    return number1-number2;
    }
    public static int Multiplication(int number1, int number2)
    {    return number1*number2;
    }
    public static int Division(int number1, int number2)
    {    return number1/number2;
    }
}
