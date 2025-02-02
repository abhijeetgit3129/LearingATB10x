package if_else;

import java.util.Scanner;

public class Lab12{
    public static void main(String[]args){
        System.out.println("Enter first number:");
        Scanner sc=new Scanner(System.in);

        if(!sc.hasNextDouble()){
            System.out.println("Enter valid first number");
            return;
        }

        double number1=sc.nextDouble();


        System.out.println("Enter second number");

        Scanner sc1=new Scanner(System.in);

        if(!sc1.hasNextDouble()){
            System.out.println("Enter valid second number");
            return;
        }
        double number2=sc1.nextDouble();


        if (number1>number2){
            System.out.println("number1 is grather then  number2");
        }

        else if(number1<number2){
            System.out.println("number2 is grather then  number1");
        }

        else{
            System.out.println("number is same");
        }




    }
}