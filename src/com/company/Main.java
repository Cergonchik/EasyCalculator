package com.company;


      import java.util.Scanner;

        public class Main
        {

            public static void main(String[] args)
            {

                Scanner num = new Scanner(System.in);

                System.out.println("Inter your first number:");
                double num1 = num.nextDouble();

                System.out.println("Choose your action(+,-,/,*.)");
                char action = num.next().charAt(0);//how to use char in scanner i found on internet

                System.out.println("Inter your two number");
                double num2 = num.nextDouble();

                char plus = '+' ;
                char minus = '-';
                char multiplication = '*';
                char division = '/';

                double equals = num1+num2;
                double equals2 = num1-num2;
                double equals3 = num1*num2;
                double equals4 = num1/num2;

                if (action==plus)
                {System.out.println("Your equals: "+ equals);}
                if (action==minus)
                {System.out.println("Your equals: "+ equals2);}
                if (action==multiplication)
                { System.out.println("Your equals: "+ equals3);}
                if (action==division)
                { System.out.println("Your equals: "+ equals4);}
            }
        }


