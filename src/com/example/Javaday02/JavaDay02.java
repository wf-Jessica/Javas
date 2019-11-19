package com.example.Javaday02;
import java.util.Scanner;

public class JavaDay02 {
    public static void main(String[] args) {
        //A1
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        numero = Integer.parseInt(sc.nextLine());
        if(numero>0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }
    //A2
    double num1;
    Scanner asc = new Scanner(System.in);
    System.out.println("Enter number 1: ");
    num1= asc.nextDouble();
        if(num1==0){
        System.out.println("zero");
    }
         else if  (num1>0){
        System.out.println(num1 +" is positive number");
        if(num1>1000000){
            System.out.println(num1+ " is large positive number");
        }
        else if(num1<1) {
            System.out.println(num1 + " is small positive number");

            }
    }
        else{
            System.out.println(num1 + " is negative number");
    }
        //A3
        int nu1;
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        nu1 = Integer.parseInt(abc.nextLine());
        switch(nu1){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            case 8:
                System.out.println("Week has only 7 days");
                break;
        }
        //A4
        int nb1;
        Scanner ab1 = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        nb1 = Integer.parseInt(ab1.nextLine());
        int nb2;
        Scanner ab2 = new Scanner(System.in);
        System.out.println("Enter number 2: ");
        nb2 = Integer.parseInt(ab2.nextLine());

        if(nb1>nb2){
            System.out.println(nb1 + " is greater than " + nb2);
        }
        else {
            System.out.println(nb1 + " is less than " + nb2);
        }

        //A5
        int nb3;
        Scanner ab3 = new Scanner(System.in);
        System.out.println("Enter a number to check is even or odd: ");
        nb3 = Integer.parseInt(ab3.nextLine());

        if(nb3 %2==0){
            System.out.println(nb3 + " is even");
        }
        else {
            System.out.println(nb3 + " is odd");
        }
        //A6
        int nb4;
        Scanner ab4 = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        nb4 = Integer.parseInt(ab4.nextLine());
        int nb5;
        Scanner ab5 = new Scanner(System.in);
        System.out.println("Enter number 2: ");
        nb5 = Integer.parseInt(ab5.nextLine());
        int nb6;
        Scanner ab6 = new Scanner(System.in);
        System.out.println("Enter number 3: ");
        nb6 = Integer.parseInt(ab6.nextLine());

        if(nb4>nb5 && nb5>nb6 && nb4>nb6){
            System.out.println("The biggest one is " +nb4+","+ " the second one is " +nb5+ ","+" and the smallest one is "+nb6+",");
        }
        else if(nb4>nb5 && nb5<nb6 && nb4>nb6){
            System.out.println("The biggest one is " +nb4+","+ " the second one is " +nb6+ ","+" and the smallest one is "+nb5+",");
        }
        else if (nb5>nb4 && nb4<nb6 && nb5>nb6 ){
            System.out.println("The biggest one is " +nb5+","+ " the second one is " +nb6+ ","+" and the smallest one is "+nb4+",");
        }
        else if (nb5>nb4 && nb4>nb6 && nb5>nb6 ){
            System.out.println("The biggest one is " +nb5+","+ " the second one is " +nb4+ ","+" and the smallest one is "+nb6+",");
        }
        else if (nb6>nb4 && nb4>nb5 && nb6>nb5){
            System.out.println("The biggest one is " +nb6+","+ " the second one is " +nb5+ ","+" and the smallest one is "+nb4+",");
        }else if (nb6>nb4 && nb4<nb5 && nb6>nb5){
            System.out.println("The biggest one is " +nb6+","+ " the second one is " +nb5+ ","+" and the smallest one is "+nb4+",");
        }
    }


}
