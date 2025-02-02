package if_else;

import java.util.Scanner;

class Lab14{
    public static void main(String[]args){
        System.out.println("enter number:");
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()){
            System.out.println("enter valid number");
        }


        int number =sc.nextInt();
        int rev_number=0;



        while(number>0){
            int a=number%10;

            rev_number=a+rev_number*10;
            number=number/10;
        }

System.out.println(rev_number);




    }

}