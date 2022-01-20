package com.homework2;

public class whileLoopEvenAndOddNumber {

    public static void main(String[] args) {

        int e = 1; // to print 10 even number using while loop

        while (e < 20) {

            if (e % 2 == 0) {

                System.out.println(e);

            }
            e++;
        }

        int o = 1;// to print odd number

        while (o < 20) {

            if (o % 2 == 1) {

                System.out.println(o);

            }

            o++;
        }
    }

}