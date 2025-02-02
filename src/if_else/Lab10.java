package if_else;


import java.util.Scanner;

public class Lab10 {

    public static void main(String[] args) {

        System.out.print("Enter number:");

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            double number = sc.nextDouble();


            if (number == 0) {
                System.out.println("Enter number less or more then 0");


            } else if (number > 0) {

                System.out.println("number is positive");

            } else {
                System.out.println("number is negative");
            }


        }
        else {
            System.out.println("Please enter numeric value");
        }

    }
}