package if_else;

import java.util.Scanner;

class Lab15{
    public static void main(String[]args){
        System.out.print("enter number:");
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()){
            System.out.println("enter valid number");
        }


        int number =sc.nextInt();
        int rev_number=0;
        int am_nmber=number;


        while(number>0){
            int a=number%10;

            rev_number=(a*a*a)+rev_number;


            number=number/10;
        }

        if(am_nmber==rev_number){
            System.out.println("number is amstrong:");
        }

        else {
            System.out.println("number is not amstrong:");
        }
    System.out.println(rev_number+":rev_nmber");
        System.out.println(am_nmber+":am_nmber");

    }

}
