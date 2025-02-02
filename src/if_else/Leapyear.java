package if_else;


import java.util.Scanner;

class Leapyear{
    public static void main(String []args) {
        System.out.print("enter your :");
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("enter valid year : ");
            return;
        }
        int leap_year = sc.nextInt();

        boolean leap_year_flage = false;


        if (leap_year <= 0) {
            System.out.println("enter valut more the zero :");
        }
        if (leap_year > 0) {



        if ((leap_year % 4 == 0 && leap_year % 100 != 0) || (leap_year % 400 == 0)) {
            leap_year_flage = true;
        }
    }
if (leap_year_flage==true){
    System.out.println("year is leap year:");

}
else{
    System.out.println("year is not leap year");
}




    }
}