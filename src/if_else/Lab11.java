package if_else;

import java.util.Scanner;

public class Lab11 {

    public static void main(String[] args) {

        System.out.print("Enter number:");

        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextDouble()) {
            System.out.println("enter valid number");
            return;
        }

            double number = sc.nextDouble();


            if (number == 0) {
                System.out.println("number is even");


            } else if (number %2== 0) {

                System.out.println("number is even");

            } else {
                System.out.println("number is odd");
            }




    }

}
