package if_else;

import java.util.Scanner;

public class Lab13{
    public static void main(String[]args){

        System.out.println("enter char:");

        Scanner sc=new Scanner(System.in);




        char c = sc.next().charAt(0);

        c=Character.toLowerCase(c);

       if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
       {
           System.out.println(c+"is a Vowel");

       }

       else {
           System.out.println(c+"is a Consonant");
       }










    }

}