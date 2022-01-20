package com.homework2;

public class TimeTable5 {

    public static void main(String[] args) {

        int times = 5;// 5 times table using do while loop

        int f = 1;

        do {

            System.out.println(times + " * " +  (f++) + " = " + (times * f));


        }  while(f <= 20);
    }
}
