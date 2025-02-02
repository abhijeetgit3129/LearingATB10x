package String;

public class Lab1{
    public static void main(String[]agrs){


        String str1="abhijeet";
        String str3="waghmare";
        String str2=new String("abhijeet");
        String str4 ="tiger killer";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.equals(str2));  //equals()
        System.out.println(str1==str2);


        //charAt()

        for (int i=0;i<str1.length();i++){

            System.out.println(str1.charAt(i));
        }



        System.out.println(str1.toLowerCase());  //toLoweCase()
        System.out.println(str1.toUpperCase());  //toUpperCase()

        System.out.println(str3.charAt(4));  //charAt()
        System.out.println(str3.indexOf("a")); //indexOf()
        System.out.println(str4.replace("tiger","wagh"));


    }


}