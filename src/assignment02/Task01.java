package assignment02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = 10;
        int y = 4;

        System.out.println(doubleIt(x)); //20
        System.out.println(doubleIt(y)); //8

        int a = add(x,y);
        System.out.println(a); //14

        int b = multiply(x,y);
        System.out.println(b); //40

        int c = subtract(x,y);
        System.out.println(c); //6

        int d = subtract(y,x);
        System.out.println(d); //6

        System.out.println(calculate(x,y,y)); //Result is 10
        System.out.println(calculate(y,x,x)); //Result is 4
        System.out.println(makeMeme()); //*genius meme face. When you finally complete one task of this assignment.

    }
}