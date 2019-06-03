package test2;

import java.util.Scanner;

public class Clock {
     private int hours;
     private int minutes;
     private int seconds;


    public static void ora(int hours)
    {
        if(hours/5==1)
        {
            System.out.println("|");


        }
        else if (hours/5==2)
        {
            System.out.println("||");
        }
        else if(hours/5==3)
        {
            System.out.println("|||");
        }
        else
        {
            System.out.println("||||");
        }

    }
    public static void ora2(int hours)
    {
        if(hours%5==1)
        {
            System.out.println("|");

        }
         if (hours%5==2)
        {
            System.out.println("||");
        }
         if (hours%5==3) {
            System.out.println("|||");
        }
        if(hours%5==4)
        {
            System.out.println("||||");
        }

    }
    public static void minute(int minutes) {
        switch (minutes / 11) {
            case 1:
                System.out.println("O");
                break;
            case 2:
                System.out.println("O0");
                break;
            case 3:
                System.out.println("OO0");
                break;
            case 4:
                System.out.println("O000");
                break;
            case 5:
                System.out.println("O0000");
                break;
            case 6:
                System.out.println("O00000");
                break;
            case 7:
                System.out.println("O000000");
                break;
            case 8:
                System.out.println("O0000000");
                break;
            case 9:
                System.out.println("OO0000000");
                break;

            case 10:
                System.out.println("OOO0000000");
                break;
            case 11:
                System.out.println("O0000000000");
                break;

        }

    }
    public static void minute2(int minutes) {
        switch (minutes % 11) {
            case 1:
                System.out.println("O");
                break;
            case 2:
                System.out.println("O0");
                break;
            case 3:
                System.out.println("OO0");
                break;
            case 4:
                System.out.println("O000");
                break;

        }
    }

    public static void secunde(int seconds)
    {
        if(seconds%2==0)
        {
            System.out.println("Par");
        }
        else
        {
            System.out.println("Impar");
        }
    }




    public static void main(String []args){
        ora(22);
        ora2(22);
        minute(12);
        minute2(12);
        secunde(44);





        }




}

