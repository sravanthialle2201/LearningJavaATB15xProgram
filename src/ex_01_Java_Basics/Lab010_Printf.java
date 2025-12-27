package ex_01_Java_Basics;

public class Lab010_Printf {
    public static void main(String[] args) {
        System.out.println("println will add a new line");
        System.out.print("println will not add a new line");

        int a=10,b=22;
        a=18;

        System.out.println(a);
        System.out.println("the value of a is " +a);

        System.out.printf("the value of a  = %d", a);
        System.out.printf("\nthe value of a = %d and b = %d",a,b);


        //%d --> int,byte,short,long
        //%s --> string
        //%f --> float,double
        //%b --> boolean




    }
}
