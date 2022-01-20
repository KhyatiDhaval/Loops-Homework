package com.homework2;

public class DoWhileLoopTimesTable {
    public static void main(String[] args) {


        int number = 12;// do while loop
        int t = 1;

        do{

            int i = number * t;
            System.out.println(number + " * " + (t++) + " = " + i );

        } while (t <= 20);


    }
}