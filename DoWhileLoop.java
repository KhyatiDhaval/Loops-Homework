package com.homework2;

public class DoWhileLoop {

    public static void main(String[] args) {

        int number = 20;// to print 10 odd number
        number = 1;
        do {
            if (number % 2 == 1)
                System.out.println(number);

            number++;
        } while (number <= 20);


        int even = 20;// to print 10 even number
        even = 1;

        do {
            if (even % 2 == 0) ;
            System.out.println(even);

            even++;
        } while (even <= 20);
    }

    }

