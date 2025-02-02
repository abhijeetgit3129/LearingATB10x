package if_else;

public class Lab9 {

    public static void main(String[]args){
        System.out.print("tiger\n");
        System.out.print("\nabhi\n");

        String s= "abhIJeet";
        System.out.println(s);
        System.out.println(s.charAt(0));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        for (int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));

        }

        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.println(s.charAt(i));

        }

    }
}
