package if_else;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[]Tiger){
       System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

            if (a % 2 == 0) {
                System.out.println(a + ":is even number");

            } else {
                System.out.println(a + ": is a odd number");
            }

        int b=90;
        if(b==9) {
            System.out.println("false");
        } else if (b==901) {
            System.out.println("true");

        } else if (b==0) {
            System.out.println("hm");

        } else
        {
            System.out.println("tiger");
        }


    }

}
